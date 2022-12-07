package com.example.server.dao;

import com.example.server.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepo employeeRepo;
}
