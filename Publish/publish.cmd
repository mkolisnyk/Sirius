GOTO PUBLISH
echo "Creating folder structure"

DEL /Q /S .\Server\*.*
DEL /Q /S .\Java-Client\*.*
DEL /Q /S .\Ruby-Client\*.*
DEL /Q /S .\CSharp-Client\*.*

rmdir .\Server
rmdir .\Java-Client
rmdir .\Ruby-Client
rmdir .\CSharp-Client

mkdir .\Server
mkdir .\Java-Client
mkdir .\Ruby-Client
mkdir .\CSharp-Client

echo "Building server modules"
cd ..
call mvn -f Server/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f Sirius-Server-Core/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f Sirius-Server-Win32/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f Sirius-Server-Web/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
cd .\Publish
FOR /f %%i IN ('dir /B /S ..\sirius.server*%1.jar') DO copy /Y %%i .\Server
copy ..\Server\modules.csv .\Server
copy ..\Server\log4j.xml .\Server
copy ..\Server\log4j.dtd .\Server

echo "Building Java client modules"

cd ..
call mvn -f SiriusJavaClient/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f SiriusJavaClient-Core/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f SiriusJavaClient-Web/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f SiriusJavaClient-Win32/pom_local.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom_local.xml -Dpackaging=jar -DgeneratePom=true clean package
cd .\Publish
FOR /f %%i IN ('dir /B /S ..\*client*%1.jar') DO copy /Y %%i .\Java-Client

echo "Building Ruby client modules"

echo %1 1>..\sirius-ruby-client\VERSION
echo %1 1>..\sirius-ruby-client-core\VERSION
echo %1 1>..\sirius-ruby-client-win32\VERSION
echo %1 1>..\sirius-ruby-client-web\VERSION

cd ..\sirius-ruby-client\
call rake package
cd ..\Publish

cd ..\sirius-ruby-client-core\
call rake package
cd ..\Publish

cd ..\sirius-ruby-client-win32\
call rake package
cd ..\Publish

cd ..\sirius-ruby-client-web\
call rake package
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
call mvn -f SiriusJavaClient/pom.xml release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.java.client-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
call mvn -f SiriusJavaClient-Core/pom.xml release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.client.core-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
call mvn -f SiriusJavaClient-Web/pom.xml  release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.client.web-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
call mvn -f SiriusJavaClient-Win32/pom.xml  release:clean release:prepare release:perform -Dpackage.version=%1-SNAPSHOT -Dtag=sirius.client.win32-%1 -DreleaseVersion=%1 -DdevelopmentVersion=%1-SNAPSHOT
cd .\Publish

echo "Publishing Ruby client"
for /f %%i in ('dir /B Ruby-Client\*.gem') DO cmd /C gem push Ruby-Client\%%i

echo "Publishing C# client"
.\..\Utils\NuGet.exe Update -self
for /f %%i in ('dir /B CSharp-Client\*.nupkg') DO cmd /C .\..\Utils\NuGet.exe Push CSharp-Client\%%i

call mvn assembly:single gcu:upload -Dpackage.version=%1
