call mvn assembly:single deploy -Dpackage.version=%1
REM cmd /C .\..\Utils\GCUpload.exe -u:kolesnik.nickolay@gmail.com -p:%GC_PASS% -s:"Publishing %1 release" -f:target\Sirius-%1-release.zip -n:sirius-platform

echo "Publishing Ruby client"

for /f %%i in ('dir /B Ruby-Client\*.gem') DO cmd /C gem push Ruby-Client\%%i

echo "Publishing C# client"

.\..\Utils\NuGet.exe Update -self
for /f %%i in ('dir /B CSharp-Client\*.nupkg') DO cmd /C .\..\Utils\NuGet.exe Push CSharp-Client\%%i
