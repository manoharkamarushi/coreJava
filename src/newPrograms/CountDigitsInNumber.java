package newPrograms;

import org.testng.annotations.Test;

public class CountDigitsInNumber {
	
	// for any number if you do
	// % returns remainder means last digit of the number
	// / returns front part other than last digit

	@Test
	public void f() {
		int count = 0;
		int n = 98865;

		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("count: " + count);
	}

	@Test
	public void countEvenAndOddDigits() {

		int even=0, odd=0;
		int n = 98865;
		int rem;
		
		while(n>0) {
			
			rem = n%10;
			if(rem%2==0) {
				even++;
			}else {
				
				odd++;
			}
			n=n/10;
		}
		System.out.println("Even: "+even+" Odd: "+odd);

	}
}
