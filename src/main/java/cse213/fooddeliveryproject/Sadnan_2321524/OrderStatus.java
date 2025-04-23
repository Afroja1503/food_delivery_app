package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OrderStatus {

    private final StringProperty orderId;
    private final StringProperty customerName;
    private final StringProperty status;
    private final StringProperty statusDropdown;

    public OrderStatus(String orderId, String customerName, String status) {
        this.orderId = new SimpleStringProperty(orderId);
        this.customerName = new SimpleStringProperty(customerName);
        this.status = new SimpleStringProperty(status);
        this.statusDropdown = new SimpleStringProperty(status); // Initialize with current status
    }

    public String getOrderId() {
        return orderId.get();
    }

    public StringProperty orderIdProperty() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public StringProperty customerNameProperty() {
        return customerName;
    }

    public String getStatus() {
        return status.get();
    }

    public void setStatus(String newStatus) {
        this.status.set(newStatus);
    }

    public StringProperty statusProperty() {
        return status;
    }

    public String getStatusDropdown() {
        return statusDropdown.get();
    }

    public void setStatusDropdown(String newStatus) {
        this.statusDropdown.set(newStatus);
    }

    public StringProperty statusDropdownProperty() {
        return statusDropdown;
    }
}
