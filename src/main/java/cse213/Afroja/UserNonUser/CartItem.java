package cse213.Afroja.UserNonUser;

import java.io.Serializable;

public class CartItem implements Serializable {
    private String cartItemId,foodItemId,cartId;
    private int quantity;
    private double price;

    public CartItem() {
    }

    public CartItem(String cartItemId, String foodItemId, String cartId, int quantity, double price) {
        this.cartItemId = cartItemId;
        this.foodItemId = foodItemId;
        this.cartId = cartId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    public String getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(String foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId='" + cartItemId + '\'' +
                ", foodItemId='" + foodItemId + '\'' +
                ", cartId='" + cartId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
    public void updateQuantity(){

    }
    public double getTotalPrice(){
        return 0.0;
    }
}
