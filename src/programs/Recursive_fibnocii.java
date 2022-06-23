package programs;

public class Recursive_fibnocii {

	public static void main(String[] ag) {

		Recursive_fibnocii rf = new Recursive_fibnocii();
		rf.fib(0, 1);

	}

	public void fib(int n1, int n2) {
		int sum = 0;

		if (n1 == 0) {
			System.out.println(n1 + "," + n2);
		}
		sum = n1 + n2;
		if (sum <= 10) {
			System.out.println(sum);
			n1 = n2;
			n2 = sum;

		}
		
		fib(n1, n2);
	}

}
