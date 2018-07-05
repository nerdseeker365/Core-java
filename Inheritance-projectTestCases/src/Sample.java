
public class Sample extends Example {//sub class 
/*HOW CAN WE ACCESS SUPER CLASS MEMBERS FROM SUB CLASS?
  We can access static members directly by name or by using sub class name.
	We can access non-static members by using subclass object..*/
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Sample.a);
		Sample s=new Sample();
		System.out.println(s.b);
	}

}
