package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("manoh");
		al.add("mano");
		al.add("monk");
		al.add("rupa");
		al.add("sai");
		al.add("sai");

		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(al);
		
		System.out.println(al);
		
		Iterator<String> it1 = al.iterator();
		System.out.println("---------");
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
