package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;

public class HrManager {
    public int hrId;
    public String name,email,phone,position;
    public double salary;
    public LocalDate joinDate;

    public HrManager() {
    }

    public HrManager(int hrId, String name, String email, String phone, String position, double salary, LocalDate joinDate) {
        this.hrId = hrId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public int getHrId() {
        return hrId;
    }

    public void setHrId(int hrId) {
        this.hrId = hrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "HrManager{" +
                "hrId=" + hrId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", joinDate=" + joinDate +
                '}';
    }
}
