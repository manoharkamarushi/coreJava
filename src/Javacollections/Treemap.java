package Javacollections;
import java.util.Map;
import java.util.TreeMap;


public class Treemap {

	public static void main(String[] args) {
	     
	       
	      TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
	      
	      hm.put(100,"Amit");  
	      hm.put(102,"Aditya");  
	      hm.put(101,"Vijay");  
	      hm.put(103,"Rahul");  
	      
	      for(Map.Entry m:hm.entrySet()){  
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }  
	     }  
	     
	}


