@echo off
FOR %%i IN (bin obj) DO RD /S /Q .\%%i
FOR %%i IN (lib content tools) DO (
	RD /S /Q .\%%i
	MD .\%%i
)
DEL /F /Q *.bak
DEL /F /Q *.nupkg