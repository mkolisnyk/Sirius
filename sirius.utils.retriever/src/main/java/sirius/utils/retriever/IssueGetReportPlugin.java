/**
 * 
 */
package sirius.utils.retriever;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.maven.doxia.sink.Sink;
import org.apache.maven.doxia.siterenderer.Renderer;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.reporting.AbstractMavenReport;
import org.apache.maven.reporting.MavenReportException;

/**
 * @author Myk Kolisnyk
 * @goal trace
 * @phase site
 */
public class IssueGetReportPlugin extends AbstractMavenReport {
    public final String fs      = System.getProperty("file.separator");
    public final String eol     = System.getProperty("line.separator");

    //@Parameter(property = "issueget.user", defaultValue = "")
    
    /**
     * @parameter expression="${issueget.user}"
     * @required
     */
    private String   userName       = "";

    //@Parameter(property = "issueget.password", defaultValue = "")
    
    /**
     * @parameter expression="${issueget.password}"
     * @required
     */
    private String   password       = "";

    //@Parameter(property = "issueget.repository", defaultValue = "Sirius")
    
    /**
     * @parameter expression="${issueget.repository}"
     * @required
     */
    private String   repository     = "";

    //@Parameter(property = "issueget.type", defaultValue = "trace")
    /**
     * @parameter expression="trace"
     */
    private String   outputType     = "trace";

    //@Parameter(property = "issueget.groups", defaultValue = "Test")
    
    /**
     * @parameter
     * @required
     */
    private String groups = "";

    /**
     * Directory where reports will go.
     *
     * @parameter expression="${project.reporting.outputDirectory}"
     * @required
     * @readonly
     */
    private String outputDirectory;
 
    /**
     * @parameter default-value="${project}"
     * @required
     * @readonly
     */
    private MavenProject project;
 
    /**
     * @component
     * @required
     * @readonly
     */
    private Renderer siteRenderer;
    
    protected MavenProject getProject()
    {
        return project;
    }
     
    protected String getOutputDirectory()
    {
        return outputDirectory;
    }
     
    protected Renderer getSiteRenderer()
    {
        return siteRenderer;
    }
     
    public String getDescription( Locale locale )
    {
        return "GitHub Report showing related milestones and corresponding test tickets";
        //getBundle( locale ).getString( "report.matrix.description" );
    }
     
    public String getName( Locale locale )
    {
        return "Traceability Matrix";//getBundle( locale ).getString( "report.matrix.name" );
    }
     
    public String getOutputName()
    {
        return "trace";
    }
     
    /*private ResourceBundle getBundle( Locale locale )
    {
        return ResourceBundle.getBundle( "trace", locale, this.getClass().getClassLoader() );
    }*/

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the repository
     */
    public String getRepository() {
        return repository;
    }

    /**
     * @return the outputType
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * @return the groups
     */
    public String getGroups() {
        return groups;
    }    
    
    /* (non-Javadoc)
     * @see org.apache.maven.reporting.AbstractMavenReport#executeReport(java.util.Locale)
     */
    @Override
    protected void executeReport(Locale arg0) throws MavenReportException {
        
        Log log = getLog();
        
        log.info("Initializing Report Execution...");
        log.debug(String.format("Parameters:%s" +
        		"-Repository: %s%s" +
        		"-User: %s%s" +
        		"-Password: %s%s" +
        		"-Groups: %s%s" +
        		"-Output Type: %s%s" +
        		"-Output Directory: %s",
                eol,this.repository,
                eol,this.userName,
                eol,this.password,
                eol,this.groups,
                eol,this.outputType,
                eol,this.outputDirectory));
        
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
                this.outputDirectory
        };
        try {
            log.info("Starting Report Execution...");
            Program.main(args);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        log.info("Report Generation Completed");
        
        File report = new File(this.outputDirectory + fs + "github-trace-matrix.html");
        
        Sink sink = getSink();
        sink.head();
        sink.title();
        sink.text("Traceability Matrix Report");
        sink.title_();
        sink.head_();
     
        sink.body();
        sink.section1();
     
        sink.sectionTitle1();
        sink.text("Traceability Matrix Report");
        sink.sectionTitle1_();
        try {
            sink.rawText(FileUtils.readFileToString(report));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        sink.section1_();
        sink.body_();
        sink.flush();
        sink.close();
    }
}
