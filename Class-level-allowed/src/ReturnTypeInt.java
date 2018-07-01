
public class ReturnTypeInt {
	int a=10;//variable declaration and initialization
	
	int b=m1();//variable initialization ,note void methods not allowed here
	
		 int m1() {
			
			//return a;//return value allowed in non-void methods...
			
			return 'a';//97
			
			//return 10.00;// not allowed double value .....because of return type is int.
			//return true;// not allowed boolean value .....because of return type is int.
		}
		 void m2() {
			System.out.println("return allowed in void method not pass variable and value");
			return;
		}
	public static void main(String[] args) {
		
		 ReturnTypeInt rti=new  ReturnTypeInt();//object creation 
		 
		 	rti.m1();//method calling
		 	
		 	//m1();//non-static methods are not called directly
		 	
		 	System.out.println("a value is: "+rti.m1());//data printing ,note void methods not allowed here.
		 	System.out.println("b value:"+rti.b);
	}

}
