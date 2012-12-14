package org.sirius.server.system.tests.DirectoryOperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.sirius.server.system.DirectoryOperations;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExistsTest {
	protected String sourcePath = ".\\TestEx\\";
	protected String nonExSourcePath = ".\\TestNonEx\\";

	protected File source = null;
	protected File nonExSource = null;
	protected DirectoryOperations dirOps = new DirectoryOperations();

	@BeforeTest
	public void beforeTest() throws IOException {
		source = new File(sourcePath);

		if (!source.exists()) {
			source.mkdirs();
		}

		nonExSource = new File(nonExSourcePath);

		nonExSource.delete();
	}

	@AfterTest
	public void afterTest() throws IOException {
		Files.deleteIfExists(source.toPath());
		Files.deleteIfExists(nonExSource.toPath());
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "dir" })
	public void baseTest() {
		Assert.assertTrue(dirOps.exists(sourcePath),
				"The existing path wasn't found");
		Assert.assertFalse(dirOps.exists(nonExSourcePath),
				"The non-existing path was unexpectly found");
	}
}
