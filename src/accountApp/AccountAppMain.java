package accountApp;

public class AccountAppMain {

	public static void main(String[] args) {
		
	Service accountService = new Service();
	
	accountService.addAccount(12345, "george", "hardy");
	accountService.addAccount(23456, "dan", "smith");
	System.out.print(accountService.listAccounts());
	
	}

}
