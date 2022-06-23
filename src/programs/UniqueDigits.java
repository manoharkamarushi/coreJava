package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueDigits {

	public static void main(String[] args) {

		int numbers[] = { 2, 45, 2, 4, 5, 0, 1, 45 };

		Set<Integer> unique = new TreeSet<Integer>();

		for (int n : numbers)
			unique.add(n);

		for (Integer x : unique) {
			
			System.out.println(x);
			
			// removes duplicates and prints in sorted order

		}

	
	}
	

}


