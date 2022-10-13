package com.abhishek.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.spring.boot.dao.EmployeeDao;
import com.abhishek.spring.boot.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;

	@GetMapping("/getEmp")
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDao.getAllEmployees();
		System.out.println("Data Fetched Successfully");
		return list;
	}

	@GetMapping("/getEmpNo/{empNo}")
	public Employee getEmployee(@PathVariable("empNo") String empNo) {
		System.out.println("Data Fetched Successfully");
		return employeeDao.getEmployee(empNo);
	}

	@PostMapping("/saveEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		System.out.println("Creating employee: " + emp.getEmpNo());
		System.out.println("Data Saved Successfully");
		return employeeDao.addEmployee(emp);
	}

	@PutMapping("/UpdateEmp")
	public Employee updateEmployee(@RequestBody Employee emp) {
		System.out.println("(Updating employee: " + emp.getEmpNo());
		System.out.println("Data Updated Successfully");
		return employeeDao.updateEmployee(emp);
	}

	@DeleteMapping("/DeleteEmp/{empNo}")
	public void deleteEmployee(@PathVariable("empNo") String empNo) {
		System.out.println("Deleting employee: " + empNo);
		System.out.println("Data Deleted Successfully");
		employeeDao.deleteEmployee(empNo);
	}

}
