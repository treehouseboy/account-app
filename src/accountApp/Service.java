package accountApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class Service {

	private HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();
	private int nextID = 0;

	public Service() {

	}

	public void addAccount(int accountNumber, String firstName, String secondName) {

		accountMap.put(nextID, new Account(accountNumber, firstName, secondName));
		nextID++;
	}

	public void removeAccount(int accountID) {

		accountMap.remove(accountID);

	}

	public String listAccounts() {
		
		String list = "";

		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			list = list + entry.getValue() + "\n";
		}
		
		return list;
	}
	
	public HashMap<Integer, Account> getAccounts() {
		return accountMap;
	}

	public int getNextID() {
		return nextID;
	}

	public void setNextID(int nextID) {
		this.nextID = nextID;
	}
	
	public int getNumberOfNames(String name) {
		
		int total = 0;
//		int result = accountMap.entrySet().stream().filter(name -> name.getValue();
		for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
			if(entry.getValue().getFirstName() == name) {
				total++;
			}
		}
		
		return total;
	}



}
