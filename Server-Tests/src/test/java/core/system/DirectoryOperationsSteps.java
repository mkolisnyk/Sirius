/**
 * 
 */
package core.system;

import java.io.IOException;

import javax.jws.WebParam;
import junit.framework.Assert;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.sirius.server.system.DirectoryOperations;

/**
 * @author KaNoN
 * 
 */
public class DirectoryOperationsSteps extends DirectoryOperations {

	/**
	 * 
	 */
	public DirectoryOperationsSteps() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sirius.server.system.DirectoryOperations#copy(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean copy(String origin, String destination) throws IOException {

		return super.copy(origin, destination);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#copyEx(java.lang.String,
	 * java.lang.String, boolean)
	 */
	@Override
	public boolean copyEx(@WebParam(name = "origin") String arg0,
			@WebParam(name = "destination") String arg1,
			@WebParam(name = "overwrite") boolean arg2) throws IOException {

		return super.copyEx(arg0, arg1, arg2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#createDirectory(java.lang
	 * .String)
	 */
	@When(value = "I create the \"$path\" folder")
	public boolean createDirectory(@WebParam(name = "path") String path) {

		return super.createDirectory(path);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#createDirectoryEx(java.lang
	 * .String, boolean)
	 */
	@Override
	public boolean createDirectoryEx(@WebParam(name = "path") String path,
			@WebParam(name = "overwrite") boolean overwrite) {

		return super.createDirectoryEx(path, overwrite);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#delete(java.lang.String)
	 */
	@Override
	@Given(value = "the \"$path\" folder folder doesn't exist")
	@When(value = "I delete the \"$path\" folder")
	@Aliases(values = { "delete the \"$path\" folder" })
	public boolean delete(String path) throws IOException {

		return super.delete(path);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#exists(java.lang.String)
	 */
	@Override
	public boolean exists(String path) {
		return super.exists(path);
	}

	@Then(value = "I should see the \"$path\" folder is $available")
	@Aliases(values = { "the \"$path\" folder is $available" })
	public void verifyExists(String path, String available) {
		Assert.assertEquals("The '" + path + "' path is not actually "
				+ available, available.equals("available"), exists(path));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#getContents(java.lang.String
	 * )
	 */
	@Override
	public String[] getContents(@WebParam(name = "path") String path) {

		return super.getContents(path);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#getContentsEx(java.lang.
	 * String, boolean)
	 */
	@Override
	public String[] getContentsEx(@WebParam(name = "path") String path,
			@WebParam(name = "recursive") boolean recurcive) {

		return super.getContentsEx(path, recurcive);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#moveDirectory(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public boolean moveDirectory(@WebParam(name = "origin") String origin,
			@WebParam(name = "destination") String destination)
			throws IOException {

		return super.moveDirectory(origin, destination);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sirius.server.system.DirectoryOperations#moveDirectoryEx(java.lang
	 * .String, java.lang.String, boolean)
	 */
	@Override
	public boolean moveDirectoryEx(@WebParam(name = "origin") String arg0,
			@WebParam(name = "destination") String arg1,
			@WebParam(name = "overwrite") boolean arg2) throws IOException {
		return super.moveDirectoryEx(arg0, arg1, arg2);
	}

}
