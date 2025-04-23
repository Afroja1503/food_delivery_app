package fooddelivery.fooddeliveryapp;

import java.util.Map;

public class Report {
    private String dateRange;
    private int totalOrders;
    private double totalRevenue;
    private int totalCancellations;
    private Map<String, Integer> bestSellingItems;

    public Report(String dateRange, int totalOrders, double totalRevenue, int totalCancellations,
                  Map<String, Integer> bestSellingItems) {
        this.dateRange = dateRange;
        this.totalOrders = totalOrders;
        this.totalRevenue = totalRevenue;
        this.totalCancellations = totalCancellations;
        this.bestSellingItems = bestSellingItems;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getTotalCancellations() {
        return totalCancellations;
    }

    public void setTotalCancellations(int totalCancellations) {
        this.totalCancellations = totalCancellations;
    }

    public Map<String, Integer> getBestSellingItems() {
        return bestSellingItems;
    }

    public void setBestSellingItems(Map<String, Integer> bestSellingItems) {
        this.bestSellingItems = bestSellingItems;
    }
}

