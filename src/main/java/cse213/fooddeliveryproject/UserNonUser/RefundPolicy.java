package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class RefundPolicy {
    private String returnPolicyId,description,refundId;
    private int maxRefundDay;
    private ArrayList<String> eligibleCondition;

    public RefundPolicy() {
    }

    public RefundPolicy(String returnPolicyId, String description, String refundId, int maxRefundDay, ArrayList<String> eligibleCondition) {
        this.returnPolicyId = returnPolicyId;
        this.description = description;
        this.refundId = refundId;
        this.maxRefundDay = maxRefundDay;
        this.eligibleCondition = eligibleCondition;
    }

    public String getReturnPolicyId() {
        return returnPolicyId;
    }

    public void setReturnPolicyId(String returnPolicyId) {
        this.returnPolicyId = returnPolicyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public int getMaxRefundDay() {
        return maxRefundDay;
    }

    public void setMaxRefundDay(int maxRefundDay) {
        this.maxRefundDay = maxRefundDay;
    }

    public ArrayList<String> getEligibleCondition() {
        return eligibleCondition;
    }

    public void setEligibleCondition(ArrayList<String> eligibleCondition) {
        this.eligibleCondition = eligibleCondition;
    }

    @Override
    public String toString() {
        return "RefundPolicy{" +
                "returnPolicyId='" + returnPolicyId + '\'' +
                ", description='" + description + '\'' +
                ", refundId='" + refundId + '\'' +
                ", maxRefundDay=" + maxRefundDay +
                ", eligibleCondition=" + eligibleCondition +
                '}';
    }
    public boolean checkEligibility(LocalDate purchaseDate){
        return true;
    }
}
