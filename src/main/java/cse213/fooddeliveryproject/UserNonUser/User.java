package cse213.fooddeliveryproject.UserNonUser;

import java.time.LocalDate;



public abstract class User {
        protected String userId,userName,email,phoneNumber,password,address;
        protected LocalDate dateOfBirth,registrationDate;

        public User() {
        }

        public User(String userId, String userName, String email, String phoneNumber, String password, String address, LocalDate dateOfBirth, LocalDate registrationDate) {
            this.userId = userId;
            this.userName = userName;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
            this.address = address;
            this.dateOfBirth = dateOfBirth;
            this.registrationDate = registrationDate;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId='" + userId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", password='" + password + '\'' +
                    ", address='" + address + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", registrationDate=" + registrationDate +
                    '}';
        }

        public abstract boolean logIn(String userId,String password);
        public void  logOut(){

        }
        public abstract void updateProfile(String userName,String email,String phoneNumber,String address);
        public abstract boolean resetPassword(String oldPassword,String newPassword);
    }


