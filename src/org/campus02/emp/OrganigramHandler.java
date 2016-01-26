package org.campus02.emp;

public class OrganigramHandler {
	
	public static String getChainOfCommand(Employee employee) {
		String dienstweg = employee.getName() + " [" + employee.getRole() + "]";
		if(employee.getSuperior() == null) {
			return dienstweg;
		}
		return dienstweg + " -> " + getChainOfCommand(employee.getSuperior());
	}
	
	public static String processHierachy(Employee employee) {
		if(employee.getSubordinates().size() == 0) {
			return "- " + employee.getName() + " [" + employee.getRole() + "] \n";
		}
		String dienstweg = "+ " + employee.getName() + " [" + employee.getRole() + "] \n";
		for (Employee emp : employee.getSubordinates()) {
			dienstweg += processHierachy(emp);
		}
		return dienstweg;
	}

}
