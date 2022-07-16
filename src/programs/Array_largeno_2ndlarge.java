package programs;

public class Array_largeno_2ndlarge {

	public static void main(String[] args) {

		// int[] a=new int[10]; 1 2 12 65 545 789

		int numbers[] = { 12, 545, 789, 1, 2, 65 };

		int h = 0;
		int sh = 0;
		for (int n : numbers) {

			if (n > h) {

				sh = h;
				h = n;
			} // for second highest

			else if (n > sh) {

				sh = n;
			}
		}

		System.out.println(h);
		System.out.println(sh);
	}

}
