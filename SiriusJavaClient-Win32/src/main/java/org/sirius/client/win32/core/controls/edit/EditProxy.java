package org.sirius.client.win32.core.controls.edit;

public class EditProxy implements org.sirius.client.win32.core.controls.edit.Edit {
  private String _endpoint = null;
  private org.sirius.client.win32.core.controls.edit.Edit edit = null;
  
  public EditProxy() {
    _initEditProxy();
  }
  
  public EditProxy(String endpoint) {
    _endpoint = endpoint;
    _initEditProxy();
  }
  
  private void _initEditProxy() {
    try {
      edit = (new org.sirius.client.win32.core.controls.edit.EditServiceLocator()).getEditPort();
      if (edit != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)edit)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)edit)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (edit != null)
      ((javax.xml.rpc.Stub)edit)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.core.controls.edit.Edit getEdit() {
    if (edit == null)
      _initEditProxy();
    return edit;
  }
  
  public boolean setText(long arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.setText(arg0, arg1);
  }
  
  public int setSel(long arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.setSel(arg0, arg1, arg2);
  }
  
  public int canUndo(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.canUndo(arg0);
  }
  
  public int scroll(long arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.scroll(arg0, arg1, arg2);
  }
  
  public int lineFromChar(long arg0, int arg1) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.lineFromChar(arg0, arg1);
  }
  
  public int getLineCount(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.getLineCount(arg0);
  }
  
  public int getSel(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.getSel(arg0);
  }
  
  public int lineLength(long arg0, int arg1) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.lineLength(arg0, arg1);
  }
  
  public int lineIndex(long arg0, int arg1) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.lineIndex(arg0, arg1);
  }
  
  public int getModify(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.getModify(arg0);
  }
  
  public int replaceSel(long arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.replaceSel(arg0, arg1);
  }
  
  public boolean scrollCaret(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.scrollCaret(arg0);
  }
  
  public int emptyUndoBuffer(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.emptyUndoBuffer(arg0);
  }
  
  public int getFirstVisibleLine(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.getFirstVisibleLine(arg0);
  }
  
  public int getPasswordChar(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.getPasswordChar(arg0);
  }
  
  public int setPasswordChar(long arg0, int arg1) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.setPasswordChar(arg0, arg1);
  }
  
  public int undo(long arg0) throws java.rmi.RemoteException{
    if (edit == null)
      _initEditProxy();
    return edit.undo(arg0);
  }
  
  
}