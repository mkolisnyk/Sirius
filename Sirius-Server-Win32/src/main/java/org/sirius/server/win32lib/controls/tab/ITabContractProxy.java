package org.sirius.server.win32lib.controls.tab;

public class ITabContractProxy implements org.sirius.server.win32lib.controls.tab.ITabContract {
  private String _endpoint = null;
  private org.sirius.server.win32lib.controls.tab.ITabContract iTabContract = null;
  
  public ITabContractProxy() {
    _initITabContractProxy();
  }
  
  public ITabContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initITabContractProxy();
  }
  
  private void _initITabContractProxy() {
    try {
      iTabContract = (new org.sirius.server.win32lib.controls.tab.TabSvcLocator()).getTabSvcPort();
      if (iTabContract != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTabContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTabContract)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTabContract != null)
      ((javax.xml.rpc.Stub)iTabContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.server.win32lib.controls.tab.ITabContract getITabContract() {
    if (iTabContract == null)
      _initITabContractProxy();
    return iTabContract;
  }
  
  public java.lang.Integer getItemsCount(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iTabContract == null)
      _initITabContractProxy();
    return iTabContract.getItemsCount(hwnd);
  }
  
  public java.lang.Integer getSelectedIndex(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iTabContract == null)
      _initITabContractProxy();
    return iTabContract.getSelectedIndex(hwnd);
  }
  
  public java.lang.String getSelectedItem(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iTabContract == null)
      _initITabContractProxy();
    return iTabContract.getSelectedItem(hwnd);
  }
  
  public java.lang.String[] getItemNames(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iTabContract == null)
      _initITabContractProxy();
    return iTabContract.getItemNames(hwnd);
  }
  
  public void selectByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iTabContract == null)
      _initITabContractProxy();
    iTabContract.selectByIndex(hwnd, index);
  }
  
  public void selectByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iTabContract == null)
      _initITabContractProxy();
    iTabContract.selectByName(hwnd, item);
  }
  
  
}