# Sirius Win32 Lib Service overview 

This component is an additional server component providing interaction with Win32 objects. It's created as the wrapper on Sirius Win32 Lib component which is the wrapper on UIAutomation library.

# Endpoints

Each of those classes is represented with dedicated endpoint. Currently the following endpoints are included:

| Endpoint                           | Description |
| ---------------------------------- | ----------- |
| <base URL>/win32lib/tabsvc | provides interface for methods interacting with Tab Control objects |
| <base URL>/win32lib/editsvc | provides interface for methods interacting with Edit Control objects |
| <base URL>/win32lib/buttonsvc | provides interface for methods interacting with Button Control objects |
| <base URL>/win32lib/listboxsvc | provides interface for methods interacting with List Box Control objects |
| <base URL>/win32lib/listviewsvc | provides interface for methods interacting with List View Control objects |
| <base URL>/win32lib/progressbarsvc | provides interface for methods interacting with Progress Bar Control objects |
| <base URL>/win32lib/scrollbarsvc | provides interface for methods interacting with Scroll Bar Control objects |
| <base URL>/win32lib/slidersvc | provides interface for methods interacting with Slider Control objects |
| <base URL>/win32lib/spinsvc | provides interface for methods interacting with Spin Control objects |

By default the **base URL** value is set to **http://localhost:31313** but the value can be changed using the configuration option (see corresponding section).

# Dependencies

This component uses UIAutomation library to interact with GUI object from the C\# code

# Installation

# Configuration

The configuration settings can be applied to the **Sirius.Win32.WinService.exe.config** file which is located with the application binaries or to the **app.config** file which is stored in the project.

The configuration file contains several sections:
* **appSettings** - contains major settings related to component run. Mainly it includes 2 settings:
** **baseURL** - specifies the host name for the service endpoints to start with. **Default Value is:** http://localhost:31313
** **runAsService** - flag indicating whether application should be started as the Windows service. If set to **false** the application is started as console application
* **log4net** - identifies logging settings
* **system.serviceModel** - identifies service endpoint settings and various configuration related to the service communications

# Running Sirius Win32 Service

## Running as Windows Service

In order to run application as the windows service we should set the **baseURL** configuraiton option into **true**.

Main setup is now defined in the [installwin32svc.cmd](https://github.com/mkolisnyk/Sirius/blob/master/Publish/installwin32svc.cmd) batch which can be started using the following command line:

```
installwin32svc.cmd <version number>
```
E.g.
```
installwin32svc.cmd 1.0.0
```

## Running as command line application

In order to run application as the windows service we should set the **baseURL** configuraiton option into **false**.

After that it can be started either via command line or from Windows Explorer by clicking on the application icon.
The application can be stopped by entering **q** in the command line console.

# Links  

* [GitHub project](https://github.com/mkolisnyk/Sirius)
* [Dedicated blog entries](http://mkolisnyk.blogspot.com/search/label/Sirius)

#Authors

Myk Kolisnyk (kolesnik.nickolay@gmail.com) 

<a href="http://ua.linkedin.com/pub/mykola-kolisnyk/14/533/903"><img src="http://www.linkedin.com/img/webpromo/btn_profile_bluetxt_80x15.png" width="80" height="15" border="0" alt="View Mykola Kolisnyk's profile on LinkedIn"></a>
<a href="http://plus.google.com/108480514086204589709?prsrc=3" rel="publisher" style="text-decoration:none;">
<img src="http://ssl.gstatic.com/images/icons/gplus-16.png" alt="Google+" style="border:0;width:16px;height:16px;"/></a>
