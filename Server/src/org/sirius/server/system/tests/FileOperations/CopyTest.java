package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CopyTest {

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

		//source.delete();
		fileOps.Delete(source.getAbsolutePath());
		if (!source.exists()) {
			source.createNewFile();
		}
		fileOps.Delete(destinationPath);
		fileOps.Delete(longDestinationPath);
	}

	@AfterMethod
	public void after() {
		fileOps.Delete(source.getAbsolutePath());
		fileOps.Delete(destinationPath);
		fileOps.Delete(longDestinationPath);
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void baseCopyTest() throws IOException {

		before();
		Assert.assertTrue(
				fileOps.Copy(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Ordinary copy didn't returned successful result");
		Assert.assertTrue(destination.exists(), "The source file wasn't copied");

	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void overwriteCopyTest() throws IOException {
		baseCopyTest();

		FileWriter writer = new FileWriter(source);
		writer.write("Sample test");
		writer.close();

		Assert.assertFalse(
				fileOps.Copy(source.getAbsolutePath(),
						destination.getAbsolutePath()),
				"Default copy operation should return error while trying to overwrite");
		Assert.assertNotEquals(destination.length(), source.length(),
				"Destination file appears to be equal to source. Copy was accidently occured");

		Assert.assertFalse(
				fileOps.CopyEx(source.getAbsolutePath(),
						destination.getAbsolutePath(), false),
				"Copy with overwrite flag off should fail");
		Assert.assertNotEquals(destination.length(), source.length(),
				"Destination file appears to be equal to source. Copy was accidently occured");

		Assert.assertTrue(
				fileOps.CopyEx(source.getAbsolutePath(),
						destination.getAbsolutePath(), true),
				"Copy with overwrite flag on should be successful");
		Assert.assertEquals(destination.length(), source.length(),
				"Files weren't overwritten");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void copyLongPathTest() throws IOException {
		destination = longDestination;
		overwriteCopyTest();
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void copyLongPathDirectory() throws IOException {
		File destFolder = longDestination.getParentFile();
		File expPath = new File(destFolder.getAbsolutePath() + File.separator
				+ source.getName());

		Assert.assertTrue(
				fileOps.Copy(source.getAbsolutePath(),
						destFolder.getAbsolutePath()),
				"Failed to copy to the folder");
		Assert.assertTrue(expPath.exists(), "The expected file wasn't found");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void negativeTest() throws IOException {
		File negPath = new File("A:\\Test\\");

		Assert.assertFalse(
				fileOps.Copy(source.getAbsolutePath(),
						negPath.getAbsolutePath()),
				"Copy to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void negativeLongPathTest() throws IOException {
		String longFileName = "." + File.pathSeparator;
		for (int i = 0; i < 100; i++) {
			longFileName += "test" + i + File.pathSeparator;
		}

		File negPath = new File(longFileName);

		Assert.assertFalse(
				fileOps.Copy(source.getAbsolutePath(),
						negPath.getAbsolutePath()),
				"Copy to negative path appears to be successful");
		Assert.assertFalse(negPath.exists(),
				"The negative path wasn't supposed to exist");
	}
}
