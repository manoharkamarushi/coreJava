package newPrograms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class ArraySort {
	
	@Test
	public void test() {
		
		Integer a[] = { 1, 21, 44, 22, 33 };
		
		Arrays.parallelSort(a);
		Arrays.sort(a);
		Arrays.sort(a,Collections.reverseOrder());// sorts in descending order
		//but a is primitive data type int a[];
		// change to Integer a[]
	}

}
