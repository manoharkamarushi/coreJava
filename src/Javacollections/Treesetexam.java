package Javacollections;
import java.util.Iterator;
import java.util.TreeSet;


public class Treesetexam {

	public static void main(String[] args) {
		 
		   
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		
	}


