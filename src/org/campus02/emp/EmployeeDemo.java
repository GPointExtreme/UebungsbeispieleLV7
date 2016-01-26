package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		EmployeeManager Manager = new EmployeeManager(list);
		
		Employee emp1 = new Employee(1, "emp1", 2000, "IT");
		list.add(emp1);
		Employee emp2 = new Employee(2, "emp2", 1000, "IT");
		list.add(emp2);
		Employee emp3 = new Employee(3, "emp3", 3000, "IT");
		list.add(emp3);
		Employee emp4 = new Employee(4, "emp4", 5000, "HR");
		list.add(emp4);
		
		System.out.println(Manager.findByMaxSalary());
		
		System.out.println(Manager.findByEmpNumber(1));
		
		System.out.println(Manager.findByDepartment("IT"));
		
		

	}

}
