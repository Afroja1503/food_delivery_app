package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order extends Cart implements Serializable {
    private double price;




    private String  orderId,customerId,restaurantId,reasonForCancellation,trackingId,orderStatus,currentStatus,newStatus;
    private LocalDate dateOfUpdatedStatus;

    public Order(Object o, String selectItemComboBoxValue, String selectRestaurantComboBoxValue, LocalDate dateOfUpdatedStatus) {
        super(value, o, v, selectItemComboBoxValue, selectRestaurantComboBoxValue);
        this.price = price;
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.reasonForCancellation = reasonForCancellation;
        this.trackingId = trackingId;
        this.orderStatus = orderStatus;
        this.currentStatus = currentStatus;
        this.newStatus = newStatus;
        this.dateOfUpdatedStatus = dateOfUpdatedStatus;
        this.orderItem = orderItem;
        this.status = status;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(String cartId, String customerId, ArrayList<CartItem> item, LocalDate creationDate, float quantity, double price, String foodItem, String restaurant, double price1, String orderId, String customerId1, String restaurantId, String reasonForCancellation, String trackingId, String orderStatus, String currentStatus, String newStatus, LocalDate dateOfUpdatedStatus, ArrayList<OrderItem> orderItem, OrderStatus status, double totalAmount, LocalDate orderDate, String paymentMethod, String deliveryAddress) {
        super(cartId, customerId, item, creationDate, quantity, price, foodItem, restaurant);
        this.price = price1;
        this.orderId = orderId;
        this.customerId = customerId1;
        this.restaurantId = restaurantId;
        this.reasonForCancellation = reasonForCancellation;
        this.trackingId = trackingId;
        this.orderStatus = orderStatus;
        this.currentStatus = currentStatus;
        this.newStatus = newStatus;
        this.dateOfUpdatedStatus = dateOfUpdatedStatus;
        this.orderItem = orderItem;
        this.status = status;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(double price, String orderId, String customerId, String restaurantId, String reasonForCancellation, String trackingId, String orderStatus, String currentStatus, String newStatus, LocalDate dateOfUpdatedStatus, ArrayList<OrderItem> orderItem, OrderStatus status, double totalAmount, LocalDate orderDate, String paymentMethod, String deliveryAddress) {
        this.price = price;
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        this.reasonForCancellation = reasonForCancellation;
        this.trackingId = trackingId;
        this.orderStatus = orderStatus;
        this.currentStatus = currentStatus;
        this.newStatus = newStatus;
        this.dateOfUpdatedStatus = dateOfUpdatedStatus;
        this.orderItem = orderItem;
        this.status = status;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.paymentMethod = paymentMethod;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", reasonForCancellation='" + reasonForCancellation + '\'' +
                ", trackingId='" + trackingId + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", newStatus='" + newStatus + '\'' +
                ", dateOfUpdatedStatus=" + dateOfUpdatedStatus +
                ", orderItem=" + orderItem +
                ", status=" + status +
                ", totalAmount=" + totalAmount +
                ", orderDate=" + orderDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    public LocalDate getDateOfUpdatedStatus() {
        return dateOfUpdatedStatus;
    }



    private ArrayList<OrderItem> orderItem;
    private OrderStatus status;
    private double  totalAmount;
    private LocalDate orderDate;
    private String paymentMethod;
    private String deliveryAddress;

    public void setDateOfUpdatedStatus(LocalDate dateOfUpdatedStatus) {
        this.dateOfUpdatedStatus = dateOfUpdatedStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }



    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }



    public String getReasonForCancellation() {
        return reasonForCancellation;
    }

    public void setReasonForCancellation(String reasonForCancellation) {
        this.reasonForCancellation = reasonForCancellation;
    }



    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }



    public Order() {
    }

    public Order(ArrayList<OrderItem> orderItem) {
        this.orderItem = orderItem;
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





    public void placeOrder(){

    }
    public boolean cancelOrder(){
        return true;
    }
    public void updateStatus(OrderStatus status){

    }
}
