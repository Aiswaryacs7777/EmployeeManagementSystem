package com.example.EmployeeManagementSystem.Service;

import com.example.EmployeeManagementSystem.Entity.Employee;
import com.example.EmployeeManagementSystem.Repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id)
                .orElseThrow(()  ->new EntityNotFoundException("Employee not found with id:"+id));
    }
    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Long id,Employee employee){
        Employee existingEmployee =getEmployeeById(id);

        existingEmployee.setName(employee.getName());
        existingEmployee.setRole(employee.getRole());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setEmailId(employee.getEmailId());

        return employeeRepository.save(existingEmployee);
    }
    public void deleteEmployee(Long id){
        Employee existingEmployee = getEmployeeById(id);
        employeeRepository.delete(existingEmployee);
    }

}
