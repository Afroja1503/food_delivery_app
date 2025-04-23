package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDateTime;

public class DeliveryReport {
    public int reportId,orderId,deliveryPersonId,deliveryDuration;
    public String status,customerFeedback;
    public double distance,rating;
    public LocalDateTime deliveryTime;

    public DeliveryReport() {
    }

    public DeliveryReport(int reportId, int orderId, int deliveryPersonId, int deliveryDuration, String status, String customerFeedback, double distance, double rating, LocalDateTime deliveryTime) {
        this.reportId = reportId;
        this.orderId = orderId;
        this.deliveryPersonId = deliveryPersonId;
        this.deliveryDuration = deliveryDuration;
        this.status = status;
        this.customerFeedback = customerFeedback;
        this.distance = distance;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    public int getDeliveryDuration() {
        return deliveryDuration;
    }

    public void setDeliveryDuration(int deliveryDuration) {
        this.deliveryDuration = deliveryDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerFeedback() {
        return customerFeedback;
    }

    public void setCustomerFeedback(String customerFeedback) {
        this.customerFeedback = customerFeedback;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "DeliveryReport{" +
                "reportId=" + reportId +
                ", orderId=" + orderId +
                ", deliveryPersonId=" + deliveryPersonId +
                ", deliveryDuration=" + deliveryDuration +
                ", status='" + status + '\'' +
                ", customerFeedback='" + customerFeedback + '\'' +
                ", distance=" + distance +
                ", rating=" + rating +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
