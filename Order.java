package fooddelivery.fooddeliveryapp;


import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<MenuItem> items;
    private double totalAmount;
    private String status;
    private String deliveryAddress;
    private String riderName;
    private String riderContact;
    private String handoverTimestamp;

    public Order(int orderId, String customerName, List<MenuItem> items, double totalAmount,
                 String status, String deliveryAddress) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
        this.deliveryAddress = deliveryAddress;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getRiderContact() {
        return riderContact;
    }

    public void setRiderContact(String riderContact) {
        this.riderContact = riderContact;
    }

    public String getHandoverTimestamp() {
        return handoverTimestamp;
    }

    public void setHandoverTimestamp(String handoverTimestamp) {
        this.handoverTimestamp = handoverTimestamp;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", riderName='" + riderName + '\'' +
                ", riderContact='" + riderContact + '\'' +
                ", handoverTimestamp='" + handoverTimestamp + '\'' +
                '}';
    }

    public String getItemsString() {
        if (items == null || items.isEmpty()) {
            return "No items";
        }
        return items.size() + " item(s)";
    }

}