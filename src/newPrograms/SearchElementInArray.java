package newPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SearchElementInArray {

	@Test
	public void linearSearch() {

		int a[] = { 90, 3, 5, 9 };
		int searchEle = 15;
		boolean isfound = false;

		for (int i = 0; i < a.length; i++) {

			if (searchEle == a[i]) {
				isfound = true;
			}
		}
		if (isfound) {
			System.out.println("Elementfound");
		} else {
			System.out.println("Not found");
		}
	}

	@Test
	public void usingBinarySearch() {

		// precondition: should in sorted order

		// it divides the array into 2 parts
		// if required key value is greater than midvalue
		// lower bound
		// upper bound

		int a[] = { 90, 3, 5, 9, 121, 232, 1 };
		Arrays.sort(a);
		int keyvalue = 100;
		int lbound = 0;
		int hbound = a.length - 1;
		boolean isFound=false;

		while (lbound <= hbound) {

			int midValue = (lbound + hbound) / 2;
			if (a[midValue] == keyvalue) {
				System.out.println("Element found");
				isFound=true;
				break;
			}
			if (a[midValue] < keyvalue) {
				lbound = midValue + 1;
			}
			if (a[midValue] > keyvalue) {
				hbound = midValue - 1;
			}
		}
		
		if(isFound==false) {
			System.out.println("element not found");
		}
	}
}
