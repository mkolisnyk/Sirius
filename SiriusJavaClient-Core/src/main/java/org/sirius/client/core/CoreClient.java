/**
 * .
 */
package org.sirius.client.core;

import org.sirius.client.core.system.dir.DirectoryOperationsProxy;
import org.sirius.client.core.system.file.FileOperationsProxy;
import org.sirius.client.core.system.process.ProcessOperationsProxy;
import org.sirius.client.core.system.sys.SystemOperationsProxy;

/**
 * @author Myk Kolisnyk
 * .
 */
public class CoreClient {

    /**
     * .
     */
    private DirectoryOperationsProxy dirProxy;

    /**
     * .
     */
    private FileOperationsProxy      fileProxy;

    /**
     * .
     */
    private ProcessOperationsProxy   processProxy;

    /**
     * .
     */
    private SystemOperationsProxy    systemProxy;

    /**
     * .
     * @return the instance of Directory operations client
     */
    public final DirectoryOperationsProxy dir() {
        return dirProxy;
    }

    /**
     * .
     * @return the instance of File operations client
     */
    public final FileOperationsProxy file() {
        return fileProxy;
    }

    /**
     * .
     * @return the instance of Process client
     */
    public final ProcessOperationsProxy process() {
        return processProxy;
    }

    /**
     * .
     * @return the instance of System object
     */
    public final SystemOperationsProxy system() {
        return systemProxy;
    }

    /**
     * .
     */
    public CoreClient() {
        dirProxy = new DirectoryOperationsProxy();
        fileProxy = new FileOperationsProxy();
        processProxy = new ProcessOperationsProxy();
        systemProxy = new SystemOperationsProxy();
    }

}
