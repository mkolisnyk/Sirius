SET VSINSTALLDIR=D:\vs
SET VCINSTALLDIR=%%VSINSTALLDIR%%\VC
SET VS100COMNTOOLS=%%VSINSTALLDIR%%\Common7\Tools\

SET LIB=%%VCINSTALLDIR%%\LIB;%%VCINSTALLDIR%%\ATLMFC\LIB;C:\Program Files\Microsoft SDKs\Windows\v7.0A\lib;
SET LIBPATH=C:\Windows\Microsoft.NET\Framework\v4.0.30319;C:\Windows\Microsoft.NET\Framework\v3.5;%%VCINSTALLDIR%%\LIB;%%VCINSTALLDIR%%\ATLMFC\LIB;
SET Path=%%VSINSTALLDIR%%\VSTSDB\Deploy;%%VSINSTALLDIR%%\Common7\IDE\;%%VCINSTALLDIR%%\BIN;%%VSINSTALLDIR%%\Common7\Tools;C:\Windows\Microsoft.NET\Framework\v4.0.30319;C:\Windows\Microsoft.NET\Framework\v3.5;%%VCINSTALLDIR%%\VCPackages;C:\Program Files\HTML Help Workshop;%%VSINSTALLDIR%%\Team Tools\Performance Tools;C:\Program Files\Microsoft SDKs\Windows\v7.0A\bin\NETFX 4.0 Tools;C:\Program Files\Microsoft SDKs\Windows\v7.0A\bin;%%PATH%%

svcutil /t:code http://localhost:21212/web/core?wsdl /d:.\Core /n:*,Sirius.CSharp.Client.Web.Core  /svcutilConfig:App.config

svcutil /t:code http://localhost:21212/web/select?wsdl /d:.\Select /n:*,Sirius.CSharp.Client.Web.Select  /svcutilConfig:App.config
