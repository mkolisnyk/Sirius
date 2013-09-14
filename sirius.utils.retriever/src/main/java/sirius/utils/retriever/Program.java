/**
 * 
 */
package sirius.utils.retriever;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHMilestone;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 * @author Myk Kolisnyk
 *
 */
public class Program {

    public class IssuesComparator implements Comparator<GHIssue> {

        public IssuesComparator(){;}
        
        /* (non-Javadoc)
         * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
         */
        public int compare(GHIssue o1, GHIssue o2) {
            int mileId1,mileId2;
            if(o1.getMilestone()==null){
                mileId1 = 0;
            }
            else {
               mileId1 = o1.getMilestone().getNumber();  
            }
            if(o2.getMilestone()==null){
                mileId2 = 0;
            }
            else {
               mileId2 = o2.getMilestone().getNumber();  
            }
            return mileId1 - mileId2;
        }
        
    }
    
    public String getLabelNames(GHIssue issue) {
        String result = "";
        
        String[] labels = new String[issue.getLabels().size()];
        issue.getLabels().toArray(labels);
        /*for(String label:issue.getLabels()){
            result += label.split(" ")[2] + " ";
        }*/
        
        for(int i=4;i<labels.length;i+=8){
            result += "[" + labels[i] + "](" + labels[i-2] + ") ";
        }
        
        return result;
    }
    
    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        GitHub client = GitHub.connectUsingPassword("mkolisnyk", "Deicide13");
        GHRepository repo = client.getMyself().getRepository("Sirius");

        ArrayList<GHIssue> issues = new ArrayList<GHIssue>();
        issues.addAll(repo.getIssues(GHIssueState.OPEN));
        issues.addAll(repo.getIssues(GHIssueState.CLOSED));
        
        Program p = new Program();
        IssuesComparator c = p.new  IssuesComparator();
        Collections.sort(issues, c);

        System.out.println("# Tests status"); 
        System.out.println(); 
        System.out.println("| Feature | Group | Test | Completed |"); 
        System.out.println("|---------|-------|------|-----------|");
        
        for(GHIssue issue:issues){
            GHMilestone milestone = issue.getMilestone();
            
            if(milestone==null){
                milestone = new GHMilestone();                
            }
            
            if(issue.getLabels().contains("Test"))
            {
                System.out.println("| [" + milestone.getTitle() + "](" + milestone.getUrl() + 
                        ") | " + p.getLabelNames(issue) + 
                        " | [" + issue.getTitle() + "](" + issue.getUrl() + ") | " +
                        ((issue.getState().equals(GHIssueState.CLOSED))?("Yes"):("No")) + 
                        " |" );
            }
        }
    }

}
