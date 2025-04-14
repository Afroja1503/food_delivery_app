package cse213.fooddeliveryproject.NonUser;

public class LinkedIssue {
    private String  linkedIssueId,issueld, relatedFeedbackId;

    public LinkedIssue() {
    }

    public LinkedIssue(String linkedIssueId, String issueld, String relatedFeedbackId) {
        this.linkedIssueId = linkedIssueId;
        this.issueld = issueld;
        this.relatedFeedbackId = relatedFeedbackId;
    }

    public String getLinkedIssueId() {
        return linkedIssueId;
    }

    public void setLinkedIssueId(String linkedIssueId) {
        this.linkedIssueId = linkedIssueId;
    }

    public String getIssueld() {
        return issueld;
    }

    public void setIssueld(String issueld) {
        this.issueld = issueld;
    }

    public String getRelatedFeedbackId() {
        return relatedFeedbackId;
    }

    public void setRelatedFeedbackId(String relatedFeedbackId) {
        this.relatedFeedbackId = relatedFeedbackId;
    }

    @Override
    public String toString() {
        return "LinkedIssue{" +
                "linkedIssueId='" + linkedIssueId + '\'' +
                ", issueld='" + issueld + '\'' +
                ", relatedFeedbackId='" + relatedFeedbackId + '\'' +
                '}';
    }
    public String getIssueDetails(){
        return "Details of issue";
    }
    public boolean isResolved(){
        return true;
    }
    public void createLinkedIssue(){

    }

}
