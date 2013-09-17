/**
 * 
 */
package sirius.utils.retriever.formatters;

import java.util.ArrayList;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHMilestone;

import sirius.utils.retriever.interfaces.IStoryFormatter;

/**
 * @author Myk Kolisnyk
 *
 */
public class DummyFormatter implements IStoryFormatter {

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetHeader(java.util.ArrayList)
     */
    public String GetHeader(ArrayList<GHIssue> issues) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetMilestone(org.kohsuke.github.GHMilestone)
     */
    public String GetMilestone(GHMilestone milestone) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetIssue(org.kohsuke.github.GHIssue)
     */
    public String GetIssue(GHIssue issue) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetFooter(java.util.ArrayList)
     */
    public String GetFooter(ArrayList<GHIssue> issues) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetLabels(org.kohsuke.github.GHIssue)
     */
    public String GetLabels(GHIssue issue) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#Out(java.lang.String)
     */
    public void Out(String text) {
        // TODO Auto-generated method stub
        
    }

}
