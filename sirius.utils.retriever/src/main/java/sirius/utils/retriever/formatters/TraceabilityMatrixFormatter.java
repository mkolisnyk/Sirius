/**
 * 
 */
package sirius.utils.retriever.formatters;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHMilestone;

import sirius.utils.retriever.interfaces.IStoryFormatter;

/**
 * @author Myk Kolisnyk
 *
 */
public class TraceabilityMatrixFormatter implements IStoryFormatter {

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#WriteStory(org.kohsuke.github.GHMilestone)
     */
    public String WriteStory(GHMilestone milestone) {
        
        return null;
    }

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#WriteIssue(org.kohsuke.github.GHIssue)
     */
    public String WriteIssue(GHIssue issue) {
        // TODO Auto-generated method stub
        return null;
    }
}
