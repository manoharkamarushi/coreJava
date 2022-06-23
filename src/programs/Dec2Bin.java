package programs;

import java.util.Scanner;

public class Dec2Bin {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a decimal no:");
		
		int dec=input.nextInt();
		
//		String dec=input.nextLine();
		System.out.println("binary no for "+dec+"::"
				+ ""+Integer.toBinaryString(dec));
		
		
	}

}
