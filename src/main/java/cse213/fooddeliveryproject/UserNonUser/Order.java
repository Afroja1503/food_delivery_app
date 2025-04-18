package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {


    private String  orderId,customerId,restaurantId;
    private ArrayList<OrderItem> orderItem;
    private OrderStatus status;
    private double  totalAmount;
    private LocalDate orderDate;
    private PaymentMethod paymentMethod;

    public Order() {
    }

    public Order(ArrayList<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Order(String orderId, String customerId, String restaurantId, OrderItem orderItem, OrderStatus status, double totalAmount, LocalDate orderDate, PaymentMethod paymentMethod) {

        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;

        this.status = status;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setOrderItem(ArrayList<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }


    public ArrayList<OrderItem> getOrderItem() {
        return orderItem;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", orderItem=" + orderItem +
                ", status=" + status +
                ", totalAmount=" + totalAmount +
                ", orderDate=" + orderDate +
                ", paymentMethod=" + paymentMethod +
                '}';
    }

    public void placeOrder(){

    }
    public boolean cancelOrder(){
        return true;
    }
    public void updateStatus(OrderStatus status){

    }
}
