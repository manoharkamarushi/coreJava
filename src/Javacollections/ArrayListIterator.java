package Javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		   ArrayList<String> arrl = new ArrayList<String>();
	        //adding elements to the end
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
            ListIterator<String> itr = arrl.listIterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	            ArrayList<String> arr11 = new ArrayList<String>();
		        //adding elements to the end
		        arrl.add("First");
		        arrl.add("Second");
		        arrl.add("Third");
		        arrl.add("Random");
	            ListIterator<String> itr1 = arr11.listIterator();
		        while(itr1.hasPrevious()){
		            System.out.println(itr1.next());
	            
	
	}

	}
}
