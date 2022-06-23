package programs;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Please Enter a number");
		 number=in.nextInt(); 
		 
		int sum=0 ;
		 while(number!=0){
		 
	     sum=sum+(number%10);
		 number=number/10;
		
//		 System.out.println(sum+""+number);
		}
		
		System.out.println("Sum of Digits ="+sum);
	}

}
