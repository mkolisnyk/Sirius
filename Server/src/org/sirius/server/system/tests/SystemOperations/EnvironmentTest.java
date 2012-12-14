package org.sirius.server.system.tests.SystemOperations;

import java.io.IOException;

import org.sirius.server.system.SystemOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnvironmentTest {

	protected SystemOperations SysOps = new SystemOperations();

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getVariableTest() {
		String var = SysOps.getEnvironmentVariable("Path");
		Assert.assertNotNull(var,
				"Existing environment variable should not result with null");

		String var2 = SysOps.getEnvironmentVariable("PATH");
		Assert.assertEquals(var, var2,
				"Get environment variable is case sencitive to names");

		var2 = SysOps.getEnvironmentVariable("SomeNon-existing variable");
		Assert.assertNull(var2,
				"Non existing environment variable should result with null");
	}

	// @Test(groups = { "all", "server", "core", "server_core", "system",
	// "server_system", "sysop" })
	public void setVariableTest() throws IOException {
		String var = SysOps.getEnvironmentVariable("Path");

		SysOps.setEnvironmentVariable("Path", var + ";.\\Test");
		var = SysOps.getEnvironmentVariable("Path");
		Assert.assertTrue(var.endsWith(";.\\Test"),
				"Failed to update environment variable");

		SysOps.setEnvironmentVariable("NEWVAR", "Test");
		Assert.assertEquals(SysOps.getEnvironmentVariable("NEWVAR"), "Test",
				"New environment variable wasn't set");

	}
}
