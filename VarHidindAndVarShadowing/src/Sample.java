/*
 * Creating method level variable and class level variable with same name is called variable SHADOWWING
 */
public class Sample extends Example {
int x=30;//class level
int y=40;//x,y are sub class variables
void m2() {
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	System.out.println("x:"+super.x);
	System.out.println("y:"+super.x);
}
void m3() {
	int x=50;//method level
	int y=60;
	System.out.println("local x:"+x);
	System.out.println("local y:"+y);
	System.out.println("subclass x:"+this.x);
	System.out.println("sublcass y"+this.y);
	System.out.println("super class x:"+super.x);
	System.out.println("super class y"+super.y);
}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.m2();
		s.m3();
		s.m1();
	}

}
