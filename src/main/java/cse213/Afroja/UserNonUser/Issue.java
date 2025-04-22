package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Issue implements Serializable {
    private String  issueId,issueDescription,issueStatus,customerId,assignedAgentId,orderId;
    private  String issueCatagory;
    private LocalDate creationDate;

    public Issue() {
    }

    public Issue(String issueId, String issueDescription, String issueStatus, LocalDate creationDate) {
        this.issueId = issueId;
        this.issueDescription = issueDescription;
        this.issueStatus = issueStatus;
        this.customerId = customerId;
        this.assignedAgentId = assignedAgentId;
        this.orderId = orderId;
        this.issueCatagory = issueCatagory;
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
                ", orderId='" + orderId + '\'' +
                ", issueCatagory='" + issueCatagory + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getIssueCatagory() {
        return issueCatagory;
    }

    public void setIssueCatagory(String issueCatagory) {
        this.issueCatagory = issueCatagory;
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

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public  String generateIssueId() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String timestamp = LocalDateTime.now().format(formatter);
        return "ISSUE-" + timestamp;
    }

    public void updateIssueStatus(String newStatus){

    }
}
