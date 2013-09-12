package org.sirius.server.win32lib.controls.edit;

public class IEditContractProxy implements org.sirius.server.win32lib.controls.edit.IEditContract {
  private String _endpoint = null;
  private org.sirius.server.win32lib.controls.edit.IEditContract iEditContract = null;
  
  public IEditContractProxy() {
    _initIEditContractProxy();
  }
  
  public IEditContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initIEditContractProxy();
  }
  
  private void _initIEditContractProxy() {
    try {
      iEditContract = (new org.sirius.server.win32lib.controls.edit.EditSvcLocator()).getEditSvcPort();
      if (iEditContract != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iEditContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iEditContract)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iEditContract != null)
      ((javax.xml.rpc.Stub)iEditContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.server.win32lib.controls.edit.IEditContract getIEditContract() {
    if (iEditContract == null)
      _initIEditContractProxy();
    return iEditContract;
  }
  
  public java.lang.String getText(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iEditContract == null)
      _initIEditContractProxy();
    return iEditContract.getText(hwnd);
  }
  
  public void setText(java.lang.Integer hwnd, java.lang.String text) throws java.rmi.RemoteException{
    if (iEditContract == null)
      _initIEditContractProxy();
    iEditContract.setText(hwnd, text);
  }
  
  public void typeText(java.lang.Integer hwnd, java.lang.String text) throws java.rmi.RemoteException{
    if (iEditContract == null)
      _initIEditContractProxy();
    iEditContract.typeText(hwnd, text);
  }
  
  public void setCursorPosition(java.lang.Integer hwnd, java.lang.Integer col, java.lang.Integer row) throws java.rmi.RemoteException{
    if (iEditContract == null)
      _initIEditContractProxy();
    iEditContract.setCursorPosition(hwnd, col, row);
  }
  
  public void setSelection(java.lang.Integer hwnd, java.lang.Integer scol, java.lang.Integer srow, java.lang.Integer ecol, java.lang.Integer erow) throws java.rmi.RemoteException{
    if (iEditContract == null)
      _initIEditContractProxy();
    iEditContract.setSelection(hwnd, scol, srow, ecol, erow);
  }
  
  public java.lang.String getSelectedText(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iEditContract == null)
      _initIEditContractProxy();
    return iEditContract.getSelectedText(hwnd);
  }
  
  
}