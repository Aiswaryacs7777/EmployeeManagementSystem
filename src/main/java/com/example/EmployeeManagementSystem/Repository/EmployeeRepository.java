package com.example.EmployeeManagementSystem.Repository;

import com.example.EmployeeManagementSystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
