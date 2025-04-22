package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;

public class Employee {
    public int employeeId;
    public String name,position,email,phone;
    public  double salary;
    public LocalDate hireDate;
    public double performanceRating;
    private String payrollDetails;

    public Employee() {
    }

    public Employee(int employeeId, String name, String position, String email, String phone, double salary, LocalDate hireDate, double performanceRating, String payrollDetails) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.hireDate = hireDate;
        this.performanceRating = performanceRating;
        this.payrollDetails = payrollDetails;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(double performanceRating) {
        this.performanceRating = performanceRating;
    }

    public String getPayrollDetails() {
        return payrollDetails;
    }

    public void setPayrollDetails(String payrollDetails) {
        this.payrollDetails = payrollDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", performanceRating=" + performanceRating +
                ", payrollDetails='" + payrollDetails + '\'' +
                '}';
    }
}
