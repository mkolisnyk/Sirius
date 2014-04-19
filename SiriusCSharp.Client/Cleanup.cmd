@echo off

FOR %%j IN (bin obj) DO (
	FOR /F %%i IN ('dir /B /S %%j') DO (
		RD /S /Q %%i
	)
)
@pause