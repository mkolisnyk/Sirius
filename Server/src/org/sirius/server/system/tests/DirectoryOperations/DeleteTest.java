package org.sirius.server.system.tests.DirectoryOperations;

import java.io.File;
import java.io.IOException;

import org.sirius.server.system.DirectoryOperations;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteTest {

	protected String sourcePath = ".\\Test\\";

	protected File source = null;
	protected DirectoryOperations dirOps = new DirectoryOperations();

	@BeforeTest
	@AfterTest
	public void beforeTest() throws IOException {
		source = new File(sourcePath);

		source.delete();
		if (!source.exists()) {
			source.mkdir();
		}
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void baseTest() {
		Assert.assertTrue(dirOps.Delete(source.getAbsolutePath()),
				"Delete operation returned fault code");
		Assert.assertFalse(source.exists(),
				"The dir to remove is still present");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void negativeTest() {
		File nonExisting = new File(".\\NonExisting.txt");
		if (nonExisting.exists()) {
			nonExisting.delete();
		}
		Assert.assertTrue(dirOps.Delete(source.getAbsolutePath()),
				"Delete operation returned fault code");
		Assert.assertFalse(source.exists(),
				"The dir to remove is still present");
	}
}
