@echo off

IF '%1' == '' GOTO USAGE

echo "Building project for version number: %1"
SET TARGETS=Build 

IF '%2' == '' GOTO RUN

echo "Setting custom target list to: %2"
SET TARGETS=%2

:RUN
C:\Windows\Microsoft.NET\Framework\v4.0.30319\MSBuild.exe BuildScript\Build.msbuild /p:ProductVersion=%1 /t:%TARGETS%
GOTO END

:USAGE

:END