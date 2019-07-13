package Com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Replace {
	public static void main(String args[]){  
		   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		      hm.put(100,"Amit");    
		      hm.put(101,"kunal");    
		      hm.put(102,"Vshal");   
		      System.out.println("Initial list of elements:");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		     System.out.println("Updated list of elements:");  
		     hm.replace(102, "Gaurav");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		     System.out.println("Updated list of elements:");  
		     hm.replace(101, "Vijay", "Ravi");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }   
		     System.out.println("Updated list of elements:");  
		     hm.replaceAll((k,v) -> "Komal");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		 }  


}
