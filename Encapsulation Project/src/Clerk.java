
public class Clerk {//User Class

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		acc1.setBalance(234.1);
		System.out.println(acc1.getBalance());
		//acc1.balance; //Direct access not possible
		//System.out.println(acc1.balance); direct access not possible because of private variable
		acc1.setBalance(-234.1);
		System.out.println(acc1.getBalance());

	}

}
