DEL /S /Q lib\sirius\internal\*.*
RMDIR /S /Q lib\sirius\internal\
MKDIR lib\sirius\internal\

cd lib\sirius\internal
wsdl2ruby --wsdl http://localhost:21212/internal?wsdl --type client --module_path Sirius::Client::Internal
cd ..\..\..
