/*
 * Group Members: Katelyn Hampel
 * Assignment: Exercise 4
 * Lab Instructor: Domenick Poster
 * Date: October 2, 2017
 * 
 * Purpose: Abstract and concrete classes. Inheritance. Static and non-static members.
 */

package exercise4;

/*******************************************************************************
This class is a subclass of the class Account.  It is intended to represent
checking accounts. It inherits all of the instance fields of class account
but can not directly access them.  It also inherits the operations provided
for class account.

Class Variables:
		penalty:  Amount of penalty to be applied to the account
			should it fall below it's minimum balance.

Instance Variables:
		minBalance:  Minimum balance required for the account. 
			minBalance can be a negative amount.
*******************************************************************************/
//TODO: Declare the class here



	/*******************************************************************************
	Constructor for class CheckingAccount. It creates a new instance of the account.
	To fill the private instance variables inherited from class Account, it invokes
	the constructor for class account through the call to Account's constructor via 
	the "super" identifier.  Super refers to a class's superclass.
	*******************************************************************************/

public class CheckingAccount extends Account {
	
	private static final double PENALTY = 35.00;
	
	private double minBalance;

	public CheckingAccount(int accountNo, String lastName, String firstName,
			double balance, double minBalance) {
		super(accountNo, lastName, firstName, balance);
		this.minBalance = minBalance;
	}
	// determine how withdrawl will work here
		// if you perform withdrawl and go under the minBalance  = hit them with the penalty.
	
	public void withdrawl(double amount){
		if (getBalance()  > minBalance){
			super.withdrawl(amount);
		}
		else{
			double tempBalance = super.getBalance();
			tempBalance = tempBalance - PENALTY;
			super.setBalance(tempBalance);
			throw new withdrawlException("You have withdrawled too much and will be charges a penalty of $35.00");
		}
	}
	
	// set minimum balance => most minimum balances are $100 (at least for my bank)
	
	
	public boolean checkingMinimumBalance(){
		
		
		
		
		return false;
	}
	
}
