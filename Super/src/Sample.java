
public  class Sample extends Example{

	public Sample() {
		//super();//compiler automatically places the zero parameter constructor
		System.out.print(super.b);
		System.out.println("Sample zero-parameter");
	}

	public Sample(int a) {
		super(10);//programmer explicitly  pass int argument
				
		System.out.println("Sample one-parameter");
	}
	
	
	public static void main(String[] args) {
		//Sample s=new Sample();
		//Sample s1=new Sample(10);
		 
	}

}
