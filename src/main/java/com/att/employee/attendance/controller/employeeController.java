package com.att.employee.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.att.employee.attendance.enitty.Employee;
import com.att.employee.attendance.model.EmployeeDetails;
import com.att.employee.attendance.serviceImpl.employeeServiceImpl;

@RestController
@RequestMapping("/Employee")
public class employeeController {
	@Autowired
	private employeeServiceImpl service;

	@PostMapping("/create")
	public EmployeeDetails createEmp(EmployeeDetails emp) {
		EmployeeDetails emp1 = service.createEmployee(emp);
		return emp1;

	}

	@GetMapping("/getAllEmployee")
	public List<EmployeeDetails> getAllEmp() {
		List<EmployeeDetails> listEmployeeDetails = service.getAllEmployee();
		return listEmployeeDetails;

	}
}
