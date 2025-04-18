package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;

public class OrderInquiry {
    private String inquiryId,orderId,inquiryType,inquiryStatus;
    private LocalDate createdDate;

    public OrderInquiry() {
    }

    public OrderInquiry(String inquiryId, String orderId, String inquiryType, String inquiryStatus, LocalDate createdDate) {
        this.inquiryId = inquiryId;
        this.orderId = orderId;
        this.inquiryType = inquiryType;
        this.inquiryStatus = inquiryStatus;
        this.createdDate = createdDate;
    }

    public String getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(String inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInquiryType() {
        return inquiryType;
    }

    public void setInquiryType(String inquiryType) {
        this.inquiryType = inquiryType;
    }

    public String getInquiryStatus() {
        return inquiryStatus;
    }

    public void setInquiryStatus(String inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "OrderInquiry{" +
                "inquiryId='" + inquiryId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", inquiryType='" + inquiryType + '\'' +
                ", inquiryStatus='" + inquiryStatus + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
    public void updateInquiryStatus(OrderInquiry newStatus){

    }
    public void  assignToTeam(String teamName){

    }
    public void  submitInquiry(){

    }
    public void closeInquiry(){

    }
}
