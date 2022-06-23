package Javacollections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListSublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Click");
        System.out.println("Actual ArrayList:"+arrl);
        List<String> list = arrl.subList(2, 5);
        System.out.println("Sub List: "+list);


	}

}
