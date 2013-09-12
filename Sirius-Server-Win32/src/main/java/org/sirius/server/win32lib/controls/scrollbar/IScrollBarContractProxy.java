package org.sirius.server.win32lib.controls.scrollbar;

public class IScrollBarContractProxy implements org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract {
  private String _endpoint = null;
  private org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract iScrollBarContract = null;
  
  public IScrollBarContractProxy() {
    _initIScrollBarContractProxy();
  }
  
  public IScrollBarContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initIScrollBarContractProxy();
  }
  
  private void _initIScrollBarContractProxy() {
    try {
      iScrollBarContract = (new org.sirius.server.win32lib.controls.scrollbar.ScrollBarSvcLocator()).getScrollBarSvcPort();
      if (iScrollBarContract != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iScrollBarContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iScrollBarContract)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iScrollBarContract != null)
      ((javax.xml.rpc.Stub)iScrollBarContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.server.win32lib.controls.scrollbar.IScrollBarContract getIScrollBarContract() {
    if (iScrollBarContract == null)
      _initIScrollBarContractProxy();
    return iScrollBarContract;
  }
  
  public java.lang.Double getLowerBound(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iScrollBarContract == null)
      _initIScrollBarContractProxy();
    return iScrollBarContract.getLowerBound(hwnd);
  }
  
  public java.lang.Double getPosition(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iScrollBarContract == null)
      _initIScrollBarContractProxy();
    return iScrollBarContract.getPosition(hwnd);
  }
  
  public java.lang.Double getUpperBound(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iScrollBarContract == null)
      _initIScrollBarContractProxy();
    return iScrollBarContract.getUpperBound(hwnd);
  }
  
  public void setPosition(java.lang.Integer hwnd, java.lang.Double pos) throws java.rmi.RemoteException{
    if (iScrollBarContract == null)
      _initIScrollBarContractProxy();
    iScrollBarContract.setPosition(hwnd, pos);
  }
  
  
}