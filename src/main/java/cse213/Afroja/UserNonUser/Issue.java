package cse213.Afroja.UserNonUser;

import java.time.LocalDate;

public class Issue {
    private String  issueId,issueDescription,issueStatus,customerId,assignedAgentId;
    private  IssueCatagory catagory;
    private LocalDate creationDate;

    public Issue() {
    }

    public Issue(String issueId, String issueDescription, String issueStatus, String customerId, String assignedAgentId, IssueCatagory catagory, LocalDate creationDate) {
        this.issueId = issueId;
        this.issueDescription = issueDescription;
        this.issueStatus = issueStatus;
        this.customerId = customerId;
        this.assignedAgentId = assignedAgentId;
        this.catagory = catagory;
        this.creationDate = creationDate;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAssignedAgentId() {
        return assignedAgentId;
    }

    public void setAssignedAgentId(String assignedAgentId) {
        this.assignedAgentId = assignedAgentId;
    }

    public IssueCatagory getCatagory() {
        return catagory;
    }

    public void setCatagory(IssueCatagory catagory) {
        this.catagory = catagory;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "issueId='" + issueId + '\'' +
                ", issueDescription='" + issueDescription + '\'' +
                ", issueStatus='" + issueStatus + '\'' +
                ", customerId='" + customerId + '\'' +
                ", assignedAgentId='" + assignedAgentId + '\'' +
                ", catagory=" + catagory +
                ", creationDate=" + creationDate +
                '}';
    }
    public void createIssue(){

    }

    public void updateIssueStatus(String newStatus){

    }
}
