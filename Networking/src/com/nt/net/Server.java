package com.nt.net;


import java.io.DataOutputStream;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
	public static void main(String[] args) {
		try {
			
			
			ServerSocket ss=null;
			
			Socket s=null;
			
			OutputStream out=null;
			
			DataOutputStream dos=null;
			
			ss=new ServerSocket(4444);
			
			
			System.out.println("Server is Ready....");
			
			
			s=ss.accept();
			
			System.out.println("Connection is Accepted....");
			
			System.out.println("Sent a message to client....");
			out=s.getOutputStream();
			dos=new DataOutputStream(out);
			
			dos.writeBytes("Hello");
			
			dos.close();
			s.close();
			ss.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception ::"+e);
			
		
		}
		

	}

}
