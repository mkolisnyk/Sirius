/**
 * 
 */
package sirius.utils.retriever.formatters;

import java.util.ArrayList;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHMilestone;

import sirius.utils.retriever.interfaces.IStoryFormatter;

/**
 * @author Myk Kolisnyk
 *
 */
public class CucumberFormatter implements IStoryFormatter {

    public final String eol = System.getProperty("line.separator");
    
    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetHeader(java.util.ArrayList)
     */
    public String GetHeader(ArrayList<GHIssue> issues) {
        return "";                
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetMilestone(org.kohsuke.github.GHMilestone)
     */
    public String GetMilestone(GHMilestone milestone) {
        return "# " + milestone.getTitle() + eol; 
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetIssue(org.kohsuke.github.GHIssue)
     */
    public String GetIssue(GHIssue issue) {
        return GetLabels(issue) + eol + "Feature: " + issue.getTitle() + eol +
            issue.getBody() + eol;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetFooter(java.util.ArrayList)
     */
    public String GetFooter(ArrayList<GHIssue> issues) {
        return "";
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetLabels(org.kohsuke.github.GHIssue)
     */
    public String GetLabels(GHIssue issue) {
        String result = "";
        
        String[] labels = new String[issue.getLabels().size()];
        issue.getLabels().toArray(labels);
        
        for(int i=4;i<labels.length;i+=8){
            result += "@" + labels[i] + " ";
        }
        
        return result;
    }
}
