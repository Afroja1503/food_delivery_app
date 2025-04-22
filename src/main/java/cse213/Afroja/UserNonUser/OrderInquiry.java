package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class OrderInquiry implements Serializable {
    private String inquiryId,orderId,inquiryType,inquiryStatus;
    private LocalDate dateFrom,dateTo,createdDate ;

    public OrderInquiry() {
    }

    public OrderInquiry(String inquiryId, String orderId, String inquiryType, String inquiryStatus, LocalDate dateFrom, LocalDate dateTo) {
        this.inquiryId = inquiryId;
        this.orderId = orderId;
        this.inquiryType = inquiryType;
        this.inquiryStatus = inquiryStatus;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "OrderInquiry{" +
                "inquiryId='" + inquiryId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", inquiryType='" + inquiryType + '\'' +
                ", inquiryStatus='" + inquiryStatus + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", createdDate=" + createdDate +
                '}';
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
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

    public void updateInquiryStatus(OrderInquiry newStatus){

    }
    public void  assignToTeam(String teamName){

    }
    public void  submitInquiry(){

    }
    public void closeInquiry(){

    }



}
