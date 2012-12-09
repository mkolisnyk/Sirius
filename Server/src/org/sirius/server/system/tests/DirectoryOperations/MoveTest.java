package org.sirius.server.system.tests.DirectoryOperations;

import java.io.File;
import java.io.IOException;

import org.sirius.server.system.DirectoryOperations;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MoveTest {
	protected String sourcePath = ".\\Test.txt";
	protected String destinationPath = ".\\Test2.txt";
	protected String longDestinationPath = ".\\Test\\Test3.txt";

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
			source.mkdir();
		}
		if (destination.exists()) {
			destination.delete();
		}
		if (longDestination.exists()) {
			longDestination.delete();
		}
		if (longDestination.getParentFile().exists()) {
			longDestination.getParentFile().delete();
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
	public void baseMoveTest() {

		Assert.assertTrue(
				dirOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Ordinary move didn't returned successful result");
		Assert.assertTrue(destination.exists(), "The source dir wasn't copied");
		Assert.assertFalse(source.exists(), "The source dir is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void overwriteMoveTest() throws IOException {
		baseMoveTest();

		Assert.assertFalse(
				dirOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Default move operation should return error while trying to overwrite");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");

		Assert.assertFalse(
				dirOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath(), false),
				"Move with overwrite flag off should fail");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");

		Assert.assertTrue(
				dirOps.Move(source.getAbsolutePath(),
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
	public void moveLongPathDirectory() {
		File destFolder = longDestination.getParentFile();
		File expPath = new File(destFolder.getAbsolutePath()
				+ File.pathSeparator + source.getName());

		Assert.assertTrue(
				dirOps.Move(source.getAbsolutePath(),
						destFolder.getAbsolutePath()),
				"Failed to move to the folder");
		Assert.assertTrue(expPath.exists(), "The expected dir wasn't found");
		Assert.assertFalse(source.exists(), "The source dir is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void negativeTest() {
		File negPath = new File("A:\\Test\\");

		Assert.assertFalse(dirOps.Move(source.getAbsolutePath(),
				negPath.getAbsolutePath()),
				"Move to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void negativeLongPathTest() {
		String longFileName = "." + File.pathSeparator;
		for (int i = 0; i < 100; i++) {
			longFileName += "test" + i + File.pathSeparator;
		}

		File negPath = new File(longFileName);

		Assert.assertFalse(dirOps.Move(source.getAbsolutePath(),
				negPath.getAbsolutePath()),
				"Move to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
		Assert.assertTrue(source.exists(),
				"The source dir was unexpectly removed");
	}

}
