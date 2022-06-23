package programs;

import java.util.Scanner;

public class String_rev_withoutAPI {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("enter a string:");
		String s=in.nextLine();
		System.out.println(s.length());
		
		String revs ="";
		
		for(int i=s.length()-1;i>=0;--i){
			revs+=s.charAt(i);
		}
		System.out.println(revs);
		
		if(revs.contentEquals(s)){
//     	if(revs.equals(s)){
		System.out.println("palindrome");
	}
	}
	
}
