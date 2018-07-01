
public abstract class MethodTerninology {
	public  abstract void m1();//this is technically called abstract method
	
 public static	void add(int a ,int b) //this method is called concrete method ,void m2(int a); is called METHOD PROTOTYPE
	
	//method name+argument list is called method signature.	
	
	{//{} is called method body
		
		int c=a+b;
		System.out.println("Result: "+c);//method logic 
		
	}
	public  static int m2() {// int is return type must return a value......void is return type not return any value.
		return 0;
		
	}
	 
	

	public static void main(String[] args) {
		
		add(10,20);//arguments 

	}

}
