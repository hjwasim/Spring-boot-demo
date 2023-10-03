package com.vignesh.employeemanagementsystem.models;

import java.time.LocalDate;

/**
 * @author Hjwasim
 */
public class Attendance {
    private Integer id;
    private Integer empId;
    private String empName;
    private String empEmail;
    private AttendanceStatus status;
    private LocalDate dateOfAttendance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }

    public LocalDate getDateOfAttendance() {
        return dateOfAttendance;
    }

    public void setDateOfAttendance(LocalDate dateOfAttendance) {
        this.dateOfAttendance = dateOfAttendance;
    }
}
