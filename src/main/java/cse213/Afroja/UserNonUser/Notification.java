package cse213.Afroja.UserNonUser;

import java.time.LocalDate;

public class Notification {
    private String notificationId,notificationContent,recipient,notificationType,notificationStatus,customerId,customerAgentId;
    private LocalDate data;

    public Notification() {
    }

    public Notification(String notificationId, String notificationContent, String recipient, String notificationType, String notificationStatus, String customerId, String customerAgentId, LocalDate data) {
        this.notificationId = notificationId;
        this.notificationContent = notificationContent;
        this.recipient = recipient;
        this.notificationType = notificationType;
        this.notificationStatus = notificationStatus;
        this.customerId = customerId;
        this.customerAgentId = customerAgentId;
        this.data = data;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAgentId() {
        return customerAgentId;
    }

    public void setCustomerAgentId(String customerAgentId) {
        this.customerAgentId = customerAgentId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", notificationContent='" + notificationContent + '\'' +
                ", recipient='" + recipient + '\'' +
                ", notificationType='" + notificationType + '\'' +
                ", notificationStatus='" + notificationStatus + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerAgentId='" + customerAgentId + '\'' +
                ", data=" + data +
                '}';
    }
    public void  sendNotification(){

    }
    public String  getNotificationDetails(){
        return "";
    }
}
