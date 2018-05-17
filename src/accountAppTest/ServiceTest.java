package accountAppTest;

import static org.junit.Assert.*;

import org.junit.Test;

import accountApp.Service;

public class ServiceTest {

	Service testService = new Service();

	@Test
	public void testAddAccount() {
		testService.addAccount(1234, "george", "hardy");
		assertEquals("Incorrect first name", "george", testService.getAccounts().get(0).getFirstName());
		assertEquals("Incorrect last name", "hardy", testService.getAccounts().get(0).getLastName());
		assertEquals("Incorrect account number", 1234, testService.getAccounts().get(0).getAccountNumber());
	}

	@Test
	public void testRemoveccount() {
		testService.removeAccount(0);
		assertEquals("Account has not been removed", null, testService.getAccounts().get(0));
	}

	@Test
	public void testListAccountsPopulated() {
		testService.addAccount(1234, "george", "hardy");
		assertEquals("List has not been populated", "Account number: 1234\n" + "Name: george hardy\n", testService.listAccounts());
	}
	
	
	@Test
	public void testListAccountsEmpty() {
		testService.addAccount(1234, "george", "hardy");
		testService.removeAccount(0);
		assertEquals("List is not empty", "", testService.listAccounts());
	}
	
	@Test
	public void testNumberOfNames() {
		testService.addAccount(12345, "george", "hardy");
		testService.addAccount(23456, "dan", "smith");
		testService.addAccount(123457, "george", "smith");
		testService.addAccount(123458, "george", "wood");
		testService.addAccount(123459, "george", "mountain");
		
		assertEquals("Incorrect number of names", 4, testService.getNumberOfNames("george"));
	}


}
