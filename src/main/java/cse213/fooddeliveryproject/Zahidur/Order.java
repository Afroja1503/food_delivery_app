package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    public int orderId,customerId,restaurantId;
    public double totalPrice;
    public LocalDateTime orderTime;
    public String status;

    public Order() {
    }

    public Order(int orderId, int customerId, int restaurantId, double totalPrice, LocalDateTime orderTime, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.totalPrice = totalPrice;
        this.orderTime = orderTime;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", restaurantId=" + restaurantId +
                ", totalPrice=" + totalPrice +
                ", orderTime=" + orderTime +
                ", status='" + status + '\'' +
                '}';
    }
}
