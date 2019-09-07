package com.att.employee.attendance.enitty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Long esrno;
    private String empid;
    private String empName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getEsrno() {
		return esrno;
	}
	public void setEsrno(Long esrno) {
		this.esrno = esrno;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
