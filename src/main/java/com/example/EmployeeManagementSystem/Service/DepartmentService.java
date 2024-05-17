package com.example.EmployeeManagementSystem.Service;

import com.example.EmployeeManagementSystem.Entity.Department;
import com.example.EmployeeManagementSystem.Repository.DepartmentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(Long id){
        return departmentRepository.findById(id)
                .orElseThrow(() ->new EntityNotFoundException("Department not found with id:"+ id));
    }

    public Department createDepartment(Department department){
        return departmentRepository.save(department);

    }

    public Department updateDepartment(Long id,Department department){
        Department existingDepartment= getDepartmentById(id);

        existingDepartment.setDepartmentName(department.getDepartmentName());
        existingDepartment.setDepartmentHead(department.getDepartmentHead());

        return departmentRepository.save(existingDepartment);

    }

    public void deleteDepartment(Long id){
        Department existingDepartment= getDepartmentById(id);
        departmentRepository.delete(existingDepartment);
    }
}
