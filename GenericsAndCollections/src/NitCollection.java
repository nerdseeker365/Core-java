
/*
 CUSTOM COLLECTION:
 
 1.size problem solved
 
 2.OPERATIONAL PROBLEM SOLVED
 
 */
public class NitCollection {
	
	private Object[] objArray=new Object[5];
	
	private int elementCount=0;
	
		public void add(Object obj) {
			
			if(size()==capacity()){
				
				increaseCapacity();
				
			}
			
			objArray[elementCount++]=obj;
		
		}
	
				public void increaseCapacity() {
		
					Object[] nextArray=new Object[capacity()*2];
		
						for(int i=0;i<objArray.length;i++) {
			
							nextArray[i]=objArray[i];
			
						}
		
						objArray=nextArray;
		 
				}
	public int capacity() {
		
		return objArray.length;
		
	}
	
		public int size() {
		
			return elementCount;
		
		}
	
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("[");
		
			for(int i=0;i<size();i++) {
				
				sb.append(objArray[i]);
				
				sb.append(",");
			
			
			}
			
		int start=sb.lastIndexOf(",");
		
			if(start!=-1) {
				
				sb.delete(start, start+2);
				
			}
			
		sb.append("]");
		
		return sb.toString();
		
	}

}
