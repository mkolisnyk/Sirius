# Sirius Server Core overview 

The Sirius Server Core module provides endpoints for the operations responsible for:
* File system manipulation
* Processes handling
* Any other system-level operations

Why this module is needed? Since Sirius Test Automation Platform operates with client/server architecture and the actual operations are performed on remote machine (in general case) there's a need of the system operations on the remote machine. E.g. if we want to invoke some application on the target machine we can use this module for this. 

Additionally, host and remote machines can work under different operating systems so a lot of operations can be done in different way however the interface is the same. E.g. process listing on Unix and Windows are different but we can do this operation in unified way.

# Supported Operations

Currently the following functionality groups are supported by the Core module:
* File manipulation - various actions on files including create/modify/delete and different manipulations with the content
* Directory manipulation - varous actions on directories inclusing create/modify/delete and content retrieval
* Process manipulation - actions manipulating with processes including start/stop and process information retrieval
* System operations - various system-related operations (e.g. getting machine name, environment variable etc.)

# Authors

Myk Kolisnyk ( [kolesnik.nickolay@gmail.com](mailto://kolesnik.nickolay@gmail.com) )

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.co.uk/search/label/Sirius)