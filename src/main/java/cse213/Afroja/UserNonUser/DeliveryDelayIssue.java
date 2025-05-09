package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class DeliveryDelayIssue extends Issue implements Serializable {
    private String  deliveryDelayId,orderId,customerId,delayReason,delayStatus,orderStatus;
    private LocalDate createdDate,resolvedDate;

    public DeliveryDelayIssue() {
    }

    public DeliveryDelayIssue(String deliveryDelayId, String orderId, String customerId, String delayReason) {
        this.deliveryDelayId = deliveryDelayId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.delayReason = delayReason;
        this.delayStatus = delayStatus;
        this.orderStatus = orderStatus;
        this.createdDate = createdDate;
        this.resolvedDate = resolvedDate;
    }

    public DeliveryDelayIssue(String issueId, String issueDescription, String issueStatus, LocalDate creationDate) {
        super(issueId, issueDescription, issueStatus, creationDate);
        this.deliveryDelayId = deliveryDelayId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.delayReason = delayReason;
        this.delayStatus = delayStatus;
        this.orderStatus = orderStatus;
        this.createdDate = createdDate;
        this.resolvedDate = resolvedDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return "DeliveryDelayIssue{" +
                "deliveryDelayId='" + deliveryDelayId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", delayReason='" + delayReason + '\'' +
                ", delayStatus='" + delayStatus + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", createdDate=" + createdDate +
                ", resolvedDate=" + resolvedDate +
                '}';
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    public void  notifyCustomer(){

    }
    public void  notifyCourier(){

    }
    public void escalate(){

    }
}
