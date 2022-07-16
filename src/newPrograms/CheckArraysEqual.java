package newPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class CheckArraysEqual {

	@Test
	public void test() {

		int a[] = { 1, 21, 44, 22, 33 };
		int b[] = { 1, 21, 44, 22 };

		boolean isEqual = Arrays.equals(a, b);
		System.out.println(isEqual);
	}

	@Test
	public void logic() {

		int a[] = { 1, 21, 44, 22 };
		int b[] = { 1, 21, 44, 22 };
		boolean status=false;
		
		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {
					if(a[i]==b[i]) {
						status=true;
					}
			}

		} else {
			System.out.println("Not equal");
		}
		
		if(status==true) {
			System.out.println("Equal");
		}
	}
}
