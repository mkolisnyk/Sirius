package org.sirius.server.system.tests.DirectoryOperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.sirius.server.system.DirectoryOperations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateTest {

	private String dirName = ".\\Test\\";
	File dir = null;
	DirectoryOperations dirOps = null;

	@BeforeMethod
	@AfterMethod
	public void beforeTest() throws IOException {
		Files.deleteIfExists((new File(".\\Test\\Test1\\Test2\\")).toPath());
		Files.deleteIfExists((new File(".\\Test\\Test1\\Test2.txt")).toPath());
		Files.deleteIfExists((new File(".\\Test\\Test1\\")).toPath());
		Files.deleteIfExists((new File(".\\Test\\")).toPath());
		dir = new File(dirName);
		dirOps = new DirectoryOperations();
		Files.deleteIfExists(dir.toPath());
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void baseScenario() {
		Assert.assertTrue(dirOps.Create(dirName), "Failed to create test dir");
		Assert.assertTrue(dir.exists(),
				"The dir wasn't actually created though create method showed success");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void overwriteScenario() throws IOException {
		this.baseScenario();
		Assert.assertFalse(dirOps.Create(dirName),
				"The create operation showed success after trying overwriting existing dir");
		Assert.assertFalse(dirOps.Create(dirName, false),
				"The overwrite flag set to false didn't break the create operation");
		Assert.assertTrue(dirOps.Create(dirName, true),
				"The overwrite flag set to true wasn't successful");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void directoryPath() throws IOException {
		String longLoc = ".\\Test\\Test1\\Test2\\";
		File altdir = new File(longLoc);

		if (altdir.exists()) {
			altdir.delete();
		}

		if (altdir.getParentFile().exists()) {
			altdir.getParentFile().delete();
		}

		Assert.assertFalse(altdir.exists(), "Pre-condition failed. dir exists");

		Assert.assertTrue(dirOps.Create(longLoc), "Failed to create test dir");
		Assert.assertTrue(altdir.exists(),
				"The dir wasn't actually created though create method showed success");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void negativeTest() throws IOException {
		File negdir = new File("A:\\non-existing\\drive\\Test.txt");
		Assert.assertFalse(dirOps.Create(negdir.getPath()),
				"The dir couldn't be created at the specified location");

		negdir = new File(".\\*Test.txt");
		Assert.assertFalse(
				dirOps.Create(negdir.getPath()),
				"The dir couldn't be created at the specified location. The path contains special characters");

	}
}
