package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cart {
    private String  cartId,customerId;
    private ArrayList<CartItem> item;
    private  double  totalPrice;
    private LocalDate creationDate;

    public Cart() {
    }

    public Cart(String cartId, String customerId, ArrayList<CartItem> item, double totalPrice, LocalDate creationDate) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.item = item;
        this.totalPrice = totalPrice;
        this.creationDate = creationDate;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<CartItem> getItem() {
        return item;
    }

    public void setItem(ArrayList<CartItem> item) {
        this.item = item;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", item=" + item +
                ", totalPrice=" + totalPrice +
                ", creationDate=" + creationDate +
                '}';
    }
    public void addItem(CartItem item){

    }
    public void  removeItem(String itemId){

    }
    public double calculateTotal(){
        return 0.0;
    }
    public void clearCart(CartItem item){

    }
}
