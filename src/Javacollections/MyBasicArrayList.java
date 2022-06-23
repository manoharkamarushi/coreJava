package Javacollections;

import java.util.ArrayList;



public class MyBasicArrayList {

	public static void main(String[] args)
	{
		
		 ArrayList<String>a1 = new ArrayList<String>();
	        //add elements to the ArrayList
		 
	        a1.add("JAVA");
	        a1.add("C++");
	        a1.add("PERL");
	        a1.add("PHP");
	        System.out.println(a1);
	        //get elements by index
	        System.out.println("Element at index 1: "+a1.get(1));
	        System.out.println("Does list contains JAVA? "+a1.contains("JAVA"));
	        System.out.println("Index of PERL is "+a1.indexOf("PERL"));
	        //add elements at a specific index
	        a1.add(2,"PLAY");
	        System.out.println(a1);
	        System.out.println("Is arraylist empty? "+a1.isEmpty());
	        System.out.println("Index of PERL is "+a1.indexOf("PERL"));
	        System.out.println("Size of the arraylist is: "+a1.size());
	
		

	}

}
