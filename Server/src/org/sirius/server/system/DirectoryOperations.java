/**
 * 
 */
package org.sirius.server.system;

/**
 * @author KaNoN
 * 
 */
public class DirectoryOperations {

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 */
	public boolean Copy(String origin, String destination) {
		return false;
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @param overwrite
	 * @return
	 */
	public boolean Copy(String origin, String destination, boolean overwrite) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public boolean Create(String path) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @param overwrite
	 * @return
	 */
	public boolean Create(String path, boolean overwrite) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public boolean Delete(String path) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public boolean Exists(String path) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public String[] GetContents(String path) {
		return null;
	}

	/**
	 * 
	 * @param path
	 * @param recurcive
	 * @return
	 */
	public String[] GetContents(String path, boolean recurcive) {
		return null;
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 */
	public boolean Move(String origin, String destination) {
		return false;
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @param overwrite
	 * @return
	 */
	public boolean Move(String origin, String destination, boolean overwrite) {
		return false;
	}

}
