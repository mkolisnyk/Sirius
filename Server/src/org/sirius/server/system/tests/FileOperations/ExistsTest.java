package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.IOException;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExistsTest {
	protected String sourcePath = ".\\Test.txt";
	protected String nonExSourcePath = ".\\Test2.txt";

	protected File source = null;
	protected File nonExSource = null;
	protected FileOperations fileOps = new FileOperations();

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void baseTest() throws IOException {
		source = new File(sourcePath);

		source.delete();
		if (!source.exists()) {
			source.createNewFile();
		}

		nonExSource = new File(nonExSourcePath);

		nonExSource.delete();
		Assert.assertTrue(fileOps.Exists(sourcePath),
				"The existing path wasn't found");
		Assert.assertFalse(fileOps.Exists(nonExSourcePath),
				"The non-existing path was unexpectly found");
	}
}
