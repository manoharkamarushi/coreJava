package Javacollections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propexam3 {

	public static void main(String[] args) throws IOException {
	     
	     
	    Properties p=new Properties();  
	    Properties p1=new Properties();
	  
	    p.setProperty("name","dheeraselenium");  
	    p.setProperty("email","dheeraselenium@gmail.com");  
	    
	    p.store(new FileWriter("D:\\info.properties"),"Mindq Properties Example");  
	      
	    }  
	    
	}


