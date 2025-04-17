package cse213.fooddeliveryproject.NonUser;

public class OrderStatus {
    private String orderStatusId,orderId, orderStatusName;

    public OrderStatus() {
    }

    public OrderStatus(String orderStatusId, String orderId, String orderStatusName) {
        this.orderStatusId = orderStatusId;
        this.orderId = orderId;
        this.orderStatusName = orderStatusName;
    }

    public String getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "orderStatusId='" + orderStatusId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderStatusName='" + orderStatusName + '\'' +
                '}';
    }
    public boolean updateOrderStatus(){
        return true;
    }
}
