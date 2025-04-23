package cse213.Afroja.UserNonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Cart implements Serializable {
    protected String  cartId,customerId;
    protected ArrayList<CartItem> item;

    protected LocalDate creationDate;
    protected float quantity;
    protected double price;
    protected String foodItem;

    public Cart(LocalDate value, Object o, double v, String selectItemComboBoxValue, String selectRestaurantComboBoxValue) {
    }



    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", item=" + item +
                ", creationDate=" + creationDate +
                ", quantity=" + quantity +
                ", price=" + price +
                ", foodItem='" + foodItem + '\'' +
                ", restaurant='" + restaurant + '\'' +
                '}';
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public Cart(String cartId, String customerId, ArrayList<CartItem> item, LocalDate creationDate, float quantity, double price, String foodItem, String restaurant) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.item = item;
        this.creationDate = creationDate;
        this.quantity = quantity;
        this.price = price;
        this.foodItem = foodItem;
        this.restaurant = restaurant;
    }



    private String restaurant;

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Cart() {
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



    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void addItem(CartItem item){

    }
    public void  removeItem(String itemId){

    }
    public double calculateTotal(){
        double tot = this.price * this.quantity;


        return tot;
    }
    public void clearCart(CartItem item){

    }


}
