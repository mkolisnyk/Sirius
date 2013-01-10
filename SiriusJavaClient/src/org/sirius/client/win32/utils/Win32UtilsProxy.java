package org.sirius.client.win32.utils;

public class Win32UtilsProxy implements org.sirius.client.win32.utils.Win32Utils {
  private String _endpoint = null;
  private org.sirius.client.win32.utils.Win32Utils win32Utils = null;
  
  public Win32UtilsProxy() {
    _initWin32UtilsProxy();
  }
  
  public Win32UtilsProxy(String endpoint) {
    _endpoint = endpoint;
    _initWin32UtilsProxy();
  }
  
  private void _initWin32UtilsProxy() {
    try {
      win32Utils = (new org.sirius.client.win32.utils.Win32UtilsServiceLocator()).getWin32UtilsPort();
      if (win32Utils != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)win32Utils)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)win32Utils)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (win32Utils != null)
      ((javax.xml.rpc.Stub)win32Utils)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.utils.Win32Utils getWin32Utils() {
    if (win32Utils == null)
      _initWin32UtilsProxy();
    return win32Utils;
  }
  
  public org.sirius.client.win32.utils.Hwnd searchWindow(org.sirius.client.win32.utils.Win32Locator arg0) throws java.rmi.RemoteException{
    if (win32Utils == null)
      _initWin32UtilsProxy();
    return win32Utils.searchWindow(arg0);
  }
  
  
}