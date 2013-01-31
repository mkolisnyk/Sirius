package org.sirius.client.win32.core.classes.menu;

public class MenuProxy implements
		org.sirius.client.win32.core.classes.menu.Menu {
	private String _endpoint = null;
	private org.sirius.client.win32.core.classes.menu.Menu menu = null;

	public MenuProxy() {
		_initMenuProxy();
	}

	public MenuProxy(String endpoint) {
		_endpoint = endpoint;
		_initMenuProxy();
	}

	private void _initMenuProxy() {
		try {
			menu = (new org.sirius.client.win32.core.classes.menu.MenuServiceLocator())
					.getMenuPort();
			if (menu != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) menu)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) menu)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (menu != null)
			((javax.xml.rpc.Stub) menu)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.sirius.client.win32.core.classes.menu.Menu getMenu() {
		if (menu == null)
			_initMenuProxy();
		return menu;
	}

	public int getMenuItemCount(long arg0) throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuItemCount(arg0);
	}

	public int getMenuString(long arg0, int arg1,
			org.apache.axis.types.UnsignedShort[] arg2, int arg3, int arg4)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuString(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean getMenuInfo(long arg0,
			org.sirius.client.win32.core.types.Menuinfo arg1)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuInfo(arg0, arg1);
	}

	public long getSubMenu(long arg0, int arg1) throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getSubMenu(arg0, arg1);
	}

	public int getMenuDefaultItem(long arg0, int arg1, int arg2)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuDefaultItem(arg0, arg1, arg2);
	}

	public int getMenuItemID(long arg0, int arg1)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuItemID(arg0, arg1);
	}

	public boolean getMenuItemInfo(long arg0, int arg1, boolean arg2,
			org.sirius.client.win32.core.types.Menuiteminfo arg3)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuItemInfo(arg0, arg1, arg2, arg3);
	}

	public boolean getMenuItemRect(long arg0, long arg1, int arg2,
			org.sirius.client.win32.core.types.Rect arg3)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuItemRect(arg0, arg1, arg2, arg3);
	}

	public boolean isMenu(long arg0) throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.isMenu(arg0);
	}

	public int getMenuState(long arg0, int arg1, int arg2)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.getMenuState(arg0, arg1, arg2);
	}

	public boolean pickItem(long arg0, long arg1, int arg2)
			throws java.rmi.RemoteException {
		if (menu == null)
			_initMenuProxy();
		return menu.pickItem(arg0, arg1, arg2);
	}

}