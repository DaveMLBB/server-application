package com.example.server.dao;

import com.example.server.models.Employee;
import com.example.server.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void save(Employee employee){
        employeeRepo.save(employee);
    }

    public void delete(Employee employee){
        employeeRepo.delete(employee);
    }

    public List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        Streamable.of(employeeRepo.findAll())
                .forEach(employees::add);
        return employees;
    }
}
