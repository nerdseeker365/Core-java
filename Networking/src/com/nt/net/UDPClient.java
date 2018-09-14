package com.nt.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			
			String strDate;
			
			DatagramSocket ds=null;
			
			ds=new DatagramSocket(5555);
			
			byte rdata[] =new byte[64];
			
			DatagramPacket packet=null;
			
			packet=new DatagramPacket(rdata, rdata.length);
			
			while(true) {
				
				ds.receive(packet);
				
				strDate=new String(packet.getData());
				
				System.out.println("Server date And Time is::"+strDate);
			}
			
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception:: "+e); 
			
		}

	}

}
