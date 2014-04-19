SET VSINSTALLDIR=D:\vs
SET VCINSTALLDIR=%%VSINSTALLDIR%%\VC
SET VS100COMNTOOLS=%%VSINSTALLDIR%%\Common7\Tools\

SET LIB=%%VCINSTALLDIR%%\LIB;%%VCINSTALLDIR%%\ATLMFC\LIB;C:\Program Files\Microsoft SDKs\Windows\v7.0A\lib;
SET LIBPATH=C:\Windows\Microsoft.NET\Framework\v4.0.30319;C:\Windows\Microsoft.NET\Framework\v3.5;%%VCINSTALLDIR%%\LIB;%%VCINSTALLDIR%%\ATLMFC\LIB;
SET Path=%%VSINSTALLDIR%%\VSTSDB\Deploy;%%VSINSTALLDIR%%\Common7\IDE\;%%VCINSTALLDIR%%\BIN;%%VSINSTALLDIR%%\Common7\Tools;C:\Windows\Microsoft.NET\Framework\v4.0.30319;C:\Windows\Microsoft.NET\Framework\v3.5;%%VCINSTALLDIR%%\VCPackages;C:\Program Files\HTML Help Workshop;%%VSINSTALLDIR%%\Team Tools\Performance Tools;C:\Program Files\Microsoft SDKs\Windows\v7.0A\bin\NETFX 4.0 Tools;C:\Program Files\Microsoft SDKs\Windows\v7.0A\bin;%%PATH%%

svcutil /t:code http://localhost:21212/win32/utils?wsdl /d:.\Sirius.Client\Win32.Core\Utils /n:*,Sirius.Client.Win32.Core.Utils  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/window?wsdl /d:.\Sirius.Client\Win32.Core\Window /n:*,Sirius.Client.Win32.Core.Window  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/menu?wsdl /d:.\Sirius.Client\Win32.Core\Menu /n:*,Sirius.Client.Win32.Core.Menu  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/dialog?wsdl /d:.\Sirius.Client\Win32.Core\Dialog /n:*,Sirius.Client.Win32.Core.Dialog  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/button?wsdl /d:.\Sirius.Client\Win32.Core\Button /n:*,Sirius.Client.Win32.Core.Button  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/combobox?wsdl /d:.\Sirius.Client\Win32.Core\ComboBox /n:*,Sirius.Client.Win32.Core.Combobox  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/edit?wsdl /d:.\Sirius.Client\Win32.Core\Edit /n:*,Sirius.Client.Win32.Core.Edit  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/listbox?wsdl /d:.\Sirius.Client\Win32.Core\ListBox /n:*,Sirius.Client.Win32.Core.ListBox  /svcutilConfig:App.config
svcutil /t:code http://localhost:21212/win32/tabcontrol?wsdl /d:.\Sirius.Client\Win32.Core\TabControl /n:*,Sirius.Client.Win32.Core.TabControl  /svcutilConfig:App.config
