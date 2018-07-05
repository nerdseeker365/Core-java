
public class Numeric_Type {//numeric data types byte,short,int,long
	
	private	 byte a=1;
	
    private	 short b=2;
	
	private	 int c=3;
	
	private long d=4;

	
	public byte getA() {
		
		return a;
	}

	public void setA(byte a) {
		
		this.a = a;
	}

	public short getB() {
		
		return b;
	}

	public void setB(short b) {
		
		this.b = b;
	}

	public int getC() {
		
		return c;
	}

	public void setC(int c) {
		
		this.c = c;
	}

	public long getD() {
		
		return d;
	}

	public void setD(long d) {
		
		this.d = d;
	}

		
	public static void main(String[] args) {
		
		Numeric_Type nc=new Numeric_Type();
		
		System.out.println(	nc.getA());
		
		System.out.println(	nc.getB());
		
		System.out.println(	nc.getC());
		
		System.out.println(	nc.getD());
		
	}//main method

}//class
