package cse213.fooddeliveryproject.User;

import java.time.LocalDate;

public class CustomerSupportAgent extends Employee {
    private String customerAgentId,role;

    public CustomerSupportAgent() {
    }

    public CustomerSupportAgent(String employeeId, String designation, String department, LocalDate joiningDate, double salary) {
        super(employeeId, designation, department, joiningDate, salary);
    }

    public CustomerSupportAgent(String customerAgentId, String role) {
        this.customerAgentId = customerAgentId;
        this.role = role;
    }

    public CustomerSupportAgent(String employeeId, String designation, String department, LocalDate joiningDate, double salary, String customerAgentId, String role) {
        super(employeeId, designation, department, joiningDate, salary);
        this.customerAgentId = customerAgentId;
        this.role = role;
    }

    public String getCustomerAgentId() {
        return customerAgentId;
    }

    public void setCustomerAgentId(String customerAgentId) {
        this.customerAgentId = customerAgentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "CustomerSupportAgent{" +
                "customerAgentId='" + customerAgentId + '\'' +
                ", role='" + role + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
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

    @Override
    public boolean requestLeave(LocalDate dateFrom, LocalDate dateTo) {
        return false;
    }

    @Override
    public void assignTask() {

    }

    @Override
    public Report generateReport() {
        return null;
    }

}
