package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class RatingAndReview implements Serializable {
    private String ratingId,customerId,foodItemId,restaurantId,review,foodItem;
    private int totalRating,ratingNumber;
    private float averageRating;
    private String reviewId;
    private LocalDate reviewDate;

    public RatingAndReview(String ratingId, String customerId, int totalRating) {
        this.ratingId = ratingId;
        this.customerId = customerId;
        this.foodItemId = foodItemId;
        this.restaurantId = restaurantId;
        this.review = review;
        this.foodItem = foodItem;
        this.totalRating = totalRating;
        this.ratingNumber = ratingNumber;
        this.averageRating = averageRating;
        this.reviewId = reviewId;
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "RatingAndReview{" +
                "ratingId='" + ratingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", foodItemId='" + foodItemId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", review='" + review + '\'' +
                ", foodItem='" + foodItem + '\'' +
                ", totalRating=" + totalRating +
                ", ratingNumber=" + ratingNumber +
                ", averageRating=" + averageRating +
                ", reviewId='" + reviewId + '\'' +
                ", reviewDate=" + reviewDate +
                '}';
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getRatingNumber() {
        return ratingNumber;
    }

    public void setRatingNumber(int ratingNumber) {
        this.ratingNumber = ratingNumber;
    }


    public RatingAndReview() {
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
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

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public float getAverageRating() {


        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public String updateRating(int newRating){

        float updatedAverage = (this.averageRating * this.totalRating + newRating) / (this.totalRating + 1);
        this.totalRating++;
        this.averageRating = updatedAverage;
        return  customerId + " | Average Rating: " + averageRating + " | Total Ratings: " + totalRating;

    }


}

