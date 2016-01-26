package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> employees = new ArrayList<>();

	public EmployeeManager(ArrayList<Employee> employees) {
		super();
		this.employees = employees;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public Employee findByMaxSalary() {
		Employee found = null;
		double max = 0.0;
		for (Employee employee : employees) {
			if(employee.getSalary() > max) {
				max = employee.getSalary();
				found = employee;
			}
		}
		return found;
	}
	
	public Employee findByEmpNumber(int number) {
		for (Employee employee : employees) {
			if (number == employee.getEmpNumber()) {
				return employee;
			}
		}
		return null;
	}
	
	public ArrayList<Employee> findByDepartment(String department) {
		ArrayList<Employee> list = new ArrayList<>();
		for (Employee employee : employees) {
			if(employee.getDepartment().equals(department)) {
				list.add(employee);
			}
		}
		return list;
	}

}
