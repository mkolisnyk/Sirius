package org.sirius.server.system.tests.FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import org.sirius.server.system.FileOperations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SizeTest {

	protected String sourcePath = ".\\TestSize.txt";
	protected File source = null;
	protected FileOperations fileOps = new FileOperations();

	@BeforeMethod
	@AfterMethod
	public void beforeMethod() throws IOException {
		source = new File(sourcePath);

		if (source.exists()) {
			fileOps.Delete(sourcePath);
		}
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "file" })
	public void sizeTest() throws IOException {
		String text = "Test Text";
		source.createNewFile();
		Assert.assertEquals(fileOps.Size(source.getAbsolutePath()), 0,
				"Empty file doesn't return the 0 size");

		FileWriter writer = new FileWriter(source);
		writer.write(text);
		writer.close();

		Assert.assertEquals(fileOps.Size(source.getAbsolutePath()),
				text.length(),
				"Non-Empty file doesn't return the non-zero size");

		source.delete();
		Assert.assertEquals(fileOps.Size(source.getAbsolutePath()), -1,
				"Non-existing file should return -1 size");

	}
}
