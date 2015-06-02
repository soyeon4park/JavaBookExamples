package com.example.la_accountmanager;

public class Account {
	/** this class includes methods and field for account information
	 * returning left amount, account name*/

	private int left;
	private String name;
	
	//public methods available to users
	public Account(String name) {
		super();			//....?
		this.name=name;	
	}
	
	public int getLeft() {
		return left;
	}
	
	public void setLeft(int left){
		this.left=left;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
