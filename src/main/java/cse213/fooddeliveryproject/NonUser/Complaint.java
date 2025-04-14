package cse213.fooddeliveryproject.NonUser;

import java.time.LocalDate;

public class Complaint {
    private String  complaintId,customerId,orderId,complaintStatus,complaintCatagory,complaintDescription;
    private LocalDate dateCreated;

    public Complaint() {
    }

    public Complaint(String complaintId, String customerId, String orderId, String complaintStatus, String complaintCatagory, String complaintDescription, LocalDate dateCreated) {
        this.complaintId = complaintId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.complaintStatus = complaintStatus;
        this.complaintCatagory = complaintCatagory;
        this.complaintDescription = complaintDescription;
        this.dateCreated = dateCreated;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String getComplaintCatagory() {
        return complaintCatagory;
    }

    public void setComplaintCatagory(String complaintCatagory) {
        this.complaintCatagory = complaintCatagory;
    }

    public String getComplaintDescription() {
        return complaintDescription;
    }

    public void setComplaintDescription(String complaintDescription) {
        this.complaintDescription = complaintDescription;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId='" + complaintId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", complaintStatus='" + complaintStatus + '\'' +
                ", complaintCatagory='" + complaintCatagory + '\'' +
                ", complaintDescription='" + complaintDescription + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
    public void createComplaint(){

    }
    public void updateComplaintStatus(){

    }
    public void  assignToAgent(){

    }
}
