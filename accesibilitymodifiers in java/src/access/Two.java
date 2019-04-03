package access;//package name

public class Two {

    
    public static void main(String args[]) {
		
		One o=new One();
		
		//System.out.println(o.a);// error because of private variable not allowed to access another class
		System.out.println(o.b);
		System.out.println(o.c);
		System.out.println(o.d);
}
}
