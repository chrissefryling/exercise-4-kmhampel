/*
 * Group Members: Katelyn Hampel
 * Assignment: Exercise 4
 * Lab Instructor: Domenick Poster
 * Date: October 2, 2017
 * 
 * Purpose: Abstract and concrete classes. Inheritance. Static and non-static members.
 */

package exercise4;

/***************************************************************************
This class models a basic account that we might find at any financial 
institution.

It defines basic operations that will apply to accounts of all types.

Class variables:	
		nextAccountNumber:  This holds the next available account number
			to be assigned to a new account.

Instance Variables:
		accountNo:  account number for the account.
		lastName:  Account holder's last name
		firstName:  Account Holder's first name
		balance:  Account balance
****************************************************************************/
//TODO: Declare the class here

public abstract class Account{
	
	private static int nextAccountNumber = 1; // counter - increments account number to make a new account number
	
	private int accountNo;
	private String lastName;
	private String firstName;
	private double balance;
	
	public Account(int accountNo, String lastName, String firstName, double balance){
		this.accountNo = nextAccountNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.balance = balance;
		
		// set account number and increment the next account number
		nextAccountNumber = accountNo + 1;
	}
	
	
	public  void deposit(double moneyDeposited){
		balance = balance + moneyDeposited;
		
	}
	
	public void withdrawl(double moneyTakenOut){
		balance = balance - moneyTakenOut;
		// can throw an exception
		// banks do deal with negative balance
		
	}
	
	
	
	
	
	
	
	// mutators
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	// accessors
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public double getBalance() {
		return balance;
	}
}