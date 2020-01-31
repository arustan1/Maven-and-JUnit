package model;
/* 
 *  Name: EmployeeInfo.java
 * 	Author: Alicia Rustan
 *  Date: 01/30/2020
 *  
 */

public class EmployeeInfo {

	public String emailGenerator(Employee employee) {
		String email = (employee.getFirstName().charAt(0) + employee.getLastName()).toLowerCase();
		return email;
	}
		
	public int weeklyPay(Employee employee) {
		int pay = (employee.getSalary() / 52);
		return pay;
	}
	
	public boolean hasInsurance(Employee employee) {
		boolean insurance = employee.isInsurance();
		return insurance;
	}
	
	public boolean hasEmergencyContact(Employee employee) {
		boolean contact = false;
		if (employee.getEmergencyContact() != null) {
			contact = true;
		}
		return contact;
	}

}
