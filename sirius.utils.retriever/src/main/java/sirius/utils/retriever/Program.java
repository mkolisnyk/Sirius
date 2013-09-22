/**
 * 
 */
package sirius.utils.retriever;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHMilestone;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import sirius.utils.retriever.formatters.CucumberFormatter;
import sirius.utils.retriever.formatters.DummyFormatter;
import sirius.utils.retriever.formatters.TraceabilityMatrixFormatter;
import sirius.utils.retriever.interfaces.IStoryFormatter;

/**
 * @author Myk Kolisnyk
 * 
 */
public class Program {

    public class IssuesComparator implements Comparator<GHIssue> {

        public IssuesComparator() {
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
         */
        public int compare(final GHIssue o1, final GHIssue o2) {
            int mileId1, mileId2;
            if (o1.getMilestone() == null) {
                mileId1 = 0;
            } else {
                mileId1 = o1.getMilestone().getNumber();
            }
            if (o2.getMilestone() == null) {
                mileId2 = 0;
            } else {
                mileId2 = o2.getMilestone().getNumber();
            }
            return mileId1 - mileId2;
        }

    }

    public static final String REPO_NAME       = "-r";
    public static final String USER_NAME       = "-u";
    public static final String USER_PASS       = "-p";
    public static final String OUTPUT_TYPE     = "-t";
    public static final String GROUPS          = "-g";
    public static final String OUTPUT_LOCATION = "-o";

    /**
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
        String userName = "";
        String password = "";
        String repository = "";
        String outputType = "";
        String[] groups = { "Test" };
        String outputLocation = "";

        IStoryFormatter formatter = new DummyFormatter();

        HashMap<String, String> params = new HashMap<String, String>();

        for (int i = 0; i < (2 * (args.length / 2)); i += 2) {
            if (i < args.length - 1) {
                params.put(args[i], args[i + 1]);
            }
        }

        if (params.containsKey(USER_NAME)) {
            userName = params.get(USER_NAME);
        }
        if (params.containsKey(USER_PASS)) {
            password = params.get(USER_PASS);
        }
        if (params.containsKey(REPO_NAME)) {
            repository = params.get(REPO_NAME);
        }
        if (params.containsKey(OUTPUT_TYPE)) {
            outputType = params.get(OUTPUT_TYPE);
        }
        if (params.containsKey(GROUPS)) {
            groups = params.get(GROUPS).split(";");
        }
        if (params.containsKey(OUTPUT_LOCATION)) {
            outputLocation = params.get(OUTPUT_LOCATION);
        }

        if (outputType.equals("trace")) {
            formatter = new TraceabilityMatrixFormatter();
        } else if (outputType.equals("cucumber")) {
            formatter = new CucumberFormatter(outputLocation);
        }

        GitHub client = GitHub.connectUsingPassword(userName, password);
        GHRepository repo = client.getMyself().getRepository(repository);

        ArrayList<GHIssue> issues = new ArrayList<GHIssue>();
        issues.addAll(repo.getIssues(GHIssueState.OPEN));
        issues.addAll(repo.getIssues(GHIssueState.CLOSED));

        Program p = new Program();
        IssuesComparator c = p.new IssuesComparator();
        Collections.sort(issues, c);

        formatter.Out(formatter.GetHeader(issues));

        int prevMilestoneId = -1;

        for (GHIssue issue : issues) {
            GHMilestone milestone = issue.getMilestone();

            if (milestone == null) {
                milestone = new GHMilestone();
            }

            if (milestone.getNumber() != prevMilestoneId) {
                prevMilestoneId = milestone.getNumber();
                formatter.Out(formatter.GetMilestone(milestone));
            }

            boolean matchGroups = false;
            for (String group : groups) {
                if (issue.getLabels().contains(group)) {
                    matchGroups = true;
                    break;
                }
            }

            if (matchGroups) {
                formatter.Out(formatter.GetIssue(issue));
            }
        }
    }

}
