import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int i;
		
		//int number=5;//is the calculate the factorial
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the NUMBER of Factorial::");
		
		int number=sc.nextInt();
		
				
		int fact=1;
		
		for(i=1;i<=number;i++) {
			
			fact=fact*i;
			
			System.out.println("Factorial of "+i+" is:\t"+fact);
			
		}
		
		System.out.println("Factorial of"+number+"is"+fact);
		
	

	}
	
	

}
