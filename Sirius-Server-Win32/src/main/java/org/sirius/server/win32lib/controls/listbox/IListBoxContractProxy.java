package org.sirius.server.win32lib.controls.listbox;

public class IListBoxContractProxy implements org.sirius.server.win32lib.controls.listbox.IListBoxContract {
  private String _endpoint = null;
  private org.sirius.server.win32lib.controls.listbox.IListBoxContract iListBoxContract = null;
  
  public IListBoxContractProxy() {
    _initIListBoxContractProxy();
  }
  
  public IListBoxContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initIListBoxContractProxy();
  }
  
  private void _initIListBoxContractProxy() {
    try {
      iListBoxContract = (new org.sirius.server.win32lib.controls.listbox.ListBoxSvcLocator()).getListBoxSvcPort();
      if (iListBoxContract != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iListBoxContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iListBoxContract)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iListBoxContract != null)
      ((javax.xml.rpc.Stub)iListBoxContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.server.win32lib.controls.listbox.IListBoxContract getIListBoxContract() {
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    return iListBoxContract;
  }
  
  public void addSelectionByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.addSelectionByIndex(hwnd, index);
  }
  
  public void addSelectionByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.addSelectionByName(hwnd, item);
  }
  
  public void deselectAll(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.deselectAll(hwnd);
  }
  
  public java.lang.String[] getItemNames(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    return iListBoxContract.getItemNames(hwnd);
  }
  
  public java.lang.Integer getItemsCount(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    return iListBoxContract.getItemsCount(hwnd);
  }
  
  public java.lang.Integer getSelectedIndex(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    return iListBoxContract.getSelectedIndex(hwnd);
  }
  
  public java.lang.String getSelectedItem(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    return iListBoxContract.getSelectedItem(hwnd);
  }
  
  public java.lang.String[] getSelectedItems(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    return iListBoxContract.getSelectedItems(hwnd);
  }
  
  public void removeSelectionByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.removeSelectionByIndex(hwnd, index);
  }
  
  public void removeSelectionByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.removeSelectionByName(hwnd, item);
  }
  
  public void selectByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.selectByIndex(hwnd, index);
  }
  
  public void selectByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.selectByName(hwnd, item);
  }
  
  public void selectAll(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListBoxContract == null)
      _initIListBoxContractProxy();
    iListBoxContract.selectAll(hwnd);
  }
  
  
}