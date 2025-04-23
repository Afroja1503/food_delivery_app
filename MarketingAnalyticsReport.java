package fooddelivery.fooddeliveryapp;


public class MarketingAnalyticsReport {
    private String metric;
    private String value;
    private String period;

    public MarketingAnalyticsReport(String metric, String value, String period) {
        this.metric = metric;
        this.value = value;
        this.period = period;
    }

    public String getMetric() {
        return metric;
    }

    public String getValue() {
        return value;
    }

    public String getPeriod() {
        return period;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
