
public class Floating_Point_Type {
	
	private float a=1.0f;
	
	public float getA() {
		
		return a;
	}

	public void setA(float a) {
		
		this.a = a;
	}

	public double getB() {
		
		return b;
	}

	public void setB(double b) {
		
		this.b = b;
	}

	private double b=2.0;

	public static void main(String[] args) {
		
		 Floating_Point_Type fp=new  Floating_Point_Type();
		 
		System.out.println(fp.getA());
		
		System.out.println(fp.getB());
		
	}//main method

}//class
