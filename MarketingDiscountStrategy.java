package fooddelivery.fooddeliveryapp;

public class MarketingDiscountStrategy {
    private String strategyName;
    private String performance;
    private String recommendation;

    public MarketingDiscountStrategy(String strategyName, String performance, String recommendation) {
        this.strategyName = strategyName;
        this.performance = performance;
        this.recommendation = recommendation;
    }

    public MarketingDiscountStrategy() {
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}
