echo "Stop service"

c:\windows\system32\sc.exe stop Sirius.Win32 4:4:4 "Planned update"
REM instsrv Sirius.Win32 REMOVE

echo "Creating folder structure"

DEL /Q /S .\Server.Win32\*.*

rmdir .\Server.Win32

mkdir .\Server.Win32

echo "Building server modules"
cd ..\SiriusCSharp.Client\Sirius.Win32.WinService

call build.cmd %1

cd ..\..\Publish
copy /Y ..\SiriusCSharp.Client\Sirius.Win32.WinService\bin\Debug\*.* .\Server.Win32\

echo "Preparing service installation"

copy .\sirius.ico .\Server.Win32\sirius.ico

echo "Registering service"

instsrv Sirius.Win32 "%CD%\Server.Win32\Sirius.Win32.WinService.exe" -a %SIRIUS_USER% -p %SIRIUS_PASSWORD%
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius.Win32 /v Description /t REG_SZ /d "Sirius Test Automation Platform Win32 Server v%1" /f
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius.Win32\Parameters /f
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius.Win32\Parameters /v AppDirectory /t REG_SZ /d %CD%\Server.Win32 /f
reg add HKLM\SYSTEM\CurrentControlSet\Services\Sirius.Win32\Parameters /v Application /t REG_SZ /d %CD%\Server.Win32\Sirius.Win32.WinService.exe /f

echo "Restarting service"

c:\windows\system32\sc.exe start Sirius.Win32
