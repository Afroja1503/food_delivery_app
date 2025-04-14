package cse213.fooddeliveryproject.NonUser;

public class FoodItem {
    private String foodItemId, foodName,description,itemCatagory;
    private double price;
    private boolean availability;

    public FoodItem() {
    }

    public FoodItem(String foodItemId, String foodName, String description, String itemCatagory, double price, boolean availability) {
        this.foodItemId = foodItemId;
        this.foodName = foodName;
        this.description = description;
        this.itemCatagory = itemCatagory;
        this.price = price;
        this.availability = availability;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(String foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCatagory() {
        return itemCatagory;
    }

    public void setItemCatagory(String itemCatagory) {
        this.itemCatagory = itemCatagory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodItemId='" + foodItemId + '\'' +
                ", foodName='" + foodName + '\'' +
                ", description='" + description + '\'' +
                ", itemCatagory='" + itemCatagory + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
    public boolean isAvailable(){
        return true;
    }
    public String getItemDetails(){
        return "Item details go here";

    }
}
