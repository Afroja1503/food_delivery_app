package fooddelivery.fooddeliveryapp;

public class MarketingSurvey {
    private String format;
    private String question;
    private String targetGroup;

    public MarketingSurvey(String format, String question, String targetGroup) {
        this.format = format;
        this.question = question;
        this.targetGroup = targetGroup;
    }

    public MarketingSurvey() {
    }

    public String getFormat() {
        return format;
    }

    public String getQuestion() {
        return question;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }
}
