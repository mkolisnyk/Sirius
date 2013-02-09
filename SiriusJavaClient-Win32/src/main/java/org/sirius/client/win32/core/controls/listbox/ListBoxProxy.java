package org.sirius.client.win32.core.controls.listbox;

public class ListBoxProxy implements org.sirius.client.win32.core.controls.listbox.ListBox {
  private String _endpoint = null;
  private org.sirius.client.win32.core.controls.listbox.ListBox listBox = null;
  
  public ListBoxProxy() {
    _initListBoxProxy();
  }
  
  public ListBoxProxy(String endpoint) {
    _endpoint = endpoint;
    _initListBoxProxy();
  }
  
  private void _initListBoxProxy() {
    try {
      listBox = (new org.sirius.client.win32.core.controls.listbox.ListBoxServiceLocator()).getListBoxPort();
      if (listBox != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listBox)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listBox)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listBox != null)
      ((javax.xml.rpc.Stub)listBox)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.sirius.client.win32.core.controls.listbox.ListBox getListBox() {
    if (listBox == null)
      _initListBoxProxy();
    return listBox;
  }
  
  public int getSel(long arg0, int arg1) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getSel(arg0, arg1);
  }
  
  public int setCurSel(long arg0, int arg1) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.setCurSel(arg0, arg1);
  }
  
  public int selectString(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.selectString(arg0, arg1, arg2);
  }
  
  public int findString(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.findString(arg0, arg1, arg2);
  }
  
  public int getCount(long arg0) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getCount(arg0);
  }
  
  public int getCurSel(long arg0) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getCurSel(arg0);
  }
  
  public java.lang.String getText(long arg0, int arg1) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getText(arg0, arg1);
  }
  
  public int setSel(long arg0, boolean arg1, int arg2) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.setSel(arg0, arg1, arg2);
  }
  
  public int getTopIndex(long arg0) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getTopIndex(arg0);
  }
  
  public int getSelCount(long arg0) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getSelCount(arg0);
  }
  
  public int selItemRange(long arg0, boolean arg1, int arg2, int arg3) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.selItemRange(arg0, arg1, arg2, arg3);
  }
  
  public int getTextLen(long arg0, int arg1) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getTextLen(arg0, arg1);
  }
  
  public int findStringExact(long arg0, int arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.findStringExact(arg0, arg1, arg2);
  }
  
  public int getItemHeight(long arg0, int arg1) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getItemHeight(arg0, arg1);
  }
  
  public int setCaretIndex(long arg0, int arg1) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.setCaretIndex(arg0, arg1);
  }
  
  public int getCaretIndex(long arg0) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getCaretIndex(arg0);
  }
  
  public int getHorizontalExtent(long arg0) throws java.rmi.RemoteException{
    if (listBox == null)
      _initListBoxProxy();
    return listBox.getHorizontalExtent(arg0);
  }
  
  
}