DEL /S /Q lib\sirius\web\core\*.*
DEL /S /Q lib\sirius\web\core\select\*.*

RMDIR /S /Q lib\sirius\web\core\select
RMDIR /S /Q lib\sirius\web\core

MKDIR lib\sirius\web\core\
MKDIR lib\sirius\web\core\select

cd lib\sirius\web\core
wsdl2ruby --wsdl http://localhost:21212/web/core?wsdl --type client --module_path Sirius::Client::Web::Core
cd ..\..\..\..

cd lib\sirius\web\core\select
wsdl2ruby --wsdl http://localhost:21212/web/select?wsdl --type client --module_path Sirius::Client::Win32::Core::Select
cd ..\..\..\..\..
