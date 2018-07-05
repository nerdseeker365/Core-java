
public class Non_Numeric_Type {
	
	private char a='i';
	
	private char a1=' ';

	private String b="sankar";//note Predefined class String type variable creation
	
	private String b1=" ";
	
	private boolean c=true;

	
	public char getA() {
		
		return a;
		
	}

	public void setA(char a) {
		
		this.a = a;
		
	}

	public String getB() {
		
		return b;
		
	}

	public void setB(String b) {
		
		this.b = b;
		
	}

	public boolean isC() {
		
		return c;
		
	}

	

	public static void main(String[] args) {
		
		Non_Numeric_Type nn=new Non_Numeric_Type();
		
		System.out.println(nn.getA());
		
		System.out.println(nn.getB());
		
		System.out.println(nn.c);
		
	}//main method

}//class 
