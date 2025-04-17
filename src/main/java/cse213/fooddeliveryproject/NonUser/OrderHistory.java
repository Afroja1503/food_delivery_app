package cse213.fooddeliveryproject.NonUser;

import java.util.ArrayList;

public class OrderHistory {
    private String customerId;
    private ArrayList<Order> pastOrder;

    public OrderHistory() {
    }

    public OrderHistory(String customerId, ArrayList<Order> pastOrder) {
        this.customerId = customerId;
        this.pastOrder = pastOrder;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Order> getPastOrder() {
        return pastOrder;
    }

    public void setPastOrder(ArrayList<Order> pastOrder) {
        this.pastOrder = pastOrder;
    }

    @Override
    public String toString() {
        return "OrderHistory{" +
                "customerId='" + customerId + '\'' +
                ", pastOrder=" + pastOrder +
                '}';
    }
    public  ArrayList<Order> getHistory(){
        return new ArrayList<>();
    }
}
