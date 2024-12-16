package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	List<Employee> getAllEmployees();

	Employee updateEmployee(Long id, Employee employee);

	void deleteEmployee(Long id);
}
