package newPrograms;

import org.testng.annotations.Test;

public class SumOfDigitsInNumber {
	
	@Test
	public void sum() {
		int n = 1230;
		// point is extract each number 
		int sum=0; // and add it to a variable sum
		
		while(n>0) {
		sum = sum + n%10; //last digit
		n=n/10;
		}
		
		
		System.out.println("Sum: "+sum);
	}

}
