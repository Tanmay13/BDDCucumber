package Com.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class AddElement {
	
	public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		      map.put(103,"Rahul");    
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		      //remove
		      map.remove(102);      
		      System.out.println("After invoking remove() method");  
		      for(Map.Entry m:map.entrySet())  
		      {  
		          System.out.println(m.getKey()+" "+m.getValue());      
		      }  
		 }  

}
