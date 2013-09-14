/**
 * 
 */
package sirius.utils.retriever.interfaces;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHMilestone;

/**
 * @author Myk Kolisnyk
 *
 */
public interface IStoryFormatter {
    public String WriteStory(GHMilestone milestone);
    public String WriteIssue(GHIssue issue);
}
