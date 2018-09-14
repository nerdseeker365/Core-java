package com.nt.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UPDServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		try {
			
			Date date;
			
			String strDate;
			
			DatagramSocket ds=null;
			
			ds=new DatagramSocket(4444);
			
			int i=0;
			
			
			
			while(true){
				
			
				
				date=new Date();
				
				strDate=date.toString();
				
				byte  dbyte[]=strDate.getBytes();
				
				InetAddress address=InetAddress.getByName("localhost");
				
				DatagramPacket packet=null;
	
				packet =new DatagramPacket(dbyte,dbyte.length,address,5555);
				
				ds.send(packet);
				
				System.out.println((++i)+"packet sent");
				
				Thread.sleep(1000);
				
				
				
			}
			
			
			
		}
		
		catch(Exception e) {
			System.out.println("Exception  "+e);
			
		}
	}

}
