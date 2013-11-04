/**
 * .
 */
package org.sirius.client.core;

import org.sirius.client.core.system.dir.DirectoryOperationsProxy;
import org.sirius.client.core.system.file.FileOperationsProxy;
import org.sirius.client.core.system.process.ProcessOperationsProxy;
import org.sirius.client.core.system.sys.SystemOperationsProxy;

/**
 * The main class which provides interface to Sirius Core methods.
 * It is used for multiple purposes:
 * <ul>
 * <li> it is used as the container for the proxy classes interacting with Server side.
 * <li> for the API users it's the highest level object which provides interaction with Server Core components.
 * </ul> 
 * @author Myk Kolisnyk 
 */
public class CoreClient {

    /**
     * Reference for the proxy class responsible for interaction with directories.
     */
    private DirectoryOperationsProxy dirProxy;

    /**
     * Reference for the proxy class responsible for interaction with files.
     */
    private FileOperationsProxy      fileProxy;

    /**
     * Reference for the proxy class responsible for interaction with system processes.
     */
    private ProcessOperationsProxy   processProxy;

    /**
     * Reference for the proxy class responsible for interaction with system options.
     */
    private SystemOperationsProxy    systemProxy;

    /**
     * Provides interface for the operations interacting with directories.
     * @return the instance of Directory operations client
     */
    public final DirectoryOperationsProxy dir() {
        return dirProxy;
    }

    /**
     * Provides interface for the operations interacting with files.
     * @return the instance of File operations client
     */
    public final FileOperationsProxy file() {
        return fileProxy;
    }

    /**
     * Provides interface for the operations interacting with processes in the system.
     * @return the instance of Process client
     */
    public final ProcessOperationsProxy process() {
        return processProxy;
    }

    /**
     * Provides interface for the operations interacting with general system options.
     * @return the instance of System object
     */
    public final SystemOperationsProxy system() {
        return systemProxy;
    }

    /**
     * Creates instance of CoreClient object initializing Server connection with default endpoint address.
     * For the Core component it's <b>http://localhost:21212</b>
     */
    public CoreClient() {
        dirProxy = new DirectoryOperationsProxy();
        fileProxy = new FileOperationsProxy();
        processProxy = new ProcessOperationsProxy();
        systemProxy = new SystemOperationsProxy();
    }

}
