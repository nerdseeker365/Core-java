/*ENCAPSULATION:
 * The process of defining a class by Hiding its data from direct access from the outside class
 * members and providing its access only through publicly accessing setter and getter methods with proper 
 * validations is called "ENCAPSULATION"
 */
/*
 * HOW CAN WE DEVELOP ENCAPSULATION IN JAVA:
 * 1.By declaring all variables as private
 * 2.By defining  one pair of public setter and getter methods.
 */
public class BankAccount {//Encapsulated Class
	private double balance;
	
		public void setBalance(double balance) {
		if(balance<0) {
			System.out.println("Do not enter Negitive amount ");
		}
			else {
				this.balance=balance;
			
		}
		
	}
		public double getBalance() {
			return balance;
		}

}
