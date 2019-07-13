package Com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapBook {
	
		
		public static void main(String[] args) {
			
			Map<Integer,Book>B=new HashMap<Integer,Book>();
		Book b1=new Book(101,"Three Mistake of My Life","Chetan Bhagat","tatMGgr");
		Book b2=new Book(103,"SUryaputra Karnaa","Shivaji samat","SonyTV");
		Book b3=new Book(105,"Revolution T20","Chetan Bhagat","tatMGgr");
		Book b4=new Book(104,"One Night at call center","Chetan Bhagat","tatMGgr");
		Book b5=new Book(102,"Bounce Back","Dr.Vivek Bindra","3 Star Publicstions");
		
			
		B.put(101, b1);
		B.put(102, b5);
		B.put(103, b2);
		B.put(104, b4);
		B.put(105, b5);
		
		
		for(Map.Entry<Integer,Book> M:B.entrySet())
		{
			System.out.println(M.getKey()+""+M.getValue());
			
			 int key=M.getKey();  
		        Book b=M.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
			
		}
		}
		
	

	}


