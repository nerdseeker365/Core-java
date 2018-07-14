import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=null;
		int n=0;
		int i=0,j=0;
		sc=new Scanner(System.in);
		System.out.print("Enter n value: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {	
			// for(j=1;j<=i;j++) {
				System.out.print(" " +j);
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
