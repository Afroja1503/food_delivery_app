package cse213.Afroja.UserNonUser;

import java.time.LocalDate;

public class OrderSummary {
    private String orderId ,orderItemId;
    private double  totalAmount;
    private int itemCount;
    private LocalDate deliveryDate;

    public OrderSummary() {
    }

    public OrderSummary(String orderId, String orderItemId, double totalAmount, int itemCount, LocalDate deliveryDate) {
        this.orderId = orderId;
        this.orderItemId = orderItemId;
        this.totalAmount = totalAmount;
        this.itemCount = itemCount;
        this.deliveryDate = deliveryDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "OrderSummary{" +
                "orderId='" + orderId + '\'' +
                ", orderItemId='" + orderItemId + '\'' +
                ", totalAmount=" + totalAmount +
                ", itemCount=" + itemCount +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
    public OrderSummary generateOrderSummary(){
        return new OrderSummary();

    }
}
