IF NOT EXIST .\Packages md .\Packages
..\..\..\Utils\nuget.exe install .\packages.config -OutputDirectory .\Packages -ExcludeVersion
@pause