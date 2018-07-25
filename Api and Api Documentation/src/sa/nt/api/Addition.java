package sa.nt.api;
import java.util.Scanner;

/**
API AND API DOCUMENTATION:
Q) HOW ONE PROGRAMMER DEVELOPED CLASS AND ITS MEMBERS DETAILS ARE KNOWN TO OTHER PROGRAMMER?

a) To get the information of other programmer given classes we will take the help of a special file called API documentation . 


note: class must be public 

WHAT IS API?

	API stands for Application Programming Interface.

	A class using which we develop other classes is called API.

	In simple terms we can say API is nothing but a reusable class. 

	The class that is reused for developing a new class is called API.

	This new class can again be reused for developing other classes.

	.class files is called API

	API  is group of .class files is called API.

	API documentation is available in .html file 

	api documentation creation:



	javadoc -d . Addition.java

	API documentation comment:/**  */


/**this is my package*/
/**after executing this program result....note: i am passing values ,you pass different values you get different result
this is addition program
Enter a value:
10
Enter b value:
20
sum of :30

*/
public class  Addition
{
	/**
	this class name is Addition .
	a and b are variables  initialized with zero.
	 sum is storing in result variable*/

	public static void main(String[] args) 
	{
		Scanner sc=null;
		sc=new Scanner(System.in);
		/**
		here Scanner variable is created and initialized with null and 
		Scanner object is created
		a and b are integer variables and result also integer variable.
		*/
		int a=0;
		int b=0;
		int result=0;
		/**
		here three variables are takes two are reading  values  and 
		one are storing result and 
		reading values from keyword using Scanner object.
		*/
		System.out.println("this is addition program ");
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		result=a+b;
		System.out.println("sum of :"+result);
		sc.close();
	}
	
}
/**
CMD:

Compilation:javac -d . Addition.java

above line javac space -d space dot space classname space extention.

Run:java sa.nt.api.Addition

above sa.nt.api is a ....i am created package name.
"." represents current working Directory.
*/
