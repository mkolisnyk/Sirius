/**
 * 
 */
package org.sirius.server.system;

import java.io.IOException;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlType;

/**
 * @author KaNoN
 * 
 */
@WebService
public class ProcessOperations {

	@XmlType
	public static class ProcessInfo {
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
	@WebResult(name = "processList")
	public ProcessInfo[] listAll() {
		return null;
	}

	/**
	 * 
	 * @param mask
	 * @return
	 */
	@WebResult(name = "processList")
	public ProcessInfo[] ListByMask(@WebParam(name = "mask") String mask) {
		return null;
	}

	/**
	 * 
	 * @param filter
	 * @return
	 */
	@WebResult(name = "processList")
	public ProcessInfo[] ListByFilter(
			@WebParam(name = "filter") ProcessInfo filter) {
		return null;
	}

	/**
	 * 
	 * @param command
	 * @return
	 * @throws IOException
	 */
	@WebResult(name = "status")
	public boolean start(@WebParam(name = "command") String command) {
		return startEx(command);
	}

	/**
	 * 
	 * @param command
	 * @param args
	 * @return
	 */
	@WebResult(name = "status")
	public boolean startEx(@WebParam(name = "command") String command,
			@WebParam(name = "args") String... args) {
		try {
			Runtime.getRuntime().exec(command, args);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param command
	 * @return
	 */
	public int run(@WebParam(name = "command") String command) {
		return runEx(command);
	}

	/**
	 * 
	 * @param command
	 * @param args
	 * @return
	 * @throws InterruptedException
	 */
	public int runEx(@WebParam(name = "command") String command,
			@WebParam(name = "args") String... args) {
		Process ps;
		try {
			ps = Runtime.getRuntime().exec(command, args);

		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		try {
			return ps.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return -1;
		}
	}

	/**
	 * 
	 * @param processName
	 * @return
	 */
	@WebResult(name = "status")
	public boolean kill(@WebParam(name = "processName") String processName) {
		return false;
	}

	/**
	 * 
	 * @param pid
	 * @return
	 */
	public int waitProcessCloseById(@WebParam(name = "pid") int pid) {
		return -1;
	}

	/**
	 * 
	 * @param pid
	 * @param timeout
	 * @return
	 */
	public int waitProcessCloseByIdEx(@WebParam(name = "pid") int pid,
			@WebParam(name = "timeout") int timeout) {
		return -1;
	}

	/**
	 * 
	 * @param process
	 * @return
	 */
	public int waitProcessClose(@WebParam(name = "process") String process) {
		return -1;
	}

	/**
	 * 
	 * @param process
	 * @param timeout
	 * @return
	 */
	public int waitProcessCloseEx(@WebParam(name = "process") String process,
			@WebParam(name = "timeout") int timeout) {
		return -1;
	}
}
