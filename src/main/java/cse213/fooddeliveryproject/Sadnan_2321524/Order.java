package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Order {
    private final StringProperty orderId;
    private final StringProperty customerName;
    private final StringProperty address;
    private final StringProperty deliveryTime;

    public Order(String orderId, String customerName, String address, String deliveryTime) {
        this.orderId = new SimpleStringProperty(orderId);
        this.customerName = new SimpleStringProperty(customerName);
        this.address = new SimpleStringProperty(address);
        this.deliveryTime = new SimpleStringProperty(deliveryTime);
    }

    public StringProperty orderIdProperty() { return orderId; }
    public StringProperty customerNameProperty() { return customerName; }
    public StringProperty addressProperty() { return address; }
    public StringProperty deliveryTimeProperty() { return deliveryTime; }
}
