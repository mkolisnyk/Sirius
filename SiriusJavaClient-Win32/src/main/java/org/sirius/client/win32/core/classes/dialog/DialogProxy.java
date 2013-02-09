package org.sirius.client.win32.core.classes.dialog;

public class DialogProxy implements org.sirius.client.win32.core.classes.dialog.Dialog {
  private String _endpoint = null;
  private org.sirius.client.win32.core.classes.dialog.Dialog dialog = null;
  
  public DialogProxy() {
    _initDialogProxy();
  }
  
  public DialogProxy(String endpoint) {
    _endpoint = endpoint;
    _initDialogProxy();
  }
  
  private void _initDialogProxy() {
    try {
      dialog = (new org.sirius.client.win32.core.classes.dialog.DialogServiceLocator()).getDialogPort();
      if (dialog != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dialog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dialog)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dialog != null)
      ((javax.xml.rpc.Stub)dialog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.core.classes.dialog.Dialog getDialog() {
    if (dialog == null)
      _initDialogProxy();
    return dialog;
  }
  
  public int getDlgCtrlID(long arg0) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.getDlgCtrlID(arg0);
  }
  
  public long getDlgItem(long arg0, int arg1) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.getDlgItem(arg0, arg1);
  }
  
  public long getDialogBaseUnits() throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.getDialogBaseUnits();
  }
  
  public int getDlgItemInt(long arg0, int arg1, boolean arg2, boolean arg3) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.getDlgItemInt(arg0, arg1, arg2, arg3);
  }
  
  public java.lang.String getDlgItemTextA(long arg0, int arg1) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.getDlgItemTextA(arg0, arg1);
  }
  
  public int isDlgButtonChecked(long arg0, int arg1) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.isDlgButtonChecked(arg0, arg1);
  }
  
  public boolean setDlgItemInt(long arg0, int arg1, int arg2, boolean arg3) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.setDlgItemInt(arg0, arg1, arg2, arg3);
  }
  
  public boolean setDlgItemText(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (dialog == null)
      _initDialogProxy();
    return dialog.setDlgItemText(arg0, arg1, arg2);
  }
  
  
}