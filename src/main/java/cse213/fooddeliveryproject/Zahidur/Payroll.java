package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;

public class Payroll {
    public int payrollId,employeeId;
    public double basicSalary,bonus,taxDeduction,netSalary;
    public LocalDate paymentDate;

    public Payroll() {
    }

    public Payroll(int payrollId, int employeeId, double basicSalary, double bonus, double taxDeduction, double netSalary, LocalDate paymentDate) {
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.taxDeduction = taxDeduction;
        this.netSalary = netSalary;
        this.paymentDate = paymentDate;
    }

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTaxDeduction() {
        return taxDeduction;
    }

    public void setTaxDeduction(double taxDeduction) {
        this.taxDeduction = taxDeduction;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", employeeId=" + employeeId +
                ", basicSalary=" + basicSalary +
                ", bonus=" + bonus +
                ", taxDeduction=" + taxDeduction +
                ", netSalary=" + netSalary +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
