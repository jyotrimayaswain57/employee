package com.att.employee.attendance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.att.employee.attendance.enitty.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
