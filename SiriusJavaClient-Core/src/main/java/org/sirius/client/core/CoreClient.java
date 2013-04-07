/**
 * 
 */
package org.sirius.client.core;

import org.sirius.client.core.system.dir.DirectoryOperationsProxy;
import org.sirius.client.core.system.file.FileOperationsProxy;
import org.sirius.client.core.system.process.ProcessOperationsProxy;
import org.sirius.client.core.system.sys.SystemOperationsProxy;

/**
 * @author Myk Kolisnyk
 * 
 */
public class CoreClient {

    private DirectoryOperationsProxy dirProxy;
    private FileOperationsProxy      fileProxy;
    private ProcessOperationsProxy   processProxy;
    private SystemOperationsProxy    systemProxy;

    public final DirectoryOperationsProxy dir() {
        return dirProxy;
    }

    public final FileOperationsProxy file() {
        return fileProxy;
    }

    public final ProcessOperationsProxy process() {
        return processProxy;
    }

    public final SystemOperationsProxy system() {
        return systemProxy;
    }

    /**
	 * 
	 */
    public CoreClient() {
        dirProxy = new DirectoryOperationsProxy();
        fileProxy = new FileOperationsProxy();
        processProxy = new ProcessOperationsProxy();
        systemProxy = new SystemOperationsProxy();
    }

}
