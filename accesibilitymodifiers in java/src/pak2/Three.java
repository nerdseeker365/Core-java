package pak2;
import access.One;

public class Three extends One {


    public static void main(String args[]) {
		
		One o=new One();
		Three t=new Three();
		
		//System.out.println(o.a);// error because of private variable not allowed to access another class
		//System.out.println(o.b);//package level or default variable not allowed to access another package 
		System.out.println(Three.c);
		//System.out.println(One.c);
		//System.out.println(t.c);
		System.out.println(o.d);
}
}
