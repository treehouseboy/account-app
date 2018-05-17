package accountApp;

import com.google.gson.Gson;



public class AccountAppMain {

	public static void main(String[] args) {

		Service accountService = new Service();

		
		accountService.addAccount(12345, "george", "hardy");
		accountService.addAccount(23456, "dan", "smith");
		accountService.addAccount(123457, "george", "smith");
		accountService.addAccount(123458, "george", "wood");
		accountService.addAccount(123459, "george", "mountain");
//		System.out.print(accountService.listAccounts());

		
		Gson gson = new Gson();
		
//		System.out.println(gson.toJson(accountService.getAccounts()));
		System.out.println(accountService.getNumberOfNames("george"));
		
	}
}
