package Javacollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapex {

	public static void main(String[] args) {
	     
	       
	      HashMap<Integer,String> hm=new HashMap<Integer,String>();  
	      
	      hm.put(99,"Amit");  
	      hm.put(80,"Vijay");  
	      hm.put(104,"Rahul");  
	      
	      /*for(Map.Entry m:hm.entrySet()){  
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }  
	      */
	      
	    //  System.out.println(hm.get(99));
	      
	      for(Map.Entry m: hm.entrySet()){
	    	  
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      
	      HashMap<Integer, Employee> hm1=new HashMap<Integer, Employee>();
	      
	      Employee e4=new Employee("sarika", 23, "QA");
	      Employee e5=new Employee("Bhim", 23, "Admin");
	      Employee e6=new Employee("vineet", 26, "Dev");
	      
	      hm1.put(1,e4);
	      hm1.put(2,e5);
	      hm1.put(3,e6);
	      
	      System.out.println("*********************");
	      
	       for(Map.Entry<Integer, Employee> m1: hm1.entrySet()){
	    	   
	    	   int empid=m1.getKey();
	    	   Employee e9=m1.getValue();
	    	   
	    	   System.out.println("Employee id "+empid+" info:");
	    	   System.out.println(e9.sname+" "+e9.age+" "+e9.dname);
	    	   
	       }
	     }  
	     
	}


