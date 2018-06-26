/*note:
 * 1.non static variables accessing this keyword using.
 * 2.non static variables accessing using object.
 * */
public class Test extends StaticAndNsv {

	public static void main(String[] args) {
		System.out.println(StaticAndNsv.a);
		System.out.println(StaticAndNsv.b);
		//System.out.println(StaticAndNsv.c);non static variables not possible to access with class name,solution object create
		//System.out.println(StaticAndNsv.d);
		StaticAndNsv t1=null;
		t1=new StaticAndNsv();
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t1.d);
	}
	void m1() {
		System.out.println(this.c);
		System.out.println(this.d);
		
		
		
		
	}	

}
