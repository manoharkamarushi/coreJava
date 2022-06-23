package programs;

import java.util.Scanner;

public class StringTraversal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		System.out.print("Please Enter a String:");
		String s=in.nextLine();
		 System.out.println(s.length());
		 
	 for(int i=0;i<=(s.length()-1);i++){
		 System.out.println(s.charAt(i));
	 }
		
	}

}
