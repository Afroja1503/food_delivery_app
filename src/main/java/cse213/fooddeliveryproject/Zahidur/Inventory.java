package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;

public class Inventory {
    public int itemId,quantity;
    public String itemName,customerName,status;
    public LocalDate expireDate;

    public Inventory() {
    }

    public Inventory(int itemId, int quantity, String itemName, String customerName, String status, LocalDate expireDate) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.itemName = itemName;
        this.customerName = customerName;
        this.status = status;
        this.expireDate = expireDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "itemId=" + itemId +
                ", quantity=" + quantity +
                ", itemName='" + itemName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", status='" + status + '\'' +
                ", expireDate=" + expireDate +
                '}';
    }
}
