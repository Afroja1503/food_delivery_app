package cse213.fooddeliveryproject.UserNonUser;

public class Rating {
    private String ratingId,customerId,foodItemId,restaurantId;
    private int totalRating;
    private float averageRating;

    public Rating() {
    }

    public Rating(String ratingId, String customerId, String foodItemId, String restaurantId, int totalRating, float averageRating) {
        this.ratingId = ratingId;
        this.customerId = customerId;
        this.foodItemId = foodItemId;
        this.restaurantId = restaurantId;
        this.totalRating = totalRating;
        this.averageRating = averageRating;
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

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId='" + ratingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", foodItemId='" + foodItemId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", totalRating=" + totalRating +
                ", averageRating=" + averageRating +
                '}';
    }
    public void updateRating(){

    }
}
