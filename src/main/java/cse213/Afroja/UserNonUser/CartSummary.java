package cse213.Afroja.UserNonUser;

public class CartSummary {
    private String cartId,cartItemId;
    private int  itemCount;
    private double  totalAmount,deliveryFee,discountFee;

    public CartSummary() {
    }

    public CartSummary(String cartId, String cartItemId, int itemCount, double totalAmount, double deliveryFee, double discountFee) {
        this.cartId = cartId;
        this.cartItemId = cartItemId;
        this.itemCount = itemCount;
        this.totalAmount = totalAmount;
        this.deliveryFee = deliveryFee;
        this.discountFee = discountFee;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public double getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(double discountFee) {
        this.discountFee = discountFee;
    }

    @Override
    public String toString() {
        return "CartSummary{" +
                "cartId='" + cartId + '\'' +
                ", cartItemId='" + cartItemId + '\'' +
                ", itemCount=" + itemCount +
                ", totalAmount=" + totalAmount +
                ", deliveryFee=" + deliveryFee +
                ", discountFee=" + discountFee +
                '}';
    }
    public void applyCoupon(){

    }
    public CartSummary generateSummary(){
        return new CartSummary();

    }
}
