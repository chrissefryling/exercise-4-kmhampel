/*
 * Group Members: Katelyn Hampel
 * Assignment: Exercise 4
 * Lab Instructor: Domenick Poster
 * Date: October 2, 2017
 * 
 * Purpose: Abstract and concrete classes. Inheritance. Static and non-static members.
 */

package exercise4;
import java.lang.Math;
/*******************************************************************************

This class is a subclass of the class Account.  It is intended to represent
savings accounts.  It inherits all of the instance fields of class account
but can not directly access them.  It also inherits the operations provided
for class account.  Additionally, it has operations to calculate and store
accrued interest.

Class Variables:
		NONE

Instance Variables:
		interestRate:  Interest rate provided as a decimal. i.e. .06 6%
*******************************************************************************/
// TODO: Declare the class here


	/*******************************************************************************
	Constructor for class SavingsAccount. It creates a new instance of the account.  
	To fill the private instance variables inherited from class Account, it invokes
	the constructor for class account through the call to Account's constructor via 
	the "super" identifier.  Super refers to a class's superclass.
	
	*******************************************************************************/

public class SavingsAccount extends Account{

		private double interestRate;
	
	
		public SavingsAccount(int accountNo, String lastName, String firstName,
				double balance, double interestRate) {
			super(accountNo, lastName, firstName, balance);
			
			this.interestRate = interestRate;
			
		}
	
	
		public double compoundingInterest(int numberOfTimesCompounded, int time){
			double tempBalance = this.getBalance();
			
			tempBalance = tempBalance * Math.pow((1 + (interestRate / numberOfTimesCompounded)),
											(numberOfTimesCompounded * time));
		
			
			return tempBalance;
		}
		
	
	
}