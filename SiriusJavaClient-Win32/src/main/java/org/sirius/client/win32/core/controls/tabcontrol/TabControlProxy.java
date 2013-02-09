package org.sirius.client.win32.core.controls.tabcontrol;

public class TabControlProxy implements org.sirius.client.win32.core.controls.tabcontrol.TabControl {
  private String _endpoint = null;
  private org.sirius.client.win32.core.controls.tabcontrol.TabControl tabControl = null;
  
  public TabControlProxy() {
    _initTabControlProxy();
  }
  
  public TabControlProxy(String endpoint) {
    _endpoint = endpoint;
    _initTabControlProxy();
  }
  
  private void _initTabControlProxy() {
    try {
      tabControl = (new org.sirius.client.win32.core.controls.tabcontrol.TabControlServiceLocator()).getTabControlPort();
      if (tabControl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tabControl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tabControl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tabControl != null)
      ((javax.xml.rpc.Stub)tabControl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.core.controls.tabcontrol.TabControl getTabControl() {
    if (tabControl == null)
      _initTabControlProxy();
    return tabControl;
  }
  
  public void setCurSel(long arg0, int arg1) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    tabControl.setCurSel(arg0, arg1);
  }
  
  public int getCurSel(long arg0) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    return tabControl.getCurSel(arg0);
  }
  
  public void getItemCount(long arg0) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    tabControl.getItemCount(arg0);
  }
  
  public org.sirius.client.win32.core.controls.tabcontrol.TcITEM getItem(long arg0, int arg1) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    return tabControl.getItem(arg0, arg1);
  }
  
  public void setCurFocus(long arg0, int arg1) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    tabControl.setCurFocus(arg0, arg1);
  }
  
  public int getCurFocus(long arg0) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    return tabControl.getCurFocus(arg0);
  }
  
  public org.sirius.client.win32.core.types.Rect getItemRect(long arg0, int arg1) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    return tabControl.getItemRect(arg0, arg1);
  }
  
  public org.sirius.client.win32.core.controls.tabcontrol.TcHITTESTINFO hitTest(long arg0) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    return tabControl.hitTest(arg0);
  }
  
  public void getRowCount(long arg0) throws java.rmi.RemoteException{
    if (tabControl == null)
      _initTabControlProxy();
    tabControl.getRowCount(arg0);
  }
  
  
}