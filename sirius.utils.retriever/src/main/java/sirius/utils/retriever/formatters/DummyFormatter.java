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

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetFooter(java.util
     * .ArrayList)
     */
    public String GetFooter(final ArrayList<GHIssue> issues) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetHeader(java.util
     * .ArrayList)
     */
    public String GetHeader(final ArrayList<GHIssue> issues) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetIssue(org.kohsuke
     * .github.GHIssue)
     */
    public String GetIssue(final GHIssue issue) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetLabels(org.kohsuke
     * .github.GHIssue)
     */
    public String GetLabels(final GHIssue issue) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetMilestone(org.kohsuke
     * .github.GHMilestone)
     */
    public String GetMilestone(final GHMilestone milestone) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#Out(java.lang.String)
     */
    public void Out(final String text) {
        // TODO Auto-generated method stub

    }

}
