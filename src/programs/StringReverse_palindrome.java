package programs;

import java.util.Scanner;

public class StringReverse_palindrome {

	public static void main(String[] args) {

	Scanner in=new Scanner(System.in);
	System.out.println("enter a string::");
	String s=in.nextLine();
	
//	in.close();
	StringBuffer s1=new StringBuffer(s);	
	StringBuffer s2=new StringBuffer(s1);

	String s3=s2.reverse().toString();
//    s2.reverse();
    
//    if(String.valueOf(s1).contentEquals(String.valueOf(s2))){
//  if(s.equals(s3)){
  if(s.contentEquals(s3)){ 
//    if(s==s3){ not working
	System.out.println("pallindrome");
    }else{
    	System.out.println("not a palindrome");
    }
		
	}

	
}
