package model;

public class Employee {
		private String firstName;
		private String lastName;
		private String email;
		private int salary;
		private boolean insurance;
		private String emergencyContact;
		
		public Employee(String firstName, String lastName, int salary, boolean insurance) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
			this.insurance = insurance;
		}
		
		public Employee(String firstName, String lastName, String email, int slary, boolean insurance, String emergencyContact) {
		}
		
		public Employee() {
			
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public boolean isInsurance() {
			return insurance;
		}

		public void setInsurance(boolean insurance) {
			this.insurance = insurance;
		}

		public String getEmergencyContact() {
			return emergencyContact;
		}

		public void setEmergencyContact(String emergencyContact) {
			this.emergencyContact = emergencyContact;
		}
		
		
		
	

}
