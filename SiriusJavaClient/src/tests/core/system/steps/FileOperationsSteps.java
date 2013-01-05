/**
 * 
 */
package tests.core.system.steps;

import java.rmi.RemoteException;

import org.jbehave.core.annotations.When;
import org.sirius.client.core.system.file.FileOperationsProxy;

/**
 * @author KaNoN
 * 
 */
public class FileOperationsSteps extends FileOperationsProxy {

	/**
	 * 
	 */
	public FileOperationsSteps() {
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#append(java.lang.String,
	 * byte[])
	 */
	public boolean append(String path, byte[] content) throws org.sirius.client.core.system.file.IOException, RemoteException {
		
		return super.append(path, content);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#appendEx(java.lang.String,
	 * java.lang.String)
	 */
	@When(value = "")
	public boolean appendEx(String path, String text) throws org.sirius.client.core.system.file.IOException, RemoteException{
		
		return super.appendEx(path, text);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#copy(java.lang.String,
	 * java.lang.String)
	 */
	@When(value = "")
	public boolean copy(String origin, String destination) throws org.sirius.client.core.system.file.IOException, RemoteException  {
		
		return super.copy(origin, destination);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#copyEx(java.lang.String,
	 * java.lang.String, boolean)
	 */
	@When(value = "")
	public boolean copyEx(String arg0, String arg1, boolean arg2) throws org.sirius.client.core.system.file.IOException, RemoteException   
			 {
		
		return super.copyEx(arg0, arg1, arg2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#createFile(java.lang.String)
	 */
	@When(value = "")
	public boolean createFile(String fileName) throws RemoteException   {
		
		return super.createFile(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.FileOperations#createFileEx(java.lang.String,
	 * boolean)
	 */
	@When(value = "")
	public boolean createFileEx(String arg0, boolean arg1) throws RemoteException   {
		
		return super.createFileEx(arg0, arg1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#deleteFile(java.lang.String)
	 */
	@When(value = "")
	public boolean deleteFile(String fileName) throws RemoteException   {
		
		return super.deleteFile(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#fileExists(java.lang.String)
	 */
	@When(value = "")
	public boolean fileExists(String fileName) throws RemoteException   {
		
		return super.fileExists(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.FileOperations#getAllBytes(java.lang.String)
	 */
	@When(value = "")
	public byte[] getAllBytes(String fileName) throws RemoteException   {
		
		return super.getAllBytes(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.FileOperations#getFileContents(java.lang.String)
	 */
	@When(value = "")
	public String[] getFileContents(String path) throws org.sirius.client.core.system.file.IOException, RemoteException  {
		
		return super.getFileContents(path);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.FileOperations#getFileContentsEx(java.lang.String
	 * , int)
	 */
	public String[] getFileContentsEx(String path, int start) throws org.sirius.client.core.system.file.IOException, RemoteException  
			 {
		
		return super.getFileContentsEx(path, start);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.FileOperations#getFileContentsEx2(java.lang.
	 * String, int, int)
	 */
	public String[] getFileContentsEx2(String path, int start, int number) throws org.sirius.client.core.system.file.IOException, RemoteException  
			 {
		
		return super.getFileContentsEx2(path, start, number);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#head(java.lang.String, int)
	 */
	
	public String[] head(String path, int lines) throws org.sirius.client.core.system.file.IOException, RemoteException  {
		
		return super.head(path, lines);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#move(java.lang.String,
	 * java.lang.String)
	 */
	@When(value = "")
	public boolean move(String origin, String destination) throws org.sirius.client.core.system.file.IOException, RemoteException  {
		
		return super.move(origin, destination);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#moveEx(java.lang.String,
	 * java.lang.String, boolean)
	 */
	@When(value = "")
	public boolean moveEx(String arg0, String arg1, boolean arg2) throws org.sirius.client.core.system.file.IOException, RemoteException 
			 {
		
		return super.moveEx(arg0, arg1, arg2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#size(java.lang.String)
	 */
	public long size(String fileName) throws RemoteException {
		
		return super.size(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#tail(java.lang.String, int)
	 */
	public String[] tail(String path, int lines) throws org.sirius.client.core.system.file.IOException, RemoteException {
		
		return super.tail(path, lines);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#write(java.lang.String,
	 * byte[])
	 */
	public boolean write(String path, byte[] content) throws org.sirius.client.core.system.file.IOException, RemoteException {
		
		return super.write(path, content);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.FileOperations#writeEx(java.lang.String,
	 * java.lang.String)
	 */
	@When(value = "")
	public boolean writeEx(String path, String text) throws org.sirius.client.core.system.file.IOException, RemoteException{
		
		return super.writeEx(path, text);
	}

}
