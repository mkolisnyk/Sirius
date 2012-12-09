package org.sirius.server.system.tests.DirectoryOperations;

import java.io.File;
import java.io.IOException;

import org.sirius.server.system.DirectoryOperations;
import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExistsTest {
	protected String sourcePath = ".\\Test\\";
	protected String nonExSourcePath = ".\\Test2\\";

	protected File source = null;
	protected File nonExSource = null;
	protected DirectoryOperations dirOps = new DirectoryOperations();

	@BeforeTest
	@AfterTest
	public void beforeTest() throws IOException {
		source = new File(sourcePath);

		source.delete();
		if (!source.exists()) {
			source.mkdir();
		}

		nonExSource = new File(nonExSourcePath);

		nonExSource.delete();
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void baseTest() {
		Assert.assertTrue(dirOps.Exists(sourcePath),
				"The existing path wasn't found");
		Assert.assertFalse(dirOps.Exists(nonExSourcePath),
				"The non-existing path was unexpectly found");
	}
}
