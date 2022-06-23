package programs;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		System.out.print("Please Enter a String:");
		
		 String s=in.nextLine();
		 String rev="";
		 
		 for(int i=(s.length()-1);i>=0;--i){
//			 System.out.print(s.charAt(i));
			 rev=rev+s.charAt(i);
		 }
		System.out.println(rev);
	}

}
