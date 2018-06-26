import java.util.Scanner;
public class SamplePattern {
	 public static void printStars(int n) {
	   	        int i, j;
		        for(i=0; i<n; i++)  {
	      
	 	            for(j=0; j<=i; j++)   {
	         	                // printing stars
	                System.out.print("* ");
	            }
	 
	            // ending line after each row
	            System.out.println();
	        }
	   }
           public static void main(String args[])   {
	    Scanner sc=null;
	    int n = 0;
	    sc=new Scanner(System.in);
	    System.out.print("Enter n value:");
	    n=sc.nextInt();
	    printStars(n);
	    //close the resources
	    sc.close();
	    }
	}

