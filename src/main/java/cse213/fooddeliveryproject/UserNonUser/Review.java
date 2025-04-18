package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;

public class Review {
    private String reviewId,customerId,foodItemId,restaurantId,rating;
    private LocalDate  reviewDate;

    public Review() {
    }

    public Review(String reviewId, String customerId, String foodItemId, String restaurantId, String rating, LocalDate reviewDate) {
        this.reviewId = reviewId;
        this.customerId = customerId;
        this.foodItemId = foodItemId;
        this.restaurantId = restaurantId;
        this.rating = rating;
        this.reviewDate = reviewDate;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(String foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", foodItemId='" + foodItemId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", rating='" + rating + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }
    public void submitReview(){

    }
    public void editReview(){

    }
}
