package org.sirius.server.system.tests.SystemOperations;

import java.io.File;

import org.sirius.server.system.SystemOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMachineInfoTest {

	protected SystemOperations sysOps = new SystemOperations();

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getMachineNameTest() {
		Assert.assertEquals(sysOps.getMachineName(),
				System.getenv("ComputerName"), "Invalid machine name");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getFreeSpaceTest() {
		File file = (new File(".\\"));

		Assert.assertEquals(sysOps.getFreeDiskSpace(file.getAbsolutePath()),
				file.getUsableSpace(), "Invalid free disk space");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getFreeMemoryTest() {
		Assert.assertEquals(sysOps.getFreeMemory(), Runtime.getRuntime()
				.freeMemory(), "Invalid free memory");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getCurrentUserTest() {
		Assert.assertEquals(sysOps.getCurrentUser(), System.getenv("USERNAME"),
				"Invalid current user");
	}
}
