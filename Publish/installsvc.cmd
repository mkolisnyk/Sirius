GOTO PUBLISH
echo "Creating folder structure"

DEL /Q /S .\Server\*.*

rmdir .\Server

mkdir .\Server

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

echo "Preparing service installation"

copy ..\Utils\winrun4j\winrun4j.exe .\Server\sirius.exe
copy .\sirius.ico .\server\sirius.ico

cd .\Server
..\Utils\winrun4j\RCEDIT.exe /I sirius.exe sirius.ico
cd ..

echo "Registering service"

c:\windows\system32\sc.exe create Sirius type= share start= auto error= ignore binPath= D:\Work\SiriusDev\Sirius\Publish\Server\sirius.exe 

c:\windows\system32\sc.exe config Sirius DisplayName= "Sirius Test Automation Platform Server v%1" obj=%SIRIUS_USER% password=%SIRIUS_PASSWORD%

echo "Restarting service"

c:\windows\system32\sc.exe stop Sirius 4:4:4 "Planned update"
c:\windows\system32\sc.exe start Sirius
