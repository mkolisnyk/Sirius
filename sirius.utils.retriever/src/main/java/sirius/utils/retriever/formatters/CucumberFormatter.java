/**
 * 
 */
package sirius.utils.retriever.formatters;

import java.io.*;
import java.util.HashMap;
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

    private String outDir = ".";
    private String outFile = "";
    
    public final String eol = System.getProperty("line.separator");
    public final String fs = System.getProperty("file.separator");
    
    public CucumberFormatter(String outputLocation){
        this.outDir = outputLocation;
    }
    
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
        return ""; 
    }

    private String cleanIssueBody(String body){
        HashMap<String,String> map = new HashMap<String,String>();
        
        map.put("\\*\\*Scenario Outline:\\*\\*","Scenario Outline:");
        map.put("\\*\\*Scenario:\\*\\*","Scenario:");
        map.put("\\*\\*Examples:\\*\\*","Examples:");
        
        for(String key:map.keySet()){
            body = body.replaceAll(key, map.get(key) );
        }
        
        return body;
    }
    
    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#GetIssue(org.kohsuke.github.GHIssue)
     */
    public String GetIssue(GHIssue issue) {
        try {
            outFile = outDir + fs + issue.getTitle().replaceAll(" ", "").replaceAll(":", "_") + ".feature";
            FileWriter writer = new FileWriter(outFile);
            
            GHMilestone milestone = issue.getMilestone();
            if( milestone != null ){
                writer.write("# Requirement: " + milestone.getTitle() + eol + 
                        "# " + milestone.getDescription().replaceAll(eol, eol + "# ") + eol +
                        "# URL: " + milestone.getUrl() + eol);
            }
            else {
                writer.write("");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GetLabels(issue) + eol + "Feature: " + issue.getTitle() + eol +
            "\tURL: <a href=\"" + issue.getUrl() + "\">" + issue.getUrl() + "</a>" + eol + 
            cleanIssueBody(issue.getBody()) + eol;
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

    /* (non-Javadoc)
     * @see sirius.utils.retriever.interfaces.IStoryFormatter#Out(java.lang.String)
     */
    public void Out(String text) {
        FileWriter writer;
        try {
            File file = new File(outFile);
            if(!file.exists()){
                //System.out.println("File '" + outFile + "' wasn't found");
                return;
            }
            writer = new FileWriter(outFile,true);
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
