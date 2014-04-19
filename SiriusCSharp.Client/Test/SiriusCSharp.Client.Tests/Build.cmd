REM @echo off
cd /D %CD%
C:\Windows\Microsoft.NET\Framework\v4.0.30319\MSBuild.exe BuildScript\BuildTests.msbuild
@pause