package com.example.server;

import com.example.server.dao.EmployeeDao;
import com.example.server.models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	void addEmployeeTest(){

		Employee employee = new Employee();
		employee.setName("InsertName");
		employee.setLocation("InsertLocation");
		employee.setBranch("InsertBranch");
		employeeDao.save(employee);
	}

}
