echo "Creating folder structure"

DEL /Q /S .\Java-Client\*.*
DEL /Q /S .\Ruby-Client\*.*
DEL /Q /S .\CSharp-Client\*.*

rmdir .\Java-Client
rmdir .\Ruby-Client
rmdir .\CSharp-Client

mkdir .\Java-Client
mkdir .\Ruby-Client
mkdir .\CSharp-Client

echo "Building server modules"
call installsvc.cmd %1

echo "Building Java client modules"

cd ..
call mvn -f sirius.java.client/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f sirius.java.client.core/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f sirius.java.client.web/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f sirius.java.client.win32/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
cd .\Publish
FOR /f %%i IN ('dir /B /S ..\*client*%1.jar') DO copy /Y %%i .\Java-Client

echo "Building Ruby client modules"

echo %1 1>..\sirius-ruby-client\VERSION
echo %1 1>..\sirius-ruby-client-core\VERSION
echo %1 1>..\sirius-ruby-client-win32\VERSION
echo %1 1>..\sirius-ruby-client-web\VERSION

cd ..\sirius-ruby-client\
call rake all
cd ..\Publish

cd ..\sirius-ruby-client-core\
call rake all
cd ..\Publish

cd ..\sirius-ruby-client-win32\
call rake all
cd ..\Publish

cd ..\sirius-ruby-client-web\
call rake all
cd ..\Publish
FOR /f %%i IN ('dir /B /S ..\*%1.gem') DO copy /Y %%i .\Ruby-Client

echo "Building C# client modules"

cd ..\SiriusCSharp.Client\SiriusClient
call build %1
cd ..\..\Publish
FOR /f %%i IN ('dir /B /S ..\SiriusCSharp.Client\*%1.nupkg') DO copy /Y %%i .\CSharp-Client

cd ..\SiriusCSharp.Client\Sirius.Client.Core
call build %1
cd ..\..\Publish
FOR /f %%i IN ('dir /B /S ..\SiriusCSharp.Client\*%1.nupkg') DO copy /Y %%i .\CSharp-Client

cd ..\SiriusCSharp.Client\Sirius.CSharp.Client.Web
call build %1
cd ..\..\Publish
FOR /f %%i IN ('dir /B /S ..\SiriusCSharp.Client\*%1.nupkg') DO copy /Y %%i .\CSharp-Client

cd ..\SiriusCSharp.Client\Sirius.CSharp.Client.Win32
call build %1
cd ..\..\Publish
FOR /f %%i IN ('dir /B /S ..\SiriusCSharp.Client\*%1.nupkg') DO copy /Y %%i .\CSharp-Client

echo "Publishing Java Maven artifacts"
cd ..
call mvn -f sirius.java.client/pom.xml release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.java.client-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
call mvn -f sirius.java.client.core/pom.xml release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.java.client-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
call mvn -f sirius.java.client.web/pom.xml release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.java.client-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
call mvn -f sirius.java.client.win32/pom.xml release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.java.client-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT

cd .\Publish

echo "Publishing Ruby client"
for /f %%i in ('dir /B Ruby-Client\*.gem') DO cmd /C gem push Ruby-Client\%%i

echo "Publishing C# client"
.\..\Utils\NuGet.exe Update -self
for /f %%i in ('dir /B CSharp-Client\*.nupkg') DO cmd /C .\..\Utils\NuGet.exe Push CSharp-Client\%%i

call mvn assembly:single gcu:upload -Dpackage.version=%1
