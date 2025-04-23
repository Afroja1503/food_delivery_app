package fooddelivery.fooddeliveryapp;

public class MarketingAdCampaign {
    private String platform;
    private double budget;
    private String targetAudience;
    private String duration;
    private String mediaFile;
    private String adCopy;

    public MarketingAdCampaign(String platform, double budget, String targetAudience,
                               String duration, String mediaFile, String adCopy) {
        this.platform = platform;
        this.budget = budget;
        this.targetAudience = targetAudience;
        this.duration = duration;
        this.mediaFile = mediaFile;
        this.adCopy = adCopy;
    }

    public MarketingAdCampaign() {
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(String mediaFile) {
        this.mediaFile = mediaFile;
    }

    public String getAdCopy() {
        return adCopy;
    }

    public void setAdCopy(String adCopy) {
        this.adCopy = adCopy;
    }

    @Override
    public String toString() {
        return "MarketingAdCampaign{" +
                "platform='" + platform + '\'' +
                ", budget=" + budget +
                ", targetAudience='" + targetAudience + '\'' +
                ", duration='" + duration + '\'' +
                ", mediaFile='" + mediaFile + '\'' +
                ", adCopy='" + adCopy + '\'' +
                '}';
    }
}
