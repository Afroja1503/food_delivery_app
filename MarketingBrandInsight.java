package fooddelivery.fooddeliveryapp;

public class MarketingBrandInsight {
    private String area;
    private String currentStatus;
    private String suggestion;

    public MarketingBrandInsight(String area, String currentStatus, String suggestion) {
        this.area = area;
        this.currentStatus = currentStatus;
        this.suggestion = suggestion;
    }

    public MarketingBrandInsight() {
    }

    public String getArea() {
        return area;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
