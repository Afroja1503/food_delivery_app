package cse213.fooddeliveryproject.NonUser;

import java.util.ArrayList;

public class IssueCatagory {
    private String issueCatagoryId,issueCatagoryName,issueCatagoryDescription,priority;

    public IssueCatagory() {
    }

    public IssueCatagory(String issueCatagoryId, String issueCatagoryName, String issueCatagoryDescription, String priority) {
        this.issueCatagoryId = issueCatagoryId;
        this.issueCatagoryName = issueCatagoryName;
        this.issueCatagoryDescription = issueCatagoryDescription;
        this.priority = priority;
    }

    public String getIssueCatagoryId() {
        return issueCatagoryId;
    }

    public void setIssueCatagoryId(String issueCatagoryId) {
        this.issueCatagoryId = issueCatagoryId;
    }

    public String getIssueCatagoryName() {
        return issueCatagoryName;
    }

    public void setIssueCatagoryName(String issueCatagoryName) {
        this.issueCatagoryName = issueCatagoryName;
    }

    public String getIssueCatagoryDescription() {
        return issueCatagoryDescription;
    }

    public void setIssueCatagoryDescription(String issueCatagoryDescription) {
        this.issueCatagoryDescription = issueCatagoryDescription;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "IssueCatagory{" +
                "issueCatagoryId='" + issueCatagoryId + '\'' +
                ", issueCatagoryName='" + issueCatagoryName + '\'' +
                ", issueCatagoryDescription='" + issueCatagoryDescription + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
    public ArrayList<IssueCatagory> getAllCatagories(){
        return new ArrayList<>();
    }
}
