/*note:
 * 1.static v variables accessing directly its name.
 * 2.static variables accessing  class name.
 * 3.static variables accessing object name.
 * 4.static variables accessing null reference variable.
 * 
 * */
public class StaticAndNsv {
	
	static int a=10;
	static int b=20;
	int c=30;
	int d=40;
	public static void main(String[] args) {
		//StaticAndNsv s=null;
		//StaticAndNsv s2=null;
		//s=new StaticAndNsv();
		System.out.println(a);
		System.out.println(b);
		System.out.println(StaticAndNsv.a);
		System.out.println(StaticAndNsv.b);
		System.out.println(StaticAndNsv.a);
		System.out.println(StaticAndNsv.b);
		System.out.println(StaticAndNsv.a);
		System.out.println(StaticAndNsv.b);
		
		
	}

}
