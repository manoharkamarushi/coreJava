package newPrograms;

import org.testng.annotations.Test;

public class SwapFourWays{
	int a=10,b=20,c; 

	@Test
	public void swap1() {
		int a=10,b=20,c; 
		// using 3rd variable
		  c=b;
		  b=a;
		  a=c;
		  System.out.println("a="+a+" b="+b);
	}
	
	@Test
	public void swap2() {
		int a=10,b=20; 
		// without using 3rd variable so +, - 
		a=a+b;
		b=a-b;
		a=a-b;
		 System.out.println("a="+a+" b="+b);
		
	}
	@Test
	public void swap3() {
		int a=10,b=20; 
		// without using 3rd variable and not using +,- so use *,/ operators
		// here a,b should not be zero
		a=a*b;
		b=a/b;
		a=a/b;
		 System.out.println("a="+a+" b="+b);
		
	}
	@Test
	public void swap4() {
		int a=10,b=20; 
		// without using 3rd variable 
	  b=a+b-(a=b);
		 System.out.println("a="+a+" b="+b);
		
	}
	
	// one more using bitwise XOR operator - IDK so leave it
}
