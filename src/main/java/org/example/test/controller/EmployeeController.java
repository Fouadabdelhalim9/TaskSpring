package org.example.test.controller;

import org.example.test.entity.Employee;
import org.example.test.repository.EmployeeRepository;
import org.example.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/pages")
    public Page<Employee> getAllEmpPages(Pageable pageable){
        return employeeService.getAllEmpPages(pageable);
    }

    @GetMapping("/{id}")
    public Employee getEmpDetailsById(@PathVariable(name = "id") Long id){
        return employeeService.getEmpDetailsById(id);
    }

    @GetMapping("/department/{id}")
    public List<Employee> getEmployeeByDepartmentId(@PathVariable(name = "id") Long id){
        return employeeService.getEmployeeByDepartmentId(id);
    }
}
