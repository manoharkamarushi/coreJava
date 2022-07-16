package programs;

import java.util.Scanner;

public class Fibnocci {

	// 0,1,1,2,3,5,8 ....

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter the array size:");
		int n = in.nextInt();

		int[] f = new int[n];

		f[0] = 0;
		f[1] = 1;
		System.out.println("array length::" + f.length);

		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 2] + f[i - 1];
		}

		for (int i = 0; i <= n - 1; i++)
			System.out.print(f[i] + ",");
	}

}