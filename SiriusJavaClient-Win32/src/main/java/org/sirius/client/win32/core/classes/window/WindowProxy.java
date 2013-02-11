package org.sirius.client.win32.core.classes.window;

public class WindowProxy implements org.sirius.client.win32.core.classes.window.Window {
  private String _endpoint = null;
  private org.sirius.client.win32.core.classes.window.Window window = null;
  
  public WindowProxy() {
    _initWindowProxy();
  }
  
  public WindowProxy(String endpoint) {
    _endpoint = endpoint;
    _initWindowProxy();
  }
  
  private void _initWindowProxy() {
    try {
      window = (new org.sirius.client.win32.core.classes.window.WindowServiceLocator()).getWindowPort();
      if (window != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)window)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)window)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (window != null)
      ((javax.xml.rpc.Stub)window)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.core.classes.window.Window getWindow() {
    if (window == null)
      _initWindowProxy();
    return window;
  }
  
  public boolean getWindowPlacement(long arg0, org.sirius.client.win32.core.types.Windowplacement arg1) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.getWindowPlacement(arg0, arg1);
  }
  
  public long getSystemMenu(long arg0, boolean arg1) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.getSystemMenu(arg0, arg1);
  }
  
  public org.sirius.client.win32.core.types.Rect getClientRect(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.getClientRect(arg0);
  }
  
  public void doubleClick(long arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.doubleClick(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public void keyPress(long arg0, int arg1) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.keyPress(arg0, arg1);
  }
  
  public org.sirius.client.win32.core.types.Rect getRect(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.getRect(arg0);
  }
  
  public boolean isMaximized(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isMaximized(arg0);
  }
  
  public boolean isMinimized(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isMinimized(arg0);
  }
  
  public boolean isUnicode(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isUnicode(arg0);
  }
  
  public boolean isWindow(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isWindow(arg0);
  }
  
  public void sizeTo(long arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.sizeTo(arg0, arg1, arg2);
  }
  
  public void start(long arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.start(arg0, arg1, arg2, arg3);
  }
  
  public void close(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.close(arg0);
  }
  
  public boolean isVisible(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isVisible(arg0);
  }
  
  public boolean isEnabled(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isEnabled(arg0);
  }
  
  public void keyDown(long arg0, int arg1) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.keyDown(arg0, arg1);
  }
  
  public void keyUp(long arg0, int arg1) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.keyUp(arg0, arg1);
  }
  
  public void mouseDown(long arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.mouseDown(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public void mouseUp(long arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.mouseUp(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public void move(long arg0, int arg1, int arg2, int arg3, int arg4) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.move(arg0, arg1, arg2, arg3, arg4);
  }
  
  public java.lang.String getText(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.getText(arg0);
  }
  
  public void activate(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.activate(arg0);
  }
  
  public void moveTo(long arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.moveTo(arg0, arg1, arg2);
  }
  
  public void maximize(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.maximize(arg0);
  }
  
  public void minimize(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.minimize(arg0);
  }
  
  public void restore(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.restore(arg0);
  }
  
  public void click(long arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    window.click(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public long getMenu(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.getMenu(arg0);
  }
  
  public boolean isNormal(long arg0) throws java.rmi.RemoteException{
    if (window == null)
      _initWindowProxy();
    return window.isNormal(arg0);
  }
  
  
}