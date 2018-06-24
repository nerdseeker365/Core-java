

/** a setter is a method that updates and  initializing  value of a variable.
  *  And a getter is a method that reads and returning  value of a variable.
  *  Getter and setter are also known as accessor and mutator in Java*/

public class SetGetM {
	       private int a=50;
	void setterA(int b){/** setter method is used to initializing and modifying variable values.
							should me parameterized  method,it should be parameter name and
	 						 it should be void method */
		   this.a=b;
		  System.out.println("hello: "+a);
    }
	int getterA() {/** reading and returning value or object*/
		 
		  return this.a;
	}
	public static void main(String[] args) {
		SetGetM s1=new SetGetM();
		 		s1.getterA();
		 		System.out.println(s1.a);
		 		s1.setterA(40);
		 		System.out.println(s1.a);
			}
}
