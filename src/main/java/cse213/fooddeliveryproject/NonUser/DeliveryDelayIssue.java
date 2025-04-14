package cse213.fooddeliveryproject.NonUser;

import java.time.LocalDate;

public class DeliveryDelayIssue extends Issue{
    private String  deliveryDelayId,orderId,customerId,delayReason,delayStatus;
    private LocalDate createdDate,resolvedDate;

    public DeliveryDelayIssue() {
    }

    public DeliveryDelayIssue(String deliveryDelayId, String orderId, String customerId, String delayReason, String delayStatus, LocalDate createdDate, LocalDate resolvedDate) {
        this.deliveryDelayId = deliveryDelayId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.delayReason = delayReason;
        this.delayStatus = delayStatus;
        this.createdDate = createdDate;
        this.resolvedDate = resolvedDate;
    }

    public String getDeliveryDelayId() {
        return deliveryDelayId;
    }

    public void setDeliveryDelayId(String deliveryDelayId) {
        this.deliveryDelayId = deliveryDelayId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDelayReason() {
        return delayReason;
    }

    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    public String getDelayStatus() {
        return delayStatus;
    }

    public void setDelayStatus(String delayStatus) {
        this.delayStatus = delayStatus;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(LocalDate resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    @Override
    public String toString() {
        return "DeliveryDelayIssue{" +
                "deliveryDelayId='" + deliveryDelayId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", delayReason='" + delayReason + '\'' +
                ", delayStatus='" + delayStatus + '\'' +
                ", createdDate=" + createdDate +
                ", resolvedDate=" + resolvedDate +
                '}';
    }
    public void  notifyCustomer(){

    }
    public void  notifyCourier(){

    }
    public void escalate(){

    }
}
