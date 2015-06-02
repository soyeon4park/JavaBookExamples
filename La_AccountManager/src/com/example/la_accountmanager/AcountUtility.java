package com.example.la_accountmanager;
import java.util.ArrayList;

public class AcountUtility {
	/** Contains all the account name. Methods includes checkers for avoiding duplicate account name,
	 * withdraw methods (subtracts left amount and update the account amount) and deposit methods (
	 * adds money and update account amount) */

	ArrayList<Account> accArray;	//needs to be initialized first in order for newAccount method to work

	//a constructor
	public AcountUtility() { 
		accArray=new ArrayList<Account>();
	}

	//checks if account name is duplicate return 1 if succeeded
	public boolean newAccount(String name) {
		boolean result = accArray.add(new Account(name));
		return result;
	}

	public void deposit(String name, int deposit){
		int target=-1;

		for (int i=0; i<accArray.size(); i++) {
			if (accArray.get(i).getName()==name) {
				target=i;
			}
		}
		accArray.get(target).setLeft(deposit+accArray.get(target).getLeft());
	}

	public int withdraw(int amount, String name){
		int target=-1;

		for (int i=0; i<accArray.size(); i++) {
			if (accArray.get(i).getName()==name) {
				target=i;
			}
			accArray.get(target).setLeft(accArray.get(target).getLeft()-amount);
		}
		return accArray.get(target).getLeft();
	}
	
	
	

}
