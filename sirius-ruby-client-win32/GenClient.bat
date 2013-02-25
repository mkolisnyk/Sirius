DEL /S /Q lib\sirius\win32\core\*.*
RMDIR /S /Q lib\sirius\win32\core\
MKDIR lib\sirius\win32\core\

MKDIR lib\sirius\win32\core\utils
MKDIR lib\sirius\win32\core\window
MKDIR lib\sirius\win32\core\menu
MKDIR lib\sirius\win32\core\dialog
MKDIR lib\sirius\win32\core\button
MKDIR lib\sirius\win32\core\combobox
MKDIR lib\sirius\win32\core\edit
MKDIR lib\sirius\win32\core\listbox
MKDIR lib\sirius\win32\core\tabcontrol


cd lib\sirius\win32\core\utils
wsdl2ruby --wsdl http://localhost:21212/win32/utils?wsdl --type client --module_path Sirius::Win32::Core::Utils
cd ..\..\..\..\..

cd lib\sirius\win32\core\window
wsdl2ruby --wsdl http://localhost:21212/win32/window?wsdl --type client --module_path Sirius::Win32::Core::Window
cd ..\..\..\..\..

cd lib\sirius\win32\core\menu
wsdl2ruby --wsdl http://localhost:21212/win32/menu?wsdl --type client --module_path Sirius::Win32::Core::Menu
cd ..\..\..\..\..

cd lib\sirius\win32\core\dialog
wsdl2ruby --wsdl http://localhost:21212/win32/dialog?wsdl --type client --module_path Sirius::Win32::Core::Dialog
cd ..\..\..\..\..

cd lib\sirius\win32\core\button
wsdl2ruby --wsdl http://localhost:21212/win32/button?wsdl --type client --module_path Sirius::Win32::Core::Button
cd ..\..\..\..\..

cd lib\sirius\win32\core\comobox
wsdl2ruby --wsdl http://localhost:21212/win32/combobox?wsdl --type client --module_path Sirius::Win32::Core::Combobox
cd ..\..\..\..\..

cd lib\sirius\win32\core\edit
wsdl2ruby --wsdl http://localhost:21212/win32/edit?wsdl --type client --module_path Sirius::Win32::Core::Edit
cd ..\..\..\..\..

cd lib\sirius\win32\core\listbox
wsdl2ruby --wsdl http://localhost:21212/win32/listbox?wsdl --type client --module_path Sirius::Win32::Core::Listbox
cd ..\..\..\..\..

cd lib\sirius\win32\core\tabcontrol
wsdl2ruby --wsdl http://localhost:21212/win32/tabcontrol?wsdl --type client --module_path Sirius::Win32::Core::Tabcontrol
cd ..\..\..\..\..
