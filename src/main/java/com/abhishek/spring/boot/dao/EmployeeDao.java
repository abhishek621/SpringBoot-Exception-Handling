package com.abhishek.spring.boot.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.abhishek.spring.boot.model.Employee;

@Repository
public class EmployeeDao {

	private static final Map<String, Employee> empMap = new TreeMap<String, Employee>();

	static {
		initEmps();
	}

	private static void initEmps() {
		Employee emp1 = new Employee("E01", "Smith", "Program Manager");
		Employee emp2 = new Employee("E02", "Allen", "Architect");
		Employee emp3 = new Employee("E03", "Jones", "Scrum Master");
		Employee emp4 = new Employee("E04", "Abhishek", "Developer");
		Employee emp5 = new Employee("E05", "Anushka", "Tester");

		empMap.put(emp1.getEmpNo(), emp1);
		empMap.put(emp2.getEmpNo(), emp2);
		empMap.put(emp3.getEmpNo(), emp3);
		empMap.put(emp4.getEmpNo(), emp4);
		empMap.put(emp5.getEmpNo(), emp5);

	}

	public Employee getEmployee(String empNo) {
		return empMap.get(empNo);
	}

	public Employee addEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}

	public Employee updateEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}

	public void deleteEmployee(String empNo) {
		empMap.remove(empNo);
	}

	public List<Employee> getAllEmployees() {
		Collection<Employee> c = empMap.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);
		return list;
	}
}