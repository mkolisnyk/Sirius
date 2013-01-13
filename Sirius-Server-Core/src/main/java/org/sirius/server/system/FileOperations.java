/**
 * 
 */
package org.sirius.server.system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author KaNoN
 * 
 */
@WebService
public class FileOperations {

	/**
	 * 
	 * @param path
	 * @param content
	 * @return
	 * @throws IOException 
	 */
	@WebResult(name = "status")
	public boolean append(@WebParam(name = "path") String path,
			@WebParam(name = "content") byte[] content) throws IOException {
		FileWriter writer = new FileWriter(path);
		
		String text = new String(content);
		
		writer.append(text);
		writer.close();
		return true;
	}

	/**
	 * 
	 * @param path
	 * @param text
	 * @return
	 * @throws IOException 
	 */
	@WebResult(name = "status")
	public boolean appendEx(@WebParam(name = "path") String path,
			@WebParam(name = "text") String text) throws IOException {
		FileWriter writer = new FileWriter(path);
		
		writer.append(text);
		writer.close();
		return true;
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 * @throws IOException
	 */
	@WebResult(name = "status")
	public boolean copy(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination)
			throws IOException {
		return copyEx(origin, destination, false);
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @param overwrite
	 * @return
	 */
	@WebResult(name = "status")
	public boolean copyEx(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination,
			@WebParam(name = "overwrite") boolean overwrite) throws IOException {
		File source = new File(origin);
		File dest = new File(destination);

		if (!source.getAbsoluteFile().exists()) {
			return false;
		}
		if (source.getAbsoluteFile().isDirectory()) {
			return false;
		}

		if (dest.getAbsoluteFile().exists()) {
			if (dest.getAbsoluteFile().isDirectory()) {
				dest = new File(dest.getAbsolutePath() + File.separator
						+ source.getName());
			}
			if (dest.getAbsoluteFile().isFile()) {
				if (overwrite) {
					dest.delete();
				} else {
					return false;
				}
			}
		} else {
			dest = new File(dest.getAbsoluteFile() + File.separator
					+ source.getName());
			dest.getAbsoluteFile().getParentFile().mkdirs();
		}

		if (dest.getAbsolutePath().length() > 255) {
			return false;
		}
		try {
			Files.copy(source.toPath(), dest.toPath());
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	@WebResult(name = "status")
	public boolean createFile(@WebParam(name = "fileName") String fileName) {
		return createFileEx(fileName, false);
	}

	/**
	 * 
	 * @param fileName
	 * @param overwrite
	 * @return
	 * @throws IOException
	 */
	@WebResult(name = "status")
	public boolean createFileEx(@WebParam(name = "fileName") String fileName,
			@WebParam(name = "overwrite") boolean overwrite) {
		File dest = new File(fileName);

		if (dest.exists()) {
			if (!overwrite) {
				return false;
			}

			dest.delete();
		}

		try {
			dest.getAbsoluteFile().getParentFile().mkdirs();
			return dest.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	@WebResult(name = "status")
	public boolean deleteFile(@WebParam(name = "fileName") String fileName) {
		File file = new File(fileName);
		if (file.exists() && file.isFile()) {
			file.delete();
		}
		return !file.exists() || !file.isFile();
	}
	
	/**
	 * 
	 * @param fileName
	 * @return
	 */
	@WebResult(name = "status")
	public boolean fileExists(@WebParam(name = "fileName") String fileName) {
		File file = new File(fileName);
		return file.exists() && file.isFile();
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	@WebResult(name = "content")
	public byte[] getAllBytes(@WebParam(name = "fileName") String fileName) {
		return null;
	}

	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	@WebResult(name = "content")
	public String[] getFileContents(@WebParam(name = "path") String path)
			throws IOException {
		return getFileContentsEx2(path, 0, Integer.MAX_VALUE);
	}

	/**
	 * 
	 * @param path
	 * @param start
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "getFileContentsEx")
	@WebResult(name = "content")
	public String[] getFileContentsEx(@WebParam(name = "path") String path,
			@WebParam(name = "start") int start) throws IOException {
		return getFileContentsEx2(path, start, Integer.MAX_VALUE);
	}

	/**
	 * 
	 * @param path
	 * @param start
	 * @param number
	 * @return
	 * @throws IOException
	 */
	@WebResult(name = "content")
	public String[] getFileContentsEx2(@WebParam(name = "path") String path,
			@WebParam(name = "start") int start,
			@WebParam(name = "number") int number) throws IOException {
		File file = new File(path);

		if (!file.exists() || !file.isFile()) {
			return null;
		}

		ArrayList<String> content = new ArrayList<String>();

		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line;
		int counter = 0;

		while ((line = br.readLine()) != null) {
			if ((long) counter >= (long) start
					&& (long) counter < ((long) start + (long) number)) {
				content.add(line);
			}
			counter++;
		}
		br.close();
		
		String result[] = new String[content.size()];

		result = content.toArray(result);
		return result;
	}

	/**
	 * 
	 * @param path
	 * @param lines
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "head")
	@WebResult(name = "content")
	public String[] head(@WebParam(name = "path") String path,
			@WebParam(name = "lines") int lines) throws IOException {
		return getFileContentsEx2(path, 0, lines);
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "move")
	@WebResult(name = "status")
	public boolean move(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination)
			throws IOException {
		return moveEx(origin, destination, false);
	}

	/**
	 * 
	 * @param origin
	 * @param destination
	 * @param overwrite
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "moveEx")
	@WebResult(name = "status")
	public boolean moveEx(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination,
			@WebParam(name = "overwrite") boolean overwrite) throws IOException {
		File source = new File(origin);
		File dest = new File(destination);

		if (dest.getAbsolutePath().length() > 255) {
			return false;
		}

		if (dest.exists()) {
			if (dest.isFile()) {
				if (!overwrite) {
					return false;
				} else {
					dest.delete();
				}
			} else {
				;
			}
		} else {
			dest.getAbsoluteFile().getParentFile().mkdirs();
		}

		try {
			Files.move(source.toPath(), dest.toPath());
		} catch (FileSystemException e) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	@WebMethod(operationName = "size")
	@WebResult(name = "fileSize")
	public long size(@WebParam(name = "fileName") String fileName) {
		File file = new File(fileName);
		if (!file.exists() || !file.isFile()) {
			return -1;
		}
		return file.length();
	}
	
	/**
	 * 
	 * @param path
	 * @param lines
	 * @return
	 * @throws IOException
	 */
	@WebMethod(operationName = "tail")
	@WebResult(name = "content")
	public String[] tail(@WebParam(name = "path") String path,
			@WebParam(name = "lines") int lines) throws IOException {

		File file = new File(path);

		if (!file.exists() || !file.isFile()) {
			return null;
		}

		ArrayList<String> content = new ArrayList<String>();

		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line;

		while ((line = br.readLine()) != null) {
			content.add(line);
			if (content.size() > lines) {
				content.remove(0);
			}
		}
		br.close();
		String result[] = new String[content.size()];

		result = content.toArray(result);
		return result;
	}

	/**
	 * 
	 * @param path
	 * @param content
	 * @return
	 * @throws IOException 
	 */
	@WebMethod(operationName = "write")
	@WebResult(name = "status")
	public boolean write(@WebParam(name = "path") String path,
			@WebParam(name = "content") byte[] content) throws IOException {
		FileWriter writer = new FileWriter(path);
		
		String text = new String(content);
		
		writer.write(text);
		writer.close();
		return true;
	}

	/**
	 * 
	 * @param path
	 * @param text
	 * @return
	 * @throws IOException 
	 */
	@WebMethod(operationName = "writeEx")
	@WebResult(name = "status")
	public boolean writeEx(@WebParam(name = "path") String path,
			@WebParam(name = "text") String text) throws IOException {
		FileWriter writer = new FileWriter(path);
		
		writer.write(text);
		writer.close();
		return true;
	}
}
