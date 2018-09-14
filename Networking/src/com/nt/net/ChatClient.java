package com.nt.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		
		Socket s=null;
		OutputStream os=null;
		InputStream is=null;
		DataOutputStream dos=null;
		DataInputStream dis=null;
		
		String sendMsg=null;
		String receiveMsg=null;
		
		try {
			
			s=new Socket("localhost",6662);
			os=s.getOutputStream();
			is=s.getInputStream();
			dos=new DataOutputStream(os);
			dis=new DataInputStream(is);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("start now chat");
			
			while(true) {
				
				sendMsg=br.readLine();
				
				dos.writeUTF(sendMsg);
				
				receiveMsg=(String)dis.readUTF();
				
				System.out.println(receiveMsg);
				
				if(receiveMsg.equals("bye")) {
					
					break;
				}
				
			}
			dis.close();
			dos.close();
			os.close();
			is.close();
			s.close();
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
