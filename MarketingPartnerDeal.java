package fooddelivery.fooddeliveryapp;

public class MarketingPartnerDeal {
    private String restaurantName;
    private String dealType;
    private String dealDetails;
    private String duration;

    public MarketingPartnerDeal(String restaurantName, String dealType, String dealDetails, String duration) {
        this.restaurantName = restaurantName;
        this.dealType = dealType;
        this.dealDetails = dealDetails;
        this.duration = duration;
    }

    public MarketingPartnerDeal() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getDealDetails() {
        return dealDetails;
    }

    public void setDealDetails(String dealDetails) {
        this.dealDetails = dealDetails;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
