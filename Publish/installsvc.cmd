echo "Stop service"

c:\windows\system32\sc.exe stop Sirius 4:4:4 "Planned update"
instsrv Sirius REMOVE

echo "Creating folder structure"

DEL /Q /S .\Server\*.*

rmdir .\Server

mkdir .\Server

echo "Building server modules"
cd ..
call mvn -f sirius.server.core/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f sirius.server.engine/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f sirius.server.web/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package
call mvn -f sirius.server.win32/pom.xml -Dpackage.version=%1 -Dversion=%1 -DpomFile=pom.xml -Dpackaging=jar -DgeneratePom=true clean package

cd .\Publish
FOR /f %%i IN ('dir /B /S ..\sirius.server*%1.jar') DO copy /Y %%i .\Server
copy ..\Server\modules.csv .\Server
copy ..\Server\log4j.xml .\Server
copy ..\Server\log4j.dtd .\Server

echo "Preparing service installation"

copy ..\Utils\winrun4j\winrun4j.exe .\Server\sirius.exe
copy .\sirius.ico .\server\sirius.ico
copy .\sirius.ini .\server\sirius.ini
echo working.directory=%CD%\Server >> .\server\sirius.ini

cd .\Server
..\Utils\winrun4j\RCEDIT.exe /I sirius.exe sirius.ico
..\Utils\winrun4j\RCEDIT.exe /A sirius.exe sirius.ico
cd ..

echo "Registering service"

instsrv Sirius "%ProgramFiles%\Windows Resource Kits\Tools\srvany.exe" -a %SIRIUS_USER% -p %SIRIUS_PASSWORD%
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius /v Description /t REG_SZ /d "Sirius Test Automation Platform Server v%1" /f
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius\Parameters /f
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius\Parameters /v AppDirectory /t REG_SZ /d %CD%\Server /f
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius\Parameters /v Application /t REG_SZ /d %CD%\Server\sirius.exe /f

echo "Restarting service"

c:\windows\system32\sc.exe start Sirius
