package fooddelivery.fooddeliveryapp;


public class Availability {
    private String openingTime;
    private String closingTime;
    private boolean isOpen;

    public Availability(String openingTime, String closingTime, boolean isOpen) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.isOpen = isOpen;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Availability{" +
                "openingTime='" + openingTime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
