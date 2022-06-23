package Javacollections;
import java.util.Iterator;
import java.util.LinkedList;



public class Linkedlistexam1 {

	public static void main(String[] args) {
	   	       
	      LinkedList<String> al=new LinkedList<String>();  
	      al.add("vivek");  
	      al.add("Vijay");  
	      al.add("Arya");  
	      al.add("Ajay"); 
	     Iterator<String> itr=al.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      }  
	     }  
	     
	}


