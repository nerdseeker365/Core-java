package access;//package name

public class One {
	
	private int a=10;// private variable access only within class
	
	int b=20;// package level or default variable accessing within package only
	
	static  protected int c=30; //protected variable accessing within package and outside of the
	//package but use extends superclass and create object of  subclass ,if
	//static variable accessing using same class name or super class name
	
	public int d=40;//public variable accessing from all classes of project.
	
    public static void main(String args[]) {
		
		One o=new One();
		
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(o.c);
		System.out.println(o.d);
	}

}
