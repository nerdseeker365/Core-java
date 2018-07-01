//class level
public class ClassLevel {
	
	int a;//integer variable creation or declaration note:declaration and initialization both are possible in one line.
	
	void m1() {}//method creation statement
	
	/*logic must be placed inside a method, not directly at class level ....
	 * 
	 * if we place logic at class level compiler throws error 
	 * 
	a=10;//Variable initialization not allowed in class level
	
	a=10+20//calculations not allowed in class level
	
	c.m1();//method calls not allowed in class level
	
	System.out.println();//data printing not allowed in class level
	
	if(true) {//not allowed at class level
		
	}
	while(true) {//not allowed class level
		
	}
	*/
	
	public static void main(String[] agrs) {
		ClassLevel c=new ClassLevel();
		System.out.println("Class level variable varification "+c.a);
	}

}
