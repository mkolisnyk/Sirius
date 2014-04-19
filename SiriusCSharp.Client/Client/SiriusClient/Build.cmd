@echo off

IF '%1' == '' GOTO USAGE

echo "Building project for version number: %1"
SET TARGETS=Build 

IF '%2' == '' GOTO RUN

echo "Setting custom target list to: %2"
SET TARGETS=%2

:RUN
C:\Windows\Microsoft.NET\Framework\v4.0.30319\MSBuild.exe BuildScript\Build.msbuild /p:ProductVersion=%1 /t:CleanPackage /v:d

FOR /F %%i IN (..\..\.nuget\ToolsVersions.txt) DO (
	C:\Windows\Microsoft.NET\Framework\v4.0.30319\MSBuild.exe BuildScript\Build.msbuild /p:ProductVersion=%1 /t:PreparePackage /toolsversion:%%i /v:d
	IF NOT ERRORLEVEL 0 (
		echo "Some of the builds finished with error."
		goto END
	)
)

C:\Windows\Microsoft.NET\Framework\v4.0.30319\MSBuild.exe BuildScript\Build.msbuild /p:ProductVersion=%1 /t:Package /v:d

GOTO END

:USAGE

:END