package cse213.fooddeliveryproject.Sadnan_2321524;

import java.io.Serializable;

public class SupportTicket implements Serializable {
    private String ticketId;
    private String orderId;
    private String issueDescription;

    public SupportTicket(String ticketId, String orderId, String issueDescription) {
        this.ticketId = ticketId;
        this.orderId = orderId;
        this.issueDescription = issueDescription;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "ticketId='" + ticketId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", issueDescription='" + issueDescription + '\'' +
                '}';
    }
}
