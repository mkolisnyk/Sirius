package org.sirius.server.win32lib.controls.listview;

public class IListViewContractProxy implements org.sirius.server.win32lib.controls.listview.IListViewContract {
  private String _endpoint = null;
  private org.sirius.server.win32lib.controls.listview.IListViewContract iListViewContract = null;
  
  public IListViewContractProxy() {
    _initIListViewContractProxy();
  }
  
  public IListViewContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initIListViewContractProxy();
  }
  
  private void _initIListViewContractProxy() {
    try {
      iListViewContract = (new org.sirius.server.win32lib.controls.listview.ListViewSvcLocator()).getListViewSvcPort();
      if (iListViewContract != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iListViewContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iListViewContract)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iListViewContract != null)
      ((javax.xml.rpc.Stub)iListViewContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.server.win32lib.controls.listview.IListViewContract getIListViewContract() {
    if (iListViewContract == null)
      _initIListViewContractProxy();
    return iListViewContract;
  }
  
  public void addSelectionByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.addSelectionByIndex(hwnd, index);
  }
  
  public void addSelectionByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.addSelectionByName(hwnd, item);
  }
  
  public void deselectAll(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.deselectAll(hwnd);
  }
  
  public java.lang.String[] getItemNames(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    return iListViewContract.getItemNames(hwnd);
  }
  
  public java.lang.Integer getItemsCount(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    return iListViewContract.getItemsCount(hwnd);
  }
  
  public java.lang.Integer getSelectedIndex(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    return iListViewContract.getSelectedIndex(hwnd);
  }
  
  public java.lang.String getSelectedItem(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    return iListViewContract.getSelectedItem(hwnd);
  }
  
  public java.lang.String[] getSelectedItems(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    return iListViewContract.getSelectedItems(hwnd);
  }
  
  public void removeSelectionByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.removeSelectionByIndex(hwnd, index);
  }
  
  public void removeSelectionByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.removeSelectionByName(hwnd, item);
  }
  
  public void selectByIndex(java.lang.Integer hwnd, java.lang.Integer index) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.selectByIndex(hwnd, index);
  }
  
  public void selectByName(java.lang.Integer hwnd, java.lang.String item) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.selectByName(hwnd, item);
  }
  
  public void selectAll(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iListViewContract == null)
      _initIListViewContractProxy();
    iListViewContract.selectAll(hwnd);
  }
  
  
}