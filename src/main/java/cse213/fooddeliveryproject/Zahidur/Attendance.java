package cse213.fooddeliveryproject.Zahidur;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
    public int attendanceId,employeeId;
    public String status;
    public LocalDate dateOfAttend;
    public LocalTime checkInTime;
    public LocalTime checkOutTime;

    public Attendance() {
    }

    public Attendance(int attendanceId, int employeeId, String status, LocalDate dateOfAttend, LocalTime checkInTime, LocalTime checkOutTime) {
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
        this.status = status;
        this.dateOfAttend = dateOfAttend;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateOfAttend() {
        return dateOfAttend;
    }

    public void setDateOfAttend(LocalDate dateOfAttend) {
        this.dateOfAttend = dateOfAttend;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", employeeId=" + employeeId +
                ", status='" + status + '\'' +
                ", dateOfAttend=" + dateOfAttend +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                '}';
    }
}
