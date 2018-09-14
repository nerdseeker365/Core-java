

import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class FileURLDemo {

	public static void main(String[] args) {
		
		
		try{
			
			File file=new File("URLDemo.java");
			
			String filePath="file:E:/java/eclipse java/Networking/src/"+file.getPath();
			
			URL fileURL =new URL(filePath);
			
			InputStream in=fileURL.openStream();
			
			int data;
			
			while((data=in.read()) !=-1) {
				
				System.out.println((char)data); 
				
			}
			
			in.close();
			
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception ::"+e);
			
		}

	}

}
