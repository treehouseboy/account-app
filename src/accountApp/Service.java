package accountApp;

import java.util.HashMap;
import java.util.Map;

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



}
