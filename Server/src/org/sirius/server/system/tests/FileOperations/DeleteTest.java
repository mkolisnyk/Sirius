package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.IOException;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteTest {

	protected String sourcePath = ".\\Test.txt";

	protected File source = null;
	protected FileOperations fileOps = new FileOperations();

	@BeforeTest
	@AfterTest
	public void beforeTest() throws IOException {
		source = new File(sourcePath);

		source.delete();
		if (!source.exists()) {
			source.createNewFile();
		}
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void baseTest() {
		Assert.assertTrue(fileOps.Delete(source.getAbsolutePath()),
				"Delete operation returned fault code");
		Assert.assertFalse(source.exists(),
				"The file to remove is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void negativeTest() {
		File nonExisting = new File(".\\NonExisting.txt");
		if (nonExisting.exists()) {
			nonExisting.delete();
		}
		Assert.assertTrue(fileOps.Delete(source.getAbsolutePath()),
				"Delete operation returned fault code");
		Assert.assertFalse(source.exists(),
				"The file to remove is still present");
	}
}
