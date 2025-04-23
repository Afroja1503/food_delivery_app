package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderHistory implements Serializable {
    private String customerId,orderStatus;
    private ArrayList<Order> pastOrder;
    private LocalDate dateFrom,dateTo;

    @Override
    public String toString() {
        return "OrderHistory{" +
                "customerId='" + customerId + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", pastOrder=" + pastOrder +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                '}';
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    public OrderHistory(String customerId, LocalDate dateFrom, LocalDate dateTo) {
        this.customerId = customerId;
        this.orderStatus = orderStatus;
        this.pastOrder = pastOrder;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public OrderHistory() {
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

    public  ArrayList<Order> getHistory(){
        return new ArrayList<>();
    }
}
