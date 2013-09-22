/**
 * 
 */
package sirius.utils.retriever;

import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.*;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author Myk Kolisnyk
 * 
 */
@Mojo(name = "generate",defaultPhase=LifecyclePhase.GENERATE_SOURCES)
public class IssueGetPlugin extends AbstractMojo {

    @Parameter(property = "issueget.user", defaultValue = "")
    private String   userName       = "";

    @Parameter(property = "issueget.password", defaultValue = "")
    private String   password       = "";

    @Parameter(property = "issueget.repository", defaultValue = "Sirius")
    private String   repository     = "";

    @Parameter(property = "issueget.type", defaultValue = "trace")
    private String   outputType     = "";

    @Parameter(property = "issueget.groups", defaultValue = "Test")
    private String groups;

    @Parameter(property = "issueget.output", defaultValue = ".")
    private String   outputLocation = "";

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }



    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }



    /**
     * @param repository the repository to set
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }



    /**
     * @param outputType the outputType to set
     */
    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }



    /**
     * @param groups the groups to set
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }



    /**
     * @param outputLocation the outputLocation to set
     */
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }



    public void execute() throws MojoExecutionException {
        String[] args = {
                Program.REPO_NAME,
                this.repository,
                Program.USER_NAME,
                this.userName,
                Program.USER_PASS,
                this.password,
                Program.GROUPS,
                this.groups,
                Program.OUTPUT_TYPE,
                this.outputType,
                Program.OUTPUT_LOCATION,
                this.outputLocation
        };
        try {
            Program.main(args);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
