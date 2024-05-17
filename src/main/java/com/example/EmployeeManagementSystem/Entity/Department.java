package com.example.EmployeeManagementSystem.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "departmentName")
    private String departmentName;

    @Column(name = "departmentHead")
    private String departmentHead;

    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
    private List<Employee> employees;

    public Department(Long id, String departmentName, String departmentHead) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public Department() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentname) {
        this.departmentName = departmentname;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
