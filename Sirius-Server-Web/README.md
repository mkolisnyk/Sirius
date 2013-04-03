# Sirius Server Web overview 

Sirius Server Web module is designed to provide actions for web applications interaction. This part of the system is wrapped around [WebDriver](http://docs.seleniumhq.org/projects/webdriver/) library and is driven by it. Since it's WebDriver wrapper, all the restrictions and features applicable for WebDriver are applicable to the Sirius Server Web module.

The following endpoints are defined for this module:

| Endpoint                       | Class                             | Description |
| ------------------------------ | --------------------------------- | ----------- |
| http://\<base URL\>/web/core     | org.sirius.server.web.WebCore     | Provides main functionality. Actually it combines the API of WebDriver and WebElement classes of the WebDriver |
| http://\<base URL\>/web/select   | org.sirius.server.web.WebSelect   | Provides functionality specific to web lists. It's designed as separate endpoint as it's implemented separately in WebDriver |

# Authors

Myk Kolisnyk ( [kolesnik.nickolay@gmail.com](mailto://kolesnik.nickolay@gmail.com) )

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.com/search/label/Sirius)
