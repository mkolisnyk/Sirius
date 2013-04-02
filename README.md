Sirius
======
Sirius is open source platform initially designed for test automation purpose. In general, it is delivered as as set of libraries and execution service which is responsible for actual commands execution. 

Key features are:
* client - server architecture for distributed environment
* portable to any programming language
* extensible modular architecture
* high integration ability with other test automation libraries
* applicability to any platform

Why using Sirius?
======

There's huge variety of open-source libraries used for test automation. But all of them have restrictions. In most cases they are:
* **Technology support restrictions** - the library/tool is targeted to some specific development platform (Web, Mobile, Win32 etc) and it requires some workarounds to perform the actions which appear out of the box for current library/tool
* **Language support restrictions** - a lot of solutions are provided as libraries which are restricted with the programming language they're written on

The primary goal of the Sirius Test Automation Platform is to provide common interface for application under test interaction which can be ported to any programming language and extended to support any programming technology.

In addition to that, modular architecture gives an ability to use any combination of platform components to work only with the areas needed for your current automation project.

And eventually, since the platform is provided as the set of libraries it's easily can be used in combination with any test engine which operates with the source code. So, we're free to use any engine we like from the xUnit engines up to the Cucumber family of engines.

Sirius Overall Structure
======

The entire platform consists of two major parts:
* **Server** - provides core API interacting with target system and exposes SOAP interface for remote access from client side. Additionally, server side components contain the Starter module which loads all sub-modules on-fly during the start based on configuration file.
* **Client** - provides high-level API which wraps interaction with server and provides the libraries to use within the tests code. It's ported into multiple programming languages

The server side is split by functional areas. So, we have dedicated module for system operations, Win32 interaction, Web operations etc. All those modules are loaded by main Sirius engine starter on-fly.

Each server component has dedicated client ported to different programming languages. The entire structure can be represented with the following diagram:

![Sirius Components Structure](https://github.com/mkolisnyk/Sirius/blob/master/Docs/img/diagrams/ComponentDiagram.png)

The below table shows currently available components and their language-specific ports.

| Module\Component | Server | Java Client | Ruby Client | C\# Client |
| ------------- | ------------- | ------ |------------- | ------ |------------- |
| Main | [Server Main Module](https://github.com/mkolisnyk/Sirius/tree/master/Server)| [Java Main Module](https://github.com/mkolisnyk/Sirius/tree/master/SiriusJavaClient#sirius-java-client-overview) | [Ruby Main Module](https://github.com/mkolisnyk/Sirius/tree/master/sirius-ruby-client#sirius-ruby-client-overview) | [C\# Main Module](https://github.com/mkolisnyk/Sirius/tree/master/SiriusCSharp.Client/SiriusClient)|
| Core | [Server Core](https://github.com/mkolisnyk/Sirius/tree/master/Sirius-Server-Core#sirius-server-core-overview) | [Java Core](https://github.com/mkolisnyk/Sirius/tree/master/SiriusJavaClient-Core) | [Ruby Core](https://github.com/mkolisnyk/Sirius/tree/master/sirius-ruby-client-core) | [C\# Core](https://github.com/mkolisnyk/Sirius/tree/master/SiriusCSharp.Client/Sirius.Client.Core) |
| Win32 | [Server Win32](https://github.com/mkolisnyk/Sirius/tree/master/Sirius-Server-Win32) | [Java Win32](https://github.com/mkolisnyk/Sirius/tree/master/SiriusJavaClient-Win32) | [Ruby Win32](https://github.com/mkolisnyk/Sirius/tree/master/sirius-ruby-client-win32) | [C\# Win32](https://github.com/mkolisnyk/Sirius/tree/master/SiriusCSharp.Client/Sirius.CSharp.Client.Win32) |
| Web | [Server Web](https://github.com/mkolisnyk/Sirius/tree/master/Sirius-Server-Web) | [Java Web](https://github.com/mkolisnyk/Sirius/tree/master/SiriusJavaClient-Web) | [Ruby Web](https://github.com/mkolisnyk/Sirius/tree/master/sirius-ruby-client-web) | [C\# Web](https://github.com/mkolisnyk/Sirius/tree/master/SiriusCSharp.Client/Sirius.CSharp.Client.Web) |

Releases
======
There're 2 release types supported by this project:
* **Component release** - the release of each component in isolation from others. All client modules are distributed as various [Maven](http://maven.apache.org), [Rubygems](http://rubygems.org), [NuGet](http://nuget.org) packages (see references to packages on dedicated pages).
* **Platform release** - the release of the entire Sirius platform where all components are built together and distributed as the single archive. All those releases are available at the [Downloads Page](http://code.google.com/p/sirius-platform/downloads/list)

Documentation
======
[Project Wiki](https://github.com/mkolisnyk/Sirius/wiki)

Youtube
======
[Channel for Sirius Demo & Presentation Videos](http://www.youtube.com/playlist?list=PLKpEiwuelX0YCeXyyCt1_SlT7-COQ288-)

Related projects
======
[Sirius Platform on Google Code](http://code.google.com/p/sirius-platform/) - the [Google Code](http://code.google.com/) copy of this project used for 2 major purposes:
* Backup copy
* Storage for component release tags ( mostly used by [Maven](http://maven.org/) )

Blog Links
======
http://mkolisnyk.blogspot.com/search/label/Sirius

Authors
======
Myk Kolisnyk (kolesnik.nickolay@gmail.com)
