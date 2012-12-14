/**
 * 
 */
package org.sirius.server.system;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;

/**
 * @author KaNoN
 * 
 */
@WebService
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
	public ProcessInfo[] listAll() {
		return null;
	}

	/**
	 * 
	 * @param mask
	 * @return
	 */
	public ProcessInfo[] ListByMask(String mask) {
		return null;
	}

	/**
	 * 
	 * @param filter
	 * @return
	 */
	public ProcessInfo[] ListByFilter(ProcessInfo filter) {
		return null;
	}

	/**
	 * 
	 * @param command
	 * @return
	 */
	public boolean start(String command) {
		return false;
	}

	/**
	 * 
	 * @param command
	 * @param args
	 * @return
	 */
	public boolean startEx(String command, String... args) {
		return false;
	}

	/**
	 * 
	 * @param command
	 * @return
	 */
	public int run(String command) {
		return -1;
	}

	/**
	 * 
	 * @param command
	 * @param args
	 * @return
	 */
	public int runEx(String command, String... args) {
		return -1;
	}

	/**
	 * 
	 * @param processName
	 * @return
	 */
	public boolean kill(String processName) {
		return false;
	}

	/**
	 * 
	 * @param pid
	 * @return
	 */
	public int waitProcessCloseById(int pid) {
		return -1;
	}

	/**
	 * 
	 * @param pid
	 * @param timeout
	 * @return
	 */
	public int waitProcessCloseByIdEx(int pid, int timeout) {
		return -1;
	}

	/**
	 * 
	 * @param process
	 * @return
	 */
	public int waitProcessClose(String process) {
		return -1;
	}

	/**
	 * 
	 * @param process
	 * @param timeout
	 * @return
	 */
	public int waitProcessCloseEx(String process, int timeout) {
		return -1;
	}
}
