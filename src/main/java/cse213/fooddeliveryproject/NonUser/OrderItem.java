package cse213.fooddeliveryproject.NonUser;

public class OrderItem {
    private String orderItemId,foodItemId ,orderId;
    private int quantity;
    private double price;


    public OrderItem() {
    }

    public OrderItem(String orderItemId, String foodItemId, String orderId, int quantity, double price) {
        this.orderItemId = orderItemId;
        this.foodItemId = foodItemId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(String foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId='" + orderItemId + '\'' +
                ", foodItemId='" + foodItemId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public double getTotal(){
        return 0.0;
    }
    public void fetchOrderItemDetails(){

    }
}
