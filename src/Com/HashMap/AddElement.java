package Com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AddElement {
	
	public static void main(String[] args) {
		
		HashMap <Integer,String>m=new HashMap<Integer,String>();
		m.put(1, "Selenium");
		m.put(2, "Java");
		m.put(3, "Haddop");
		m.put(4, "DBA");
		m.put(5,"AngularJS5");
		System.out.println("The hash a map is "+m);
		
		for(Map.Entry M:m.entrySet())
		{
			
			
			  System.out.println(M.getKey()+" "+M.getValue());  
		}
		m.putIfAbsent(6, "ruby");
	      System.out.println("After invoking putIfAbsent() method ");
	      
	      for(Map.Entry M1:m.entrySet())
			{
				
				
				  System.out.println(M1.getKey()+" "+M1.getValue());  
			}
	      
	      
		HashMap<Integer,String>Map=new HashMap<Integer,String>();
		Map.put(12, "CJC");
		Map.putAll(m);
		System.out.println("After invoking putAll() method ");  
		
		
		
		for(Map.Entry M2:Map.entrySet())
		{
			
			System.out.println(M2.getKey()+" "+M2.getValue()); 
		}
	}

}
