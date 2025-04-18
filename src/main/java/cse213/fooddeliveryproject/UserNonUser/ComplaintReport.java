package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class ComplaintReport implements ReportExporter{
    private String complaintReportId,complaintType,complaintId;
    private LocalDate dateFrom,dateTo;
    private ArrayList<Complaint> complaintList;

    public ComplaintReport() {
    }

    public ComplaintReport(String complaintReportId, String complaintType, String complaintId, LocalDate dateFrom, LocalDate dateTo, ArrayList<Complaint> complaintList) {
        this.complaintReportId = complaintReportId;
        this.complaintType = complaintType;
        this.complaintId = complaintId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.complaintList = complaintList;
    }

    public String getComplaintReportId() {
        return complaintReportId;
    }

    public void setComplaintReportId(String complaintReportId) {
        this.complaintReportId = complaintReportId;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
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

    public ArrayList<Complaint> getComplaintList() {
        return complaintList;
    }

    public void setComplaintList(ArrayList<Complaint> complaintList) {
        this.complaintList = complaintList;
    }

    @Override
    public String toString() {
        return "ComplaintReport{" +
                "complaintReportId='" + complaintReportId + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", complaintId='" + complaintId + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", complaintList=" + complaintList +
                '}';
    }
    public void generateComplaintReport(){

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
