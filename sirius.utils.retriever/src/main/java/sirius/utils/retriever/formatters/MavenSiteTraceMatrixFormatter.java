/**
 * 
 */
package sirius.utils.retriever.formatters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHMilestone;
import org.kohsuke.github.GHUser;

import sirius.utils.retriever.interfaces.IStoryFormatter;

/**
 * @author Myk Kolisnyk
 *
 */
public class MavenSiteTraceMatrixFormatter implements IStoryFormatter {

    private boolean     newMilestone = true;
    private String      outDir  = ".";
    private String      outFile = "github-trace-matrix.html";

    public final String eol     = System.getProperty("line.separator");
    public final String fs      = System.getProperty("file.separator");

    public MavenSiteTraceMatrixFormatter(final String outputLocation) {
        this.outDir = outputLocation;
    }
    
    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetFooter(java.util.ArrayList)
     */
    public String GetFooter(ArrayList<GHIssue> issues) {
        String output = "</table>";
        return output;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetHeader(java.util.ArrayList)
     */
    public String GetHeader(ArrayList<GHIssue> issues) {
        File res = new File(outDir + fs + outFile);
        if(res.exists() && res.isFile()){
            res.delete();
        }
        try {
            res.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String output = "<table border=1>" +
        		"<tr>" +
        		"<th>Requirement</th>" +                
                "<th>Test</th>" +                
                "<th>Closed</th>" +                
                "<th>Assigned To</th>" +                
                "<th>Logo</th>" +                
        		"</tr>";
        return output;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetIssue(org.kohsuke.github.GHIssue)
     */
    public String GetIssue(GHIssue issue) {
        GHUser user = issue.getAssignee();
        String output = "";

        if(!newMilestone){
            output = "<tr>" + output;
        }
        else {
            GHMilestone milestone = issue.getMilestone();
            int issuesCount = milestone.getClosedIssues() + milestone.getOpenIssues();
            int rowSpan = issuesCount;
            
            if(rowSpan==0){
                rowSpan=1;
            }
            
            output += "<tr><td rowspan=\"" + rowSpan + "\"><a href=\"" + milestone.getUrl()+ "\">" + 
                milestone.getTitle() + "</a></td>";
            
            if(issuesCount == 0){
                output += "<td>N/A</td><td>N/A</td><td>N/A</td></tr>";
            }
        }        
        output += "<td><a href=\"" + issue.getUrl() + "\">" + issue.getTitle() + "</td>" +
            "<td>"+ ((issue.getState().compareTo(GHIssueState.CLOSED) == 0)?("Yes"):("No")) + "</td>";
        if(user != null){
            try {
                output += "<td><a href=\"mailto://" + user.getEmail()+ "\">" + user.getName() + "</a></td>" +
                		"<td>" +
                		"<img src=\"" + user.getAvatarUrl() + "\" />" +
                		"</td></tr>";
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        newMilestone = false;
        return output;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetLabels(org.kohsuke.github.GHIssue)
     */
    public String GetLabels(GHIssue issue) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetMilestone(org.kohsuke.github.GHMilestone)
     */
    public String GetMilestone(GHMilestone milestone) {
        newMilestone = true;
        String output = "";
        /*int issuesCount = milestone.getClosedIssues() + milestone.getOpenIssues();
        int rowSpan = issuesCount;
        
        if(rowSpan==0){
            rowSpan=1;
        }
        
        String output = "<tr><td rowspan=\"" + rowSpan + "\"><a href=\"" + milestone.getUrl()+ "\">" + 
            milestone.getTitle() + "</a></td><td rowspan=\"" + rowSpan + "\"><pre>" +
                milestone.getDescription() + "</pre></td>";
        
        if(issuesCount == 0){
            output += "<td>N/A</td><td>N/A</td><td>N/A</td><td>N/A</td></tr>";
        }
        */
        return output;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#Out(java.lang.String)
     */
    public void Out(String text) {
        FileWriter writer;
        try {
            File file = new File(outDir + fs + outFile);
            if (!file.exists()) {
                System.out.println("File '" + outFile + "' wasn't found");
                return;
            }
            writer = new FileWriter(file.getAbsolutePath(), true);
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
