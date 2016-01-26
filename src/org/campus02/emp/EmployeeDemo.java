package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		EmployeeManager em = new EmployeeManager(list);
		
		Employee Mitarbeiter1 = new Employee(1, "Mitarbeiter1", 6000, "GTC", "CEO");
		em.addEmployee(Mitarbeiter1);
		
		Employee Mitarbeiter2 = new Employee(2, "Mitarbeiter2", 4000, "IT", "CTO");
		em.addEmployee(Mitarbeiter2);
		Mitarbeiter2.setSuperior(Mitarbeiter1);
		
		Employee Mitarbeiter3 = new Employee(3, "Mitarbeiter3", 2000, "IT", "DEV");
		em.addEmployee(Mitarbeiter3);
		Mitarbeiter3.setSuperior(Mitarbeiter2);
		
		Employee Mitarbeiter4 = new Employee(4, "Mitarbeiter4", 2000, "IT", "DEV");
		em.addEmployee(Mitarbeiter4);
		Mitarbeiter4.setSuperior(Mitarbeiter2);
		
		Employee Mitarbeiter5 = new Employee(5, "Mitarbeiter5", 3000, "HR", "HR");
		em.addEmployee(Mitarbeiter5);
		Mitarbeiter5.setSuperior(Mitarbeiter1);
		
		System.out.println(OrganigramHandler.getChainOfCommand(Mitarbeiter3));
		
		//CEO seine Mitarbeiter geben.
		Mitarbeiter1.addSubordinate(Mitarbeiter2);
		Mitarbeiter1.addSubordinate(Mitarbeiter5);
				
		//CEO seine Mitarbeiter geben.
		Mitarbeiter2.addSubordinate(Mitarbeiter3);
		Mitarbeiter2.addSubordinate(Mitarbeiter4);
		
		System.out.println(OrganigramHandler.processHierachy(Mitarbeiter1));
		
	}

}
