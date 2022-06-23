package programs;

import java.util.Scanner;

public class NumberRverse {

	public static void main(String[] args) {
// number reverse
		
		Scanner in=new Scanner(System.in);
		System.out.println("given no:");
		
		String s=in.nextLine();
		int gno=Integer.parseInt(s);
		
		int rem,no=0,rev=0;
		while(gno!=0){
			
			rem=gno%10;  // 5
			rev=rev*10+rem;
			no=gno/10; //53
					
		}
		System.out.println(no);
		
		if(gno==rev){
			System.out.println("palindrome");
		}
	}

}
