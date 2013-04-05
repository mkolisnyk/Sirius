# Sirius Java Client Overview

This is the core part of the Java Client Library for Sirius Test Automation Platform. It is designed to be the top-most entry point for all Java client components. Additionally, it contains methods interacting with the internal Sirius Server endpoints.

# Installation

The client library is delivered in 2 ways:
1. Self-contained Java library provided as **jar** file. It can be taken from [downloads page](http://code.google.com/p/sirius-platform/downloads/list). All we need to do is just unpack the archive and include appropriate **jar** file into the project.
2. Maven dependencies. Each client module is also published to Maven repository. The list of available modules can be found on [the following page](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.github.mkolisnyk%22). So, if we have Maven project where we'd like to use Sirius Java client libraries we should update Maven script with the entry like this:
``` xml
	<dependency>
		<groupId>com.github.mkolisnyk</groupId>
		<artifactId>sirius.java.client</artifactId>
		<version>LATEST</version>
	</dependency>
```
or any similar for all the modules we'd like to include.

After that we can use library classes, e.g:

``` java
	// TBD
```

# Sample usage

# Releases

All available client modules can be found [at the Maven repository](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.github.mkolisnyk%22%20AND%20a%3A%22sirius.java.client%22). 

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.co.uk/search/label/Sirius)

#Authors

Myk Kolisnyk (kolesnik.nickolay@gmail.com) 

<a href="http://ua.linkedin.com/pub/mykola-kolisnyk/14/533/903"><img src="http://www.linkedin.com/img/webpromo/btn_profile_bluetxt_80x15.png" width="80" height="15" border="0" alt="View Mykola Kolisnyk's profile on LinkedIn"></a>
<a href="http://plus.google.com/108480514086204589709?prsrc=3" rel="publisher" style="text-decoration:none;">
<img src="http://ssl.gstatic.com/images/icons/gplus-16.png" alt="Google+" style="border:0;width:16px;height:16px;"/></a>
