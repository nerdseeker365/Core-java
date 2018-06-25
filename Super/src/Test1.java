//user class Test1
public class Test1 {
	static  void m5() {
		System.out.println("Test user class of m5 method");
	}
	static void m6() {
		System.out.println("Test user class of m6 method");
	}
	public static void amin(String[] args) {
		Sample2 s1=new  Sample2();
		Example1 e1=s1;
		e1.m1();
		e1.m2();
		s1.m3();//sub class m3 and m4 methods accessing
		s1.m4();
		//e1.m4();//here super class Reference variable not accessible sub class
		m5();//Test class m5 and m6 methods accessing 
		m6();
		
		
	}


}
