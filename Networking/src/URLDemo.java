

import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		
		
		try{
			
			
			URL u=new URL("http://system1:1024/NetDemo2.java");
			
			System.out.println("\n PROTOCOL::"+u.getProtocol());
			
			System.out.println("\n HOST::"+u.getHost());
			
			System.out.println("\n PORT::"+u.getPort());
			
			System.out.println("\n FILE"+u.getFile());
			
			System.out.println("\n PATH"+u.toExternalForm());
			
		}
		
		catch(Exception e) {
			
		System.out.println("Exception ::"+e); 	
		
		}

	}

}
