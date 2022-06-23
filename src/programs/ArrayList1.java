package programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

@SuppressWarnings("unchecked")
public static void main(String args[]){
	
//	ArrayList1 al=new ArrayList1();
	@SuppressWarnings("rawtypes")
	ArrayList<Comparable> alist=new ArrayList();
	
	alist.add("12");
	alist.add("12");
	alist.add(13);
	alist.add("demo");
	
//	Iterator it=new Iterator();
	System.out.println(alist);
	
	ArrayList<String> arrl = new ArrayList<String>();
    //adding elements to the end
    arrl.add("First");
    arrl.add("Second");
    arrl.add("Third");
    arrl.add("Random");
    System.out.println(arrl);
    
    ListIterator<String> itr1 = arrl.listIterator();
    while(itr1.hasNext()){
        System.out.println(itr1.next());
}
    System.out.println("--------------");
    while(itr1.hasPrevious()){
    	System.out.println(itr1.previous());
    }
    System.out.println("no");
}}
