package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;

public class DeliveryInformation {
    private String  trackingNumber,deliveryAddress, orderId;
    private LocalDate estimatedTime;

    public DeliveryInformation() {
    }

    public DeliveryInformation(String trackingNumber, String deliveryAddress, String orderId, LocalDate estimatedTime) {
        this.trackingNumber = trackingNumber;
        this.deliveryAddress = deliveryAddress;
        this.orderId = orderId;
        this.estimatedTime = estimatedTime;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(LocalDate estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "DeliveryInformation{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderId='" + orderId + '\'' +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
    private void updateTracking(){
    }
}