package fooddelivery.fooddeliveryapp;

import java.time.LocalDate;

public class Promotion {
    private String promoCode;
    private double discountPercent;
    private String eligibleItems;
    private LocalDate startDate;
    private LocalDate endDate;

    public Promotion(String promoCode, double discountPercent, String eligibleItems, LocalDate startDate, LocalDate endDate) {
        this.promoCode = promoCode;
        this.discountPercent = discountPercent;
        this.eligibleItems = eligibleItems;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Promotion() {
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getEligibleItems() {
        return eligibleItems;
    }

    public void setEligibleItems(String eligibleItems) {
        this.eligibleItems = eligibleItems;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promoCode='" + promoCode + '\'' +
                ", discountPercent=" + discountPercent +
                ", eligibleItems='" + eligibleItems + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public String getDurationString() {
        return startDate + " to " + endDate;
    }

}
