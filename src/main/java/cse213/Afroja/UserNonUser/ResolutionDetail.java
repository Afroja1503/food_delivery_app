package cse213.Afroja.UserNonUser;

import java.time.LocalDate;

public class ResolutionDetail {
    private String resolutionId,issueId,complaintId,resolutionNote;
    private LocalDate  resolutionDate;
    private int stepsTaken;

    public ResolutionDetail() {
    }

    public ResolutionDetail(String resolutionId, String issueId, String complaintId, String resolutionNote, LocalDate resolutionDate, int stepsTaken) {
        this.resolutionId = resolutionId;
        this.issueId = issueId;
        this.complaintId = complaintId;
        this.resolutionNote = resolutionNote;
        this.resolutionDate = resolutionDate;
        this.stepsTaken = stepsTaken;
    }

    public String getResolutionId() {
        return resolutionId;
    }

    public void setResolutionId(String resolutionId) {
        this.resolutionId = resolutionId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getResolutionNote() {
        return resolutionNote;
    }

    public void setResolutionNote(String resolutionNote) {
        this.resolutionNote = resolutionNote;
    }

    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(LocalDate resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public int getStepsTaken() {
        return stepsTaken;
    }

    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }

    @Override
    public String toString() {
        return "ResolutionDetail{" +
                "resolutionId='" + resolutionId + '\'' +
                ", issueId='" + issueId + '\'' +
                ", complaintId='" + complaintId + '\'' +
                ", resolutionNote='" + resolutionNote + '\'' +
                ", resolutionDate=" + resolutionDate +
                ", stepsTaken=" + stepsTaken +
                '}';
    }
    public void addResolution(){

    }
    public void  markResolved(){

    }
    public void  updateResolutionNote(){

    }
}
