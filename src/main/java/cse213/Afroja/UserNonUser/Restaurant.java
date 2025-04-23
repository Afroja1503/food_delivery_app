package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.util.ArrayList;

public class Restaurant implements Serializable {
    private String restaurantld, restaurantName,location,rating,review,cuisineType;
    private ArrayList<FoodItem> foodItem;

    public Restaurant() {
    }

    public Restaurant(String restaurantld, String restaurantName, String location, String rating, String review, String cuisineType, ArrayList<FoodItem> foodItem) {
        this.restaurantld = restaurantld;
        this.restaurantName = restaurantName;
        this.location = location;
        this.rating = rating;
        this.review = review;
        this.cuisineType = cuisineType;
        this.foodItem = foodItem;
    }

    public String getRestaurantld() {
        return restaurantld;
    }

    public void setRestaurantld(String restaurantld) {
        this.restaurantld = restaurantld;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public ArrayList<FoodItem> getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(ArrayList<FoodItem> foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantld='" + restaurantld + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", location='" + location + '\'' +
                ", rating='" + rating + '\'' +
                ", review='" + review + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                ", foodItem=" + foodItem +
                '}';
    }
    public  ArrayList<FoodItem> getMenu(){
        return new ArrayList<FoodItem>();
    }
    public FoodItem findFoodItem(String foodItemId){
        return new FoodItem();
    }
}
