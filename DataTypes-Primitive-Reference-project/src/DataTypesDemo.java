
public class DataTypesDemo {
	
	//primitive type variables creation
	
	int i=9;
	
	byte b=10;
	
	char ch='e';//array type variable creation
	
	double[] d= {1,2,3,4,5};
	{
		d[1]=10;
	}
	
	//double []d1 =new double[2];
	
	//double[] d2=new double[] {1,2,3,4};
	//predefined type class String variable creation
	
	String str="sankar";
	
	public int getI() {
		
		return i;
		
	}

	public void setI(int i) {
		
		this.i = i;
	}

	public byte getB() {
		
		return b;
	}

	public void setB(byte b) {
		
		this.b = b;
	}

	public char getCh() {
		
		return ch;
	}

	public void setCh(char ch) {
		
		this.ch = ch;
	}

	public double[] getD() {
		
		return d;
	}

	public void setD(double[] d) {
		
		this.d = d;
	}

	public String getStr() {
		
		return str;
	}

	public void setStr(String str) {
		
		this.str = str;
	}

	

	public static void main(String[] args) {
		
		//user defined class DataTypesDemo variable creation
		
		DataTypesDemo dt=new DataTypesDemo();
		
		System.out.println(dt.getI());
		
		System.out.println(dt.getCh());
		
		System.out.println(dt.getStr());
		
		System.out.println(dt.getD());
		 
		System.out.println(dt.d[1]);

	}

}
