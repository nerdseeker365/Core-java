package com.nt.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	
	public static void main(String[] args) {
		
		ServerSocket ss=null;
		Socket s=null;
		OutputStream os=null;
		InputStream is=null;
		
		DataOutputStream dos=null;
		DataInputStream dis=null;
		
		String sendMsg=null;
		String receiveMsg=null;
		
		
		try {
			
			ss=new ServerSocket(6662);
			
			System.out.println("This is Online chatting done on JAVA");
			
			s=ss.accept();
			
			os=s.getOutputStream();
			
			is=s.getInputStream();
			
			dos=new DataOutputStream(os);
			
			dis=new DataInputStream(is);
			
			
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				
				receiveMsg=(String) dis.readUTF();
				
				System.out.println(receiveMsg);
				
				if(receiveMsg.equals("bye")) {
					
					break;
				}
				
				sendMsg=br.readLine();
				
				dos.writeUTF(sendMsg);
				
				
			}
			dis.close();
			
			dos.close();
			
			os.close();
			
			is.close();
			
			ss.close();
			
			s.close();
			
		}
		
		
		
		
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
