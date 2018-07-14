//open calculator program
import java.io.*;
 
class CalculatorOpen {
	
  public static void main(String[] args) {
	  
    Runtime rs = Runtime.getRuntime();
 
    try {
    	
      rs.exec("calC");
      
    }
    
    catch (IOException e) {
    	
      System.out.println(e);
      
    }  
    
  }
  
}