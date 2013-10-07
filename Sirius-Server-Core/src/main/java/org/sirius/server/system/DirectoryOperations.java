/**
 * 
 */
package org.sirius.server.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.apache.commons.io.FileUtils;

/**
 * @author KaNoN
 * 
 */
@WebService
public class DirectoryOperations {

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "copy")
	@WebResult(name = "status")
	public boolean copy(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination)
			throws IOException {
		return copyEx(origin, destination, false);
	}

	/**
	 * .
	 * @param source .
	 * @param dest .
	 * @param overwrite .
	 * @return .
	 */
	private boolean validateDirCopy(
	        File source,
	        File dest,
	        boolean overwrite ){
	    if (//!source.getAbsoluteFile().exists() ||
                !source.getAbsoluteFile().isDirectory() ||
                dest.getAbsolutePath().length() > 255 ) {
            return false;
        }

        if (dest.getAbsoluteFile().exists()
                && !overwrite) {
            return false;
        }

        return true;
	}
	
	/**
	 * 
	 * @param origin
	 * @param destination
	 * @param overwrite
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "copyEx")
	@WebResult(name = "status")
	public boolean copyEx(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination,
			@WebParam(name = "overwrite") boolean overwrite) throws IOException {
		File source = new File(origin);
		File dest = new File(destination);

		if( !validateDirCopy(source, dest, overwrite)){
		    return false;
		}

		FileUtils.copyDirectory(source, dest);
		return true;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	@WebMethod(operationName = "create")
	@WebResult(name = "status")
	public boolean createDirectory(@WebParam(name = "path") String path) {
		return createDirectoryEx(path, false);
	}

	/**
	 * 
	 * @param path
	 * @param overwrite
	 * @return
	 */
	@WebMethod(operationName = "createEx")
	@WebResult(name = "status")
	public boolean createDirectoryEx(@WebParam(name = "path") String path,
			@WebParam(name = "overwrite") boolean overwrite) {
		File dir = new File(path);
		if (dir.getAbsolutePath().length() > 255) {
			return false;
		}
		if (dir.exists() && dir.isDirectory()) {
			if (overwrite) {
				dir.delete();
			} else {
				return false;
			}
		}
		dir.mkdirs();

		return dir.exists() && dir.isDirectory();
	}

	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "delete")
	@WebResult(name = "status")
	public boolean delete(@WebParam(name = "path") String path)
			throws IOException {
		File dir = new File(path);

		String[] names = dir.list();

		try {
			if (names != null) {
				for (String name : names) {
					if (!delete(path + File.separator + name)) {
						return false;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}

		Files.deleteIfExists(dir.toPath());
		return !(dir.exists() && dir.isDirectory());
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	@WebMethod(operationName = "exists")
	@WebResult(name = "status")
	public boolean exists(@WebParam(name = "path") String path) {
		File dir = new File(path);
		return dir.exists() && dir.isDirectory();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	@WebMethod(operationName = "getContents")
	@WebResult(name = "contents")
	public String[] getContents(@WebParam(name = "path") String path) {
		return getContentsEx(path,false);
	}

	/**
	 * 
	 * @param path
	 * @param recurcive
	 * @return
	 */
	@WebMethod(operationName = "getContentsEx")
	@WebResult(name = "contents")
	public String[] getContentsEx(@WebParam(name = "path") String path,
			@WebParam(name = "recursive") boolean recurcive) {
		File dir = new File(path);
		
		return dir.list();
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "moveDirectory")
	@WebResult(name = "status")
	public boolean moveDirectory(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination)
			throws IOException {
		return moveDirectoryEx(origin, destination, false);
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @param overwrite
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "moveDirectoryEx")
	@WebResult(name = "status")
	public boolean moveDirectoryEx(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination,
			@WebParam(name = "overwrite") boolean overwrite) throws IOException {
		File source = new File(origin);
		File dest = new File(destination);

		if( !validateDirCopy(source, dest, overwrite)){
		    return false;
		}
		
		dest.delete();
		try {
		    FileUtils.moveDirectory(source, dest);
		} catch (NoSuchFileException e) {
			return false;
		}
		return dest.exists() && dest.isDirectory()
				&& !(source.exists());
	}

}
