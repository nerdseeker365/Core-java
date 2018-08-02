//collection object creation adding objects to collection without type problem

/*
 CUSTOM COLLECTION:
 
 1.size problem solved
 
 2.OPERATIONAL PROBLEM SOLVED
 
 */
public class Test {

	public static void main(String[] args) {
		
		NitCollection col=new NitCollection();
		
		col.add(new Student());
		col.add(new Student());
		col.add(new Student());
		col.add(new Bike());
		col.add(new Employee());
		
		System.out.println(col+"\n");
		
		col.add(new Employee());
		
		System.out.println(col);//adding more objects beyond collection (obj[]) capacity ....we don't get AOOBE ......

	}
}
