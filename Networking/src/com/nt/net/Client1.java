package com.nt.net;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			
			Socket s=null;
			InputStream in=null;
			DataInputStream dis=null;
			String message=null;
			
			
			s=new Socket("localhost",4444);
			
			in=s.getInputStream();
			
			dis=new DataInputStream(in);
			
			message=dis.readLine();
			
			System.out.println("Server message is::"+message);
			
			dis.close();
			
			s.close();
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception ::"+e);
			
		
		}
		

	}

}
