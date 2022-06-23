package Javacollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class propexam2 {

	public static void main(String[] args) {
	   Properties p1= new Properties();
	    Properties p=System.getProperties();  
	    Set set=p.entrySet();  
	      
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	    Map.Entry m=(Map.Entry)itr.next();  
	    System.out.println(m.getKey()+" = "+m.getValue());  
	    }  
	      
	    }  
	      
	}


