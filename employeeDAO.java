package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	void createEmployee(Employee employee);
	  Employee getEmployeeById(int employeeId);
		
	void updateEmployeeEmailById(String newmail,int employeeId);
	void deleteEmployeeById(int employeeId);
	List<Employee> getAllEmployeeInfo();

}
