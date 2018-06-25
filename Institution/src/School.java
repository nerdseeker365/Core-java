//school.java
public class School {
	int stNo;
	String stName;
	String stAddress;
	int stFee;
	int telugu;
	int english;
	int social;
	int hindi;
	int ns;
	int maths;
		
	
public void marks() {
	int total;
	total=telugu+english+social+hindi+ns+maths;
	System.out.println(+total);
}
public void display() {
	System.out.println(" student NO= "+stNo);
	System.out.println(" student Name= "+stName);
	System.out.println(" student Address= "+stAddress);
	System.out.println(" student Fee= "+stFee);
	
	
	
}

}
