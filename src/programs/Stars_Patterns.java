package programs;

import org.testng.annotations.Test;

public class Stars_Patterns {

	@Test(enabled = false)
	public void f1() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "" + j);
			}
		}
		// here for i=1, j loop repeats 10 times
		// again for i=2 ,j loop repeats 10 times
	}

	@Test(enabled = false)
	public void f2() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; ++j) {
				System.out.println(i + "" + j);
			}

		}
		// for i=1, j=1
		// for i=2, j=again 1,2
		// for 1=3 j=again 1,2,3
	}

	@Test(enabled = true)
	public void apyramid() {
		int i, j, k;

		for (i = 1; i <= 5; i++) {

			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test(enabled = true)
	public void bhallow() {

		int height = 5;

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {

				if (i == 1 || i == height || j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

	@Test(enabled = true)
	public void cpyramid_1() {

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");

			}

			System.out.println("");
		}

	}

}
