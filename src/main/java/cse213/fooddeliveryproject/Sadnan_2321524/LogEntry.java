package cse213.fooddeliveryproject.Sadnan_2321524;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LogEntry {

    private final StringProperty timestamp;
    private final StringProperty type;
    private final StringProperty message;

    public LogEntry(String timestamp, String type, String message) {
        this.timestamp = new SimpleStringProperty(timestamp);
        this.type = new SimpleStringProperty(type);
        this.message = new SimpleStringProperty(message);
    }

    public String getTimestamp() {
        return timestamp.get();
    }

    public void setTimestamp(String timestamp) {
        this.timestamp.set(timestamp);
    }

    public StringProperty timestampProperty() {
        return timestamp;
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public StringProperty typeProperty() {
        return type;
    }

    public String getMessage() {
        return message.get();
    }

    public void setMessage(String message) {
        this.message.set(message);
    }

    public StringProperty messageProperty() {
        return message;
    }
}
