package com.example.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
private Long id;
    @Column(name = "name")
private String name;
    @Column(name = "dob")
private String Dob;
    @Column(name = "role")
private String role;
    @Column(name = "department")
private String department;
    @Column(name = "email_id")
private String emailId;
    @Column(name = "salary")
private BigDecimal salary;
    @Column(name = "address")
    private String address;

    public Employee(String address) {
        this.address = address;
    }



    public Employee(Long id, String name, String dob, String role, String emailId, BigDecimal salary) {
        this.id = id;
        this.name = name;
        Dob = dob;
        this.role = role;
        this.emailId = emailId;
        this.salary = salary;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;

    }
}
