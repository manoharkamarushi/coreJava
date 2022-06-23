package Javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static <E> void main(String[] args){
		
	ArrayList al=new ArrayList(); // non generic
	
	ArrayList<String> als=new ArrayList<String>();
	
	als.add("s1");
	als.add("s2");
	
	
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("s3");
	al2.add("s4");
	
	als.addAll(al2);
	
	
	for(int i=0;i<als.size();i++){
		
		System.out.println(als.get(i));
	}

// methods
	als.add("");
	als.addAll(al2);
	als.removeAll(al2);
	als.removeAll(als); // removes his own elements
	als.retainAll(al2); // gets only the common elements
	
	
	Employee emp=new Employee("Naveen", 23, "QA");
	
	ArrayList<Employee> ale=new ArrayList<Employee>();
									ale.add(emp);
		
	//iterate all the values present in that class object
	
	Iterator<Employee>it=ale.iterator();
	
	while(it.hasNext()){
		
		Employee alc=it.next();
		System.out.println("-------------------");
		System.out.println(alc.sname);
		System.out.println(alc.age);
		System.out.println(alc.dname);
		
	}
	for (String s: al2){
		
		System.out.println("****"+s);
	}
	}
}