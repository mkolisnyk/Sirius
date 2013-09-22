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
public class TraceabilityMatrixFormatter implements IStoryFormatter {

    public final String eol = System.getProperty("line.separator");

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetFooter(java.util
     * .ArrayList)
     */
    public String GetFooter(final ArrayList<GHIssue> issues) {
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetHeader(java.util
     * .ArrayList)
     */
    public String GetHeader(final ArrayList<GHIssue> issues) {
        return "# Tests status" + eol + eol;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetIssue(org.kohsuke
     * .github.GHIssue)
     */
    public String GetIssue(final GHIssue issue) {
        return "|"
                + GetLabels(issue)
                + " | ["
                + issue.getTitle()
                + "]("
                + issue.getUrl()
                + ") | "
                + ((issue.getState().equals(GHIssueState.CLOSED)) ? ("Yes")
                        : ("No")) + "|";
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetLabels(org.kohsuke
     * .github.GHIssue)
     */
    public String GetLabels(final GHIssue issue) {
        String result = "";

        String[] labels = new String[issue.getLabels().size()];
        issue.getLabels().toArray(labels);

        for (int i = 4; i < labels.length; i += 8) {
            result += "[" + labels[i] + "](" + labels[i - 2] + ") ";
        }

        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#GetMilestone(org.kohsuke
     * .github.GHMilestone)
     */
    public String GetMilestone(final GHMilestone milestone) {
        return "## Feature: [" + milestone.getTitle() + "]("
                + milestone.getUrl() + ")" + eol + "```" + eol
                + milestone.getDescription() + eol + "```" + eol + eol
                + "| Group | Test | Completed |" + eol
                + "|-------|------|-----------|";
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * sirius.utils.retriever.interfaces.IStoryFormatter#Out(java.lang.String)
     */
    public void Out(final String text) {
        System.out.println(text);
    }
}
