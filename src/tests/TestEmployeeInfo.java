package tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Employee;
import model.EmployeeInfo;

public class TestEmployeeInfo {
	EmployeeInfo info = new EmployeeInfo();
	Employee employee = new Employee("Alicia", "Rustan", 52000, true);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEmailGenerator() {
		String email = info.emailGenerator(employee);
		assertEquals("arustan", email);
	}
	
	@Test
	public void testWeeklyPay() {
		int pay = info.weeklyPay(employee);
		assertEquals(1000, pay);
	}

}
