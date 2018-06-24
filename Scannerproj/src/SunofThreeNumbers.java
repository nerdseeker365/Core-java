
import java.util.Scanner;
public class SunofThreeNumbers {
	public static void main(String[ ] args) {
		Scanner s2=new Scanner(System.in);
		double a;
		double b;
		double t;
		System.out.println("enter a value: ");
		a=s2.nextDouble();
		System.out.println("enter b value: ");
		b=s2.nextDouble();
		t=a+b;
		System.out.println("addition of two numbers: "+t);
		
		
	}

}
/** 
 * note:
 * int values ->nextInt();
 * double values->nextDouble();
 * String vlues -> nextLine();
 */