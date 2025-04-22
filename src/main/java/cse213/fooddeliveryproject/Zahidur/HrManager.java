package cse213.fooddeliveryproject.Zahidur;

public class HrManager {
    public int hrId;
    public double salary;
    public String name,email,phone,position;

    public HrManager() {
    }

    public HrManager(int hrId, double salary, String name, String email, String phone, String position) {
        this.hrId = hrId;
        this.salary = salary;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.position = position;
    }

    public int getHrId() {
        return hrId;
    }

    public void setHrId(int hrId) {
        this.hrId = hrId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    @Override
    public String toString() {
        return "HrManager{" +
                "hrId=" + hrId +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
