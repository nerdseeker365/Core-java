import java.util.Scanner;
public class Factorial {
	 
		 public static void main(String args[]){  
			 Scanner sc=null;
			 sc=new Scanner(System.in);
		  int i,fact=1;  
		  int number=0;//It is the number to calculate factorial   
		  System.out.print("Enter the Number: ");
		  number=sc.nextInt();
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact); 
		  //close the resources
		  sc.close();
		 }  
		}  

