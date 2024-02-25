package org.example.test.service.impl;

import org.example.test.entity.Employee;
import org.example.test.repository.EmployeeRepository;
import org.example.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> getAllEmpPages(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee getEmpDetailsById(Long id) {
        return employeeRepository.findById(id).orElse(new Employee());
    }

    @Override
    public List<Employee> getEmployeeByDepartmentId(Long id) {
        return employeeRepository.findByDepartmentId(id);
    }


}
