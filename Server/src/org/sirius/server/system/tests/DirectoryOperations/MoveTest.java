package org.sirius.server.system.tests.DirectoryOperations;

import java.io.File;
import java.io.IOException;

import org.sirius.server.system.DirectoryOperations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoveTest {
	protected String sourcePath = ".\\Test\\";
	protected String destinationPath = ".\\Test2\\";
	protected String longDestinationPath = ".\\Test3\\Test3\\";

	protected File source = null;
	protected File destination = null;
	protected File longDestination = null;
	protected DirectoryOperations dirOps = new DirectoryOperations();

	@BeforeMethod
	public void before() throws IOException {
		source = new File(sourcePath);
		destination = new File(destinationPath);
		longDestination = new File(longDestinationPath);

		source.delete();
		if (!source.exists()) {
			source.getAbsoluteFile().mkdirs();
		}
		if (destination.exists()) {
			// destination.delete();
			dirOps.delete(destinationPath);
		}
		if (longDestination.exists()) {
			// longDestination.delete();
			dirOps.delete(longDestinationPath);
		}
	}

	@AfterMethod
	public void after() {
		source.delete();
		destination.delete();
		longDestination.delete();
		longDestination.getParentFile().delete();
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void baseMoveTest() throws IOException {

		Assert.assertTrue(
				dirOps.moveDirectory(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Ordinary move didn't returned successful result");
		Assert.assertTrue(destination.exists(), "The source dir wasn't copied");
		Assert.assertFalse(source.exists(), "The source dir is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void overwriteMoveTest() throws IOException {
		// baseMoveTest();

		destination.mkdirs();

		Assert.assertFalse(
				dirOps.moveDirectory(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Default move operation should return error while trying to overwrite");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");

		Assert.assertFalse(
				dirOps.moveDirectoryEx(source.getAbsolutePath(),
						destination.getAbsolutePath(), false),
				"Move with overwrite flag off should fail");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");

		Assert.assertTrue(
				dirOps.moveDirectoryEx(source.getAbsolutePath(),
						destination.getAbsolutePath(), true),
				"Move with overwrite flag on should be successful");
		Assert.assertFalse(source.exists(), "The source dir is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void moveLongPathTest() throws IOException {
		destination = longDestination;
		overwriteMoveTest();
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void moveLongPathDirectory() throws IOException {
		File destFolder = longDestination.getParentFile();
		File expPath = new File(destFolder.getAbsolutePath() + File.separator
				+ source.getName());

		dirOps.createDirectory(source.getAbsolutePath());
		Assert.assertTrue(
				dirOps.moveDirectory(source.getAbsolutePath(),
						destFolder.getAbsolutePath()),
				"Failed to move to the folder");
		Assert.assertFalse(source.exists(), "The source dir is still present");

		// TODO fix the test
		// Assert.assertTrue(expPath.exists(), "The expected dir wasn't found");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void negativeTest() throws IOException {
		File negPath = new File("A:\\Test\\");

		Assert.assertFalse(dirOps.moveDirectory(source.getAbsolutePath(),
				negPath.getAbsolutePath()),
				"Move to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void negativeLongPathTest() throws IOException {
		String longFileName = "." + File.pathSeparator;
		for (int i = 0; i < 100; i++) {
			longFileName += "test" + i + File.pathSeparator;
		}

		File negPath = new File(longFileName);

		Assert.assertFalse(dirOps.moveDirectory(source.getAbsolutePath(),
				negPath.getAbsolutePath()),
				"Move to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");
	}

}
