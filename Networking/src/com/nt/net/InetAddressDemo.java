package com.nt.net;

import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) {
		
		try {
			
			InetAddress add=InetAddress.getLocalHost();
			
			System.out.println("\n LocalHost Details::"+add);
			
			System.out.println("\n The Host IP Address is ::"+add.getHostAddress());
			
			System.out.println("\n The Host name is ::"+add.getHostName());
			
		}
		catch(Exception e) {
			
			System.out.println("Excdeption e::"+e);
			
		}
		

	}

}
