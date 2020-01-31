package tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Employee;
import model.EmployeeInfo;

public class TestEmployeeMisc {
	EmployeeInfo info = new EmployeeInfo();
	Employee employee = new Employee("Alicia", "Rustan", 52000, true);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHasInsurance() {
		boolean insurance = info.hasInsurance(employee);
		assertTrue(insurance);
	}
	
	@Test
	public void testHasEmergencyContact() {
		boolean contact = info.hasEmergencyContact(employee);
		assertFalse(contact);
	}

}
