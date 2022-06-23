package Javacollections;
import java.util.HashSet;
import java.util.Iterator;


public class Haashsetexam {

	public static void main(String[] args) {
	     
	       
	      HashSet<String> al=new HashSet<String>();  
	      al.add("Raju");  
	      al.add("Vijay");  
	      al.add("Raju");  
	      al.add("Ajay");  
	      
	      Iterator<String> itr=al.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      }  
	     }  
	      
	}


