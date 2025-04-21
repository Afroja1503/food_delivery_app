package cse213.Afroja.UserNonUser;

import java.time.LocalDate;

public  abstract class Employee extends User {
    protected String employeeId,designation,department;
    protected LocalDate joiningDate;
    protected double salary;

    public Employee() {
    }

    public Employee(String employeeId, String designation, String department, LocalDate joiningDate, double salary) {
        this.employeeId = employeeId;
        this.designation = designation;
        this.department = department;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                '}';
    }

    public  boolean viewSalarySlip(){
        return true;

    }
    public abstract boolean requestLeave(LocalDate dateFrom,LocalDate dateTo);
    public abstract void assignTask();



}


