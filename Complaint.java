package fooddelivery.fooddeliveryapp;


public class Complaint {
    private int complaintId;
    private String customerName;
    private String content;
    private String response;
    private boolean resolved;

    public Complaint(int complaintId, String customerName, String content) {
        this.complaintId = complaintId;
        this.customerName = customerName;
        this.content = content;
    }

    public Complaint() {
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintId=" + complaintId +
                ", customerName='" + customerName + '\'' +
                ", content='" + content + '\'' +
                ", response='" + response + '\'' +
                ", resolved=" + resolved +
                '}';
    }
}