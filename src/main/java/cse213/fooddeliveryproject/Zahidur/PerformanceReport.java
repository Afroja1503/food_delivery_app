package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;

public class PerformanceReport {
    public int reportId,staffId;
    public String staffName,performanceComment;
    public double rating;
    public LocalDate reportDate;

    public PerformanceReport() {
    }

    public PerformanceReport(int reportId, int staffId, String staffName, String performanceComment, double rating, LocalDate reportDate) {
        this.reportId = reportId;
        this.staffId = staffId;
        this.staffName = staffName;
        this.performanceComment = performanceComment;
        this.rating = rating;
        this.reportDate = reportDate;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPerformanceComment() {
        return performanceComment;
    }

    public void setPerformanceComment(String performanceComment) {
        this.performanceComment = performanceComment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "PerformanceReport{" +
                "reportId=" + reportId +
                ", staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", performanceComment='" + performanceComment + '\'' +
                ", rating=" + rating +
                ", reportDate=" + reportDate +
                '}';
    }
}
