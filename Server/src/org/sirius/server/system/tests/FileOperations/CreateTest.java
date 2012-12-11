package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateTest {

	private String fileName = ".\\Test.txt";
	File file = null;
	FileOperations fileOps = null;

	@BeforeMethod
	@AfterMethod
	public void beforeTest() {
		file = new File(fileName);
		fileOps = new FileOperations();
		if (file.exists()) {
			file.delete();
		}
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void baseScenario() {
		Assert.assertTrue(fileOps.Create(fileName),
				"Failed to create test file");
		Assert.assertTrue(file.exists(),
				"The file wasn't actually created though create method showed success");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void overwriteScenario() throws IOException {
		this.baseScenario();
		Assert.assertFalse(fileOps.Create(fileName),
				"The create operation showed success after trying overwriting existing file");
		Assert.assertFalse(fileOps.Create(fileName, false),
				"The overwrite flag set to false didn't break the create operation");
		Assert.assertTrue(fileOps.Create(fileName, true),
				"The overwrite flag set to true wasn't successful");

		FileWriter writer = new FileWriter(file);
		writer.write("Test");
		writer.close();
		Assert.assertNotEquals(file.length(), 0,
				"The file size wasn't changed after writing test string into it");

		Assert.assertTrue(fileOps.Create(fileName, true),
				"The overwrite flag set to true wasn't successful");
		Assert.assertEquals(file.length(), 0,
				"The file wasn't cleaned after repetitive create operation on existing file");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void directoryPath() throws IOException {
		String longLoc = ".\\Test\\Test1\\Test2.txt";
		File altFile = new File(longLoc);

		if (altFile.exists()) {
			altFile.delete();
		}

		if (altFile.getParentFile().exists()) {
			altFile.getParentFile().delete();
		}

		Assert.assertFalse(altFile.exists(),
				"Pre-condition failed. File exists");

		Assert.assertTrue(fileOps.Create(longLoc), "Failed to create test file");
		Assert.assertTrue(altFile.exists(),
				"The file wasn't actually created though create method showed success");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void negativeTest() throws IOException {
		File negFile = new File("A:\\non-existing\\drive\\Test.txt");
		Assert.assertFalse(fileOps.Create(negFile.getPath()),
				"The file couldn't be created at the specified location");

		negFile = new File(".\\*Test.txt");
		Assert.assertFalse(
				fileOps.Create(negFile.getPath()),
				"The file couldn't be created at the specified location. The path contains special characters");

	}
}
