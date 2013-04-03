# Sirius Server Win32 overview 

Sirius Server Win32 module contains functionality manipulating with Win32 objects. From the server side it's wrapper on Win32 API via [JNA](http://java.jna.net) library.

Consists of classes dedicated to:
* General windows manipulation
* Dialog functionality
* Menu functionality
* Control-specific functionality

Each of those classes is represented with dedicated endpoint. Currently the following endpoints are included:

| Endpoint                           | Class                                               | Description |
| ---------------------------------- | --------------------------------------------------- | ----------- |
| http://\<base URL\>/win32/utils      | org.sirius.server.win32.Win32Utils                  | Win32 utility functionality usually wrapper on some callback functions which can not be used via service communication |
| http://\<base URL\>/win32/window     | org.sirius.server.win32.classes.Window              | General operations applicable to mupliple window classes |
| http://\<base URL\>/win32/menu       | org.sirius.server.win32.classes.Menu                | Menu-specific operations |
| http://\<base URL\>/win32/dialog     | org.sirius.server.win32.classes.Dialog              | Dialog-specific operations |
| http://\<base URL\>/win32/button     | org.sirius.server.win32.classes.controls.Button     | Operations specific to the **button** window class |
| http://\<base URL\>/win32/comobox    | org.sirius.server.win32.classes.controls.ComboBox   | Combo box specific operations |
| http://\<base URL\>/win32/edit       | org.sirius.server.win32.classes.controls.Edit       | Text field specific operations |
| http://\<base URL\>/win32/listbox    | org.sirius.server.win32.classes.controls.ListBox    | List box specific operations |
| http://\<base URL\>/win32/tabcontrol | org.sirius.server.win32.classes.controls.TabControl | Tab control specific operations |

# Authors

Myk Kolisnyk ( [kolesnik.nickolay@gmail.com](mailto://kolesnik.nickolay@gmail.com) )

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.com/search/label/Sirius)
