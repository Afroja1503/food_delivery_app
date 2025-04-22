package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DeliveryRecord {
    private final StringProperty orderId;
    private final StringProperty customer;
    private final StringProperty date;
    private final StringProperty paymentStatus;

    public DeliveryRecord(String orderId, String customer, String date, String paymentStatus) {
        this.orderId = new SimpleStringProperty(orderId);
        this.customer = new SimpleStringProperty(customer);
        this.date = new SimpleStringProperty(date);
        this.paymentStatus = new SimpleStringProperty(paymentStatus);
    }

    public StringProperty orderIdProperty() { return orderId; }
    public StringProperty customerProperty() { return customer; }
    public StringProperty dateProperty() { return date; }
    public StringProperty paymentStatusProperty() { return paymentStatus; }
}
