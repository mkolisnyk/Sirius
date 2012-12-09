/**
 * 
 */
package org.sirius.server.system;

/**
 * @author KaNoN
 * 
 */
public class ProcessOperations {

	public class ProcessInfo {
		private String ImageName = null;
		private int PID = 0;
		private String SessionName = null;
		private int SessionNum = 0;
		private int MemUsage = 0;

		/**
		 * @return the imageName
		 */
		public String getImageName() {
			return ImageName;
		}

		/**
		 * @param imageName
		 *            the imageName to set
		 */
		public void setImageName(String imageName) {
			ImageName = imageName;
		}

		/**
		 * @return the pID
		 */
		public int getPID() {
			return PID;
		}

		/**
		 * @param pID
		 *            the pID to set
		 */
		public void setPID(int pID) {
			PID = pID;
		}

		/**
		 * @return the sessionName
		 */
		public String getSessionName() {
			return SessionName;
		}

		/**
		 * @param sessionName
		 *            the sessionName to set
		 */
		public void setSessionName(String sessionName) {
			SessionName = sessionName;
		}

		/**
		 * @return the sessionNum
		 */
		public int getSessionNum() {
			return SessionNum;
		}

		/**
		 * @param sessionNum
		 *            the sessionNum to set
		 */
		public void setSessionNum(int sessionNum) {
			SessionNum = sessionNum;
		}

		/**
		 * @return the memUsage
		 */
		public int getMemUsage() {
			return MemUsage;
		}

		/**
		 * @param memUsage
		 *            the memUsage to set
		 */
		public void setMemUsage(int memUsage) {
			MemUsage = memUsage;
		}
	}

	/**
	 * 
	 * @return
	 */
	public ProcessInfo[] List() {
		return null;
	}

	/**
	 * 
	 * @param mask
	 * @return
	 */
	public ProcessInfo[] List(String mask) {
		return null;
	}

	/**
	 * 
	 * @param filter
	 * @return
	 */
	public ProcessInfo[] List(ProcessInfo filter) {
		return null;
	}

	/**
	 * 
	 * @param command
	 * @return
	 */
	public boolean Start(String command) {
		return false;
	}

	/**
	 * 
	 * @param command
	 * @param args
	 * @return
	 */
	public boolean Start(String command, String... args) {
		return false;
	}

	/**
	 * 
	 * @param command
	 * @return
	 */
	public int Run(String command) {
		return -1;
	}

	/**
	 * 
	 * @param command
	 * @param args
	 * @return
	 */
	public int Run(String command, String... args) {
		return -1;
	}

	/**
	 * 
	 * @param processName
	 * @return
	 */
	public boolean Kill(String processName) {
		return false;
	}

	/**
	 * 
	 * @param pid
	 * @return
	 */
	public int Wait(int pid) {
		return -1;
	}

	/**
	 * 
	 * @param pid
	 * @param timeout
	 * @return
	 */
	public int Wait(int pid, int timeout) {
		return -1;
	}

	/**
	 * 
	 * @param process
	 * @return
	 */
	public int Wait(String process) {
		return -1;
	}

	/**
	 * 
	 * @param process
	 * @param timeout
	 * @return
	 */
	public int Wait(String process, int timeout) {
		return -1;
	}
}
