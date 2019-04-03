import access.One;

public class Four  {
	public static void main(String args[]) {
		
		One o=new One();
		       //System.out.println(o.a);// error because of private variable not allowed to access another class
				//System.out.println(o.b);
				//System.out.println(Four.c);//error because of not extending 
				System.out.println(o.d);//public variable is accessible any where in the project
	}

}
