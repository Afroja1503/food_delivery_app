package cse213.fooddeliveryproject.UserNonUser;

public class Refund {
    private String refundId,orderId,paymentMethodId,refundReason,refundStatus;
    private float refundAmount;

    public Refund() {
    }

    public Refund(String refundId, String orderId, String paymentMethodId, String refundReason, String refundStatus, float refundAmount) {
        this.refundId = refundId;
        this.orderId = orderId;
        this.paymentMethodId = paymentMethodId;
        this.refundReason = refundReason;
        this.refundStatus = refundStatus;
        this.refundAmount = refundAmount;
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

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
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

    @Override
    public String toString() {
        return "Refund{" +
                "refundId='" + refundId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", refundReason='" + refundReason + '\'' +
                ", refundStatus='" + refundStatus + '\'' +
                ", refundAmount=" + refundAmount +
                '}';
    }
    public void processRefund(){

    }
    public boolean validateRefundPolicy(){
        return true;
    }
    public void updateRefundStatus(String newRefundStatus){

    }
}
