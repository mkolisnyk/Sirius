# Sirius Server Web overview 

Sirius Server Web module is designed to provide actions for web applications interaction. This part of the system is wrapped around [WebDriver](http://docs.seleniumhq.org/projects/webdriver/) library and is driven by it. Since it's WebDriver wrapper, all the restrictions and features applicable for WebDriver are applicable to the Sirius Server Web module.

The following endpoints are defined for this module:

| Endpoint                       | Class                             | Description |
| ------------------------------ | --------------------------------- | ----------- |
| http://\<base URL\>/web/core     | org.sirius.server.web.WebCore     | Provides main functionality. Actually it combines the API of WebDriver and WebElement classes of the WebDriver |
| http://\<base URL\>/web/select   | org.sirius.server.web.WebSelect   | Provides functionality specific to web lists. It's designed as separate endpoint as it's implemented separately in WebDriver |

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.com/search/label/Sirius)

#Authors

Myk Kolisnyk (kolesnik.nickolay@gmail.com) 

<a href="http://ua.linkedin.com/pub/mykola-kolisnyk/14/533/903"><img src="http://www.linkedin.com/img/webpromo/btn_profile_bluetxt_80x15.png" width="80" height="15" border="0" alt="View Mykola Kolisnyk's profile on LinkedIn"></a>
<a href="http://plus.google.com/108480514086204589709?prsrc=3" rel="publisher" style="text-decoration:none;">
<img src="http://ssl.gstatic.com/images/icons/gplus-16.png" alt="Google+" style="border:0;width:16px;height:16px;"/></a>
