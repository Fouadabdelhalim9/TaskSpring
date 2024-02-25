package org.example.test.service;

import org.example.test.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Page<Employee> getAllEmpPages(Pageable pageable);

    Employee getEmpDetailsById(Long id);

    List<Employee> getEmployeeByDepartmentId(Long id);
}
