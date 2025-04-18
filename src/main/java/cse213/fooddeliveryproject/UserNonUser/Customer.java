package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends User {
    private String customerId,deliveryAddress;

    public Customer() {
    }

    public Customer(String userId, String userName, String email, String phoneNumber, String password, String address, LocalDate dateOfBirth, LocalDate registrationDate) {
        super(userId, userName, email, phoneNumber, password, address, dateOfBirth, registrationDate);
    }

    public Customer(String customerId, String deliveryAddress) {
        this.customerId = customerId;
        this.deliveryAddress = deliveryAddress;
    }

    public Customer(String userId, String userName, String email, String phoneNumber, String password, String address, LocalDate dateOfBirth, LocalDate registrationDate, String customerId, String deliveryAddress) {
        super(userId, userName, email, phoneNumber, password, address, dateOfBirth, registrationDate);
        this.customerId = customerId;
        this.deliveryAddress = deliveryAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", registrationDate=" + registrationDate +
                '}';
    }

    @Override
    public boolean logIn(String userId, String password) {
        return false;
    }

    @Override
    public void updateProfile(String userName, String email, String phoneNumber, String address) {

    }

    @Override
    public boolean resetPassword(String oldPassword, String newPassword) {
        return false;
    }

    public boolean updateProfile(String name,String email,String phoneNumber,String address,String newPassword){
        return true;
    }
    public boolean addToCart(FoodItem selectItem,Float quantity,Restaurant selectRestaurant){
        return true;
    }
    public boolean placeOrder(String deliveryAddress,String paymentMethod){
        return true;
    }
    public boolean cancelOrder(String reasonForCancellation){
        return true;
    }
    public void  trackOrderStatus(){

    }
    public ArrayList<Order> viewOrderHistory(LocalDate dateFrom, LocalDate dateTo, Order orderStatus){
        return new ArrayList<>();

    }
    public void rateAndReview(String rating,String review){

    }
    public boolean  contactCustomerSupportAgent(String choosesIssueCatagory,String explainingMessage,String orderId){
        return true;
    }


}

