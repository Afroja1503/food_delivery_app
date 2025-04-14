package cse213.fooddeliveryproject.NonUser;

import java.time.LocalDate;

public class Feedback {
    private  String  feedbackId,customerId,orderId,restaurantId,feedbackType,feedbackStatus;
    private int rating;
    private LocalDate date;

    public Feedback() {
    }

    public Feedback(String feedbackId, String customerId, String orderId, String restaurantId, String feedbackType, String feedbackStatus, int rating, LocalDate date) {
        this.feedbackId = feedbackId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.restaurantId = restaurantId;
        this.feedbackType = feedbackType;
        this.feedbackStatus = feedbackStatus;
        this.rating = rating;
        this.date = date;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
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

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId='" + feedbackId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", feedbackType='" + feedbackType + '\'' +
                ", feedbackStatus='" + feedbackStatus + '\'' +
                ", rating=" + rating +
                ", date=" + date +
                '}';
    }
    public void resolve(){

    }
    public void notifyTeam(){

    }
    public void closeFeedback(){

    }
}
