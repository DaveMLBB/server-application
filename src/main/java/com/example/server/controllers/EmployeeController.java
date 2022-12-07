package com.example.server.controllers;

import com.example.server.dao.EmployeeDao;
import com.example.server.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/get-all")
    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployee();
    }

    @PostMapping("/save")
    public void save(@RequestBody Employee employee){
        employeeDao.save(employee);
    }
}
