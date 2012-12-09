package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoveTest {
	protected String sourcePath = ".\\Test.txt";
	protected String destinationPath = ".\\Test2.txt";
	protected String longDestinationPath = ".\\Test\\Test3.txt";

	protected File source = null;
	protected File destination = null;
	protected File longDestination = null;
	protected FileOperations fileOps = new FileOperations();

	@BeforeMethod
	public void before() throws IOException {
		source = new File(sourcePath);
		destination = new File(destinationPath);
		longDestination = new File(longDestinationPath);

		source.delete();
		if (!source.exists()) {
			source.createNewFile();
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
			"server_system", "file" })
	public void baseMoveTest() throws IOException {

		Assert.assertTrue(
				fileOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Ordinary move didn't returned successful result");
		Assert.assertTrue(destination.exists(), "The source file wasn't copied");
		Assert.assertFalse(source.exists(), "The source file is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void overwriteMoveTest() throws IOException {
		baseMoveTest();

		FileWriter writer = new FileWriter(source);
		writer.write("Sample test");
		writer.close();

		long size = source.length();

		Assert.assertFalse(
				fileOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Default move operation should return error while trying to overwrite");
		Assert.assertTrue(source.exists(),
				"The source file was unexpectly removed");
		Assert.assertNotEquals(destination.length(), size,
				"Destination file appears to be equal to source. Move was accidently occured");

		Assert.assertFalse(
				fileOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath(), false),
				"Move with overwrite flag off should fail");
		Assert.assertTrue(source.exists(),
				"The source file was unexpectly removed");
		Assert.assertNotEquals(destination.length(), size,
				"Destination file appears to be equal to source. Move was accidently occured");

		Assert.assertTrue(
				fileOps.Move(source.getAbsolutePath(),
						destination.getAbsolutePath(), true),
				"Move with overwrite flag on should be successful");
		Assert.assertEquals(destination.length(), size,
				"Files weren't overwritten");
		Assert.assertFalse(source.exists(), "The source file is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void moveLongPathTest() throws IOException {
		destination = longDestination;
		overwriteMoveTest();
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void moveLongPathDirectory() throws IOException {
		File destFolder = longDestination.getParentFile();
		File expPath = new File(destFolder.getAbsolutePath()
				+ File.separator + source.getName());

		Assert.assertTrue(
				fileOps.Move(source.getAbsolutePath(),
						destFolder.getAbsolutePath()),
				"Failed to move to the folder");
		Assert.assertTrue(expPath.exists(), "The expected file wasn't found");
		Assert.assertFalse(source.exists(), "The source file is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void negativeTest() throws IOException {
		File negPath = new File("A:\\Test\\");

		Assert.assertFalse(
				fileOps.Move(source.getAbsolutePath(),
						negPath.getAbsolutePath()),
				"Move to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
		Assert.assertTrue(source.exists(),
				"The source file was unexpectly removed");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void negativeLongPathTest() throws IOException {
		String longFileName = "." + File.separator;
		for (int i = 0; i < 100; i++) {
			longFileName += "test" + i + File.separator;
		}

		File negPath = new File(longFileName);

		Assert.assertFalse(
				fileOps.Move(source.getAbsolutePath(),
						negPath.getAbsolutePath()),
				"Move to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
		Assert.assertTrue(source.exists(),
				"The source file was unexpectly removed");
	}
}
