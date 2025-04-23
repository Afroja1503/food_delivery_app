package cse213.Afroja.UserNonUser;

import java.io.Serializable;

public class Profile implements Serializable {
    private String userId,userName,email,phoneNumber,address,newPassword;

    public Profile(String text, String emailTextFieldText, String mobileNumberTextFieldText, String addressTextFieldText, String newPasswordTextFieldText) {
        this.newPassword = newPassword;
    }

    public Profile(String userId, String userName, String email, String phoneNumber, String address, String newPassword) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.newPassword = newPassword;
    }

    public Profile(String text, String text1, String text2, String text3, String text4, String text5, String newPassword) {
        this.newPassword = newPassword;
    }

    public Profile() {

    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void createProfile(){

    }
    public Profile getProfileDetails(){

        return new Profile();
    }
    public void updateProfile(){

    }
}
