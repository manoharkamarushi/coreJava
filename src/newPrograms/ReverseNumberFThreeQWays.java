package newPrograms;

import org.testng.annotations.Test;

public class ReverseNumberFThreeQWays {

	@Test
	public void reverse1() {

		int n = 34389;
		int rev = 0, rem = 0;

		while (n != 0) {

			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		System.out.println(rev);

	}

	@Test
	public void reverse2() {
		
		StringBuffer sb= new StringBuffer(String.valueOf(78410));
		System.out.println(sb.reverse());
		
	}

	@Test
	public void reverse3() {
		
		StringBuilder sbd= new StringBuilder();
		sbd.append(741);
		System.out.println(sbd.reverse());
	}
}
