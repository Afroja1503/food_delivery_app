package fooddelivery.fooddeliveryapp;

public class MarketingPromotionCampaign {
    private String promoCode;
    private String discountType;
    private double discountPercent;
    private String eligibleItems;
    private String duration;
    private String targetAudience;

    public MarketingPromotionCampaign(String promoCode, String discountType, double discountPercent,
                                      String eligibleItems, String duration, String targetAudience) {
        this.promoCode = promoCode;
        this.discountType = discountType;
        this.discountPercent = discountPercent;
        this.eligibleItems = eligibleItems;
        this.duration = duration;
        this.targetAudience = targetAudience;
    }

    public String getPromoCode() { return promoCode; }
    public void setPromoCode(String promoCode) { this.promoCode = promoCode; }

    public String getDiscountType() { return discountType; }
    public void setDiscountType(String discountType) { this.discountType = discountType; }

    public double getDiscountPercent() { return discountPercent; }
    public void setDiscountPercent(double discountPercent) { this.discountPercent = discountPercent; }

    public String getEligibleItems() { return eligibleItems; }
    public void setEligibleItems(String eligibleItems) { this.eligibleItems = eligibleItems; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getTargetAudience() { return targetAudience; }
    public void setTargetAudience(String targetAudience) { this.targetAudience = targetAudience; }
}
