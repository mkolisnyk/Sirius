package org.sirius.server.win32lib.controls.progressbar;

public class IProgressBarContractProxy implements org.sirius.server.win32lib.controls.progressbar.IProgressBarContract {
  private String _endpoint = null;
  private org.sirius.server.win32lib.controls.progressbar.IProgressBarContract iProgressBarContract = null;
  
  public IProgressBarContractProxy() {
    _initIProgressBarContractProxy();
  }
  
  public IProgressBarContractProxy(String endpoint) {
    _endpoint = endpoint;
    _initIProgressBarContractProxy();
  }
  
  private void _initIProgressBarContractProxy() {
    try {
      iProgressBarContract = (new org.sirius.server.win32lib.controls.progressbar.ProgressBarSvcLocator()).getProgressBarSvcPort();
      if (iProgressBarContract != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iProgressBarContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iProgressBarContract)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iProgressBarContract != null)
      ((javax.xml.rpc.Stub)iProgressBarContract)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.server.win32lib.controls.progressbar.IProgressBarContract getIProgressBarContract() {
    if (iProgressBarContract == null)
      _initIProgressBarContractProxy();
    return iProgressBarContract;
  }
  
  public java.lang.Double getLowerBound(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iProgressBarContract == null)
      _initIProgressBarContractProxy();
    return iProgressBarContract.getLowerBound(hwnd);
  }
  
  public java.lang.Double getPosition(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iProgressBarContract == null)
      _initIProgressBarContractProxy();
    return iProgressBarContract.getPosition(hwnd);
  }
  
  public java.lang.Double getUpperBound(java.lang.Integer hwnd) throws java.rmi.RemoteException{
    if (iProgressBarContract == null)
      _initIProgressBarContractProxy();
    return iProgressBarContract.getUpperBound(hwnd);
  }
  
  public void setPosition(java.lang.Integer hwnd, java.lang.Double pos) throws java.rmi.RemoteException{
    if (iProgressBarContract == null)
      _initIProgressBarContractProxy();
    iProgressBarContract.setPosition(hwnd, pos);
  }
  
  
}