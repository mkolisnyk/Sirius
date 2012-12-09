package org.sirius.server.system.tests.SystemOperations;

import org.sirius.server.system.SystemOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMachineInfoTest {

	protected SystemOperations sysOps = new SystemOperations();

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getMachineNameTest() {
		Assert.assertEquals(sysOps.GetMachineName(),
				System.getenv("ComputerName"), "Invalid machine name");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getFreeSpaceTest() {
		Assert.assertEquals(sysOps.GetFreeDiskSpace(), Runtime.getRuntime()
				.freeMemory(), "Invalid free disk space");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getFreeMemoryTest() {
		Assert.assertEquals(sysOps.GetFreeMemory(), Runtime.getRuntime()
				.freeMemory(), "Invalid free memory");
	}

	@Test(groups = { "all", "server", "core", "server_core", "system",
			"server_system", "sysop" })
	public void getCurrentUserTest() {
		Assert.assertEquals(sysOps.GetCurrentUser(), System.getenv("USERNAME"),
				"Invalid current user");
	}
}
