/**
 * .
 */
package org.sirius.server;

/**
 * @author KaNoN
 * .
 */
public class PackageOptions {
	/**
	 * .
	 */
	private String _endPoint = null;
	/**
	 * .
	 */
	private String _className = null;
	/**
	 * .
	 */
	private String _packageLocation = null;

	/**
	 * .
	 * @param endPoint
	 * @param className
	 * @param packageLocation
	 */
	public PackageOptions(String endPoint, String className,
			String packageLocation) {
		_endPoint = endPoint;
		_className = className;
		_packageLocation = packageLocation;
	}

	/**
	 * @return the _endPoint
	 */
	public final String get_endPoint() {
		return _endPoint;
	}

	/**
	 * @return the _className
	 */
	public final String get_className() {
		return _className;
	}

	/**
	 * @return the _packageLocation
	 */
	public final String get_packageLocation() {
		return _packageLocation;
	}
}
