package fooddelivery.fooddeliveryapp;

public class MarketingLoyaltyProgram {
    private String rewardType;
    private String conditions;
    private String expiryDate;

    public MarketingLoyaltyProgram(String rewardType, String conditions, String expiryDate) {
        this.rewardType = rewardType;
        this.conditions = conditions;
        this.expiryDate = expiryDate;
    }

    public String getRewardType() {
        return rewardType;
    }

    public String getConditions() {
        return conditions;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
