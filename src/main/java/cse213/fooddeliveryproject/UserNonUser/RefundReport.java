package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class RefundReport implements ReportExporter{
    private String refundReportId,reportId;
    private int totalRefund;
    private LocalDate dateFrom,dateTo;
    private ArrayList<Refund> reportData;

    public RefundReport() {
    }

    public RefundReport(String refundReportId, String reportId, int totalRefund, LocalDate dateFrom, LocalDate dateTo, ArrayList<Refund> reportData) {
        this.refundReportId = refundReportId;
        this.reportId = reportId;
        this.totalRefund = totalRefund;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.reportData = reportData;
    }

    public String getRefundReportId() {
        return refundReportId;
    }

    public void setRefundReportId(String refundReportId) {
        this.refundReportId = refundReportId;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public int getTotalRefund() {
        return totalRefund;
    }

    public void setTotalRefund(int totalRefund) {
        this.totalRefund = totalRefund;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public ArrayList<Refund> getReportData() {
        return reportData;
    }

    public void setReportData(ArrayList<Refund> reportData) {
        this.reportData = reportData;
    }

    @Override
    public String toString() {
        return "RefundReport{" +
                "refundReportId='" + refundReportId + '\'' +
                ", reportId='" + reportId + '\'' +
                ", totalRefund=" + totalRefund +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", reportData=" + reportData +
                '}';
    }
    public  void generateRefundReport(){

    }
    public void  exportToPDF(String format){

    }

    @Override
    public void exportAsPDF() {

    }

    @Override
    public void convertToFormat() {

    }

    @Override
    public void saveToFolder() {

    }
}
