# Sirius Java Client Overview

This is the client library for Sirius test automation platform for Java programming language.

# Installation

Java client library is delivered as Jar package which can be downloaded from the {Releases Page} or added as the Maven dependency.
For this purpose we should update Maven script with the entry like this:

``` xml
	<dependency>
		<groupId>Sirius</groupId>
		<artifactId>Sirius-Java-Client</artifactId>
		<version>LATEST</version>
		<scope>test</scope>
	</dependency>
```

After that we can use library classes, e.g:

``` java
	import org.sirius.client.core.system.file.FileOperationsProxy;
```

# Sample usage

Once you have an access to Sirius Client classes you can use them as an ordinary code. 
Typically you just have to initialize the connection to Sirius Server. It's done while creating new
instance of any library object. For example:
``` java
	FileOperationsProxy fileClient = new FileOperationsProxy();
```
If you need to connect to specific instance of Sirius Server you can specify which host and port it listens to:
``` java
	FileOperationsProxy fileClient = new FileOperationsProxy("my_host", "8080");
```
That instruction will connect to the server instance listening the http://my_host:8080 host.

By default the connection is set up for the following URL: http://localhost:21212 

# Authors

Myk Kolisnyk ( [kolesnik.nickolay@gmail.com](mailto://kolesnik.nickolay@gmail.com) )

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.co.uk/search/label/Sirius)
