/**
 * 
 */
package org.sirius.server.system;

/**
 * @author KaNoN
 * 
 */
public class FileOperations {

	/**
	 * 
	 * @param path
	 * @param content
	 * @return
	 */
	public boolean Append(String path, byte[] content) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @param text
	 * @return
	 */
	public boolean Append(String path, String text) {
		return false;
	}


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
	 * @param fileName
	 * @return
	 */
	public boolean Create(String fileName) {
		return false;
	}

	/**
	 * 
	 * @param fileName
	 * @param overwrite
	 * @return
	 */
	public boolean Create(String fileName, boolean overwrite) {
		return false;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public boolean Delete(String fileName) {
		return false;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public boolean Exists(String fileName) {
		return false;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public byte[] GetAllBytes(String fileName) {
		return null;
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
	 * @param start
	 * @return
	 */
	public String[] GetContents(String path, int start) {
		return null;
	}

	/**
	 * 
	 * @param path
	 * @param start
	 * @param number
	 * @return
	 */
	public String[] GetContents(String path, int start, int number) {
		return null;
	}

	/**
	 * 
	 * @param path
	 * @param lines
	 * @return
	 */
	public String[] Head(String path, int lines) {
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

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public int Size(String fileName) {
		return -1;
	}

	/**
	 * 
	 * @param path
	 * @param lines
	 * @return
	 */
	public String[] Tail(String path, int lines) {
		return null;
	}

	/**
	 * 
	 * @param path
	 * @param content
	 * @return
	 */
	public boolean Write(String path, byte[] content) {
		return false;
	}

	/**
	 * 
	 * @param path
	 * @param text
	 * @return
	 */
	public boolean Write(String path, String text) {
		return false;
	}
}
