package cse213.Afroja.UserNonUser;

import java.io.Serializable;

public class Refund implements Serializable {
    private String refundId,orderId,paymentMethod,refundReason,refundStatus,email,phoneNumber,orderDate;
    private float refundAmount;

    public Refund(String text, String emailTextFieldText) {
    }

    public Refund(String refundId, String orderId, String paymentMethod, String refundReason, String refundStatus, String email, String phoneNumber, String orderDate, float refundAmount) {
        this.refundId = refundId;
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.refundReason = refundReason;
        this.refundStatus = refundStatus;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.orderDate = orderDate;
        this.refundAmount = refundAmount;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "refundId='" + refundId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", refundReason='" + refundReason + '\'' +
                ", refundStatus='" + refundStatus + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", refundAmount=" + refundAmount +
                '}';
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public float getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(float refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void processRefund(){

    }
    public boolean validateRefundPolicy(){
        return true;
    }
    public void updateRefundStatus(String newRefundStatus){

    }
    public boolean processRefund(String method, double amount) {

        return true;
    }
}
