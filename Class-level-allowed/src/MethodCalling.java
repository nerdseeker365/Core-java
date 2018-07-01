
public class MethodCalling {
	//Sending cursor to a method body to execute its logic is called as method INVOCATION and CALLING.
		static void m1() {//method definition
			System.out.println("m1");
		}
		static void  m2() {//method definition
			System.out.println("m2");
		}
	public static void main(String[] args) {
		System.out.println("Method Execution");
		m1();//method calling
		
		m2();//method calling
		

	}

}
