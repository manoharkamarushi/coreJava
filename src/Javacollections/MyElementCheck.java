package Javacollections;

import java.util.ArrayList;
import java.util.List;

public class MyElementCheck {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does ArrayList contains all list elements?: "
                    +arrl.containsAll(list));
        list.add("one");
        list.add("four");
        System.out.println("Does ArrayList contains all list elements?: "
                    +arrl.containsAll(list));

	}

}
