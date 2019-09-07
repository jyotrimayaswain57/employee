package com.att.employee.attendance.serviceImpl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.att.employee.attendance.enitty.Employee;
import com.att.employee.attendance.model.EmployeeDetails;
import com.att.employee.attendance.repo.EmployeeRepo;
@Service
public class employeeServiceImpl {
	@Autowired
    private EmployeeRepo erepo;
	
	public  EmployeeDetails createEmployee(EmployeeDetails emp) {
		Employee employee=new Employee();
    	employee.setEsrno(emp.getEsrno());
    	employee.setEmpid(emp.getEmpid());
    	employee.setEmpName(emp.getEmpName());

		Employee emp1=erepo.save(employee);
		
		EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.setEsrno(emp1.getEsrno());
		employeeDetails.setEmpid(emp1.getEmpid());
		employeeDetails.setEmpName(emp1.getEmpName());
		return employeeDetails;
		
	}
	public  List<EmployeeDetails> getAllEmployee() {
		
		List<Employee> listEmp=erepo.findAll();
		List<EmployeeDetails> listEmployeeDetails=new ArrayList<EmployeeDetails>();
		listEmp.forEach(employee ->{
			EmployeeDetails employeeDetails=new EmployeeDetails();
			employeeDetails.setEsrno(employee.getEsrno());
			employeeDetails.setEmpid(employee.getEmpid());
			employeeDetails.setEmpName(employee.getEmpName());
			listEmployeeDetails.add(employeeDetails);
		});
		
		return listEmployeeDetails;
		
	}
}
