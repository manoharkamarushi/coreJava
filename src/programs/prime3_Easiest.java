package programs;

public class prime3_Easiest {

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {

			boolean isprime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			
			if (isprime)
				System.out.print(" " + i);
		}

	}

}
