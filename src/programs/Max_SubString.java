package programs;

import java.util.Scanner;

public class Max_SubString {

	public static void main(String[] args) {

//		String[] s=new String[];
		
		int maxl=0;
		String longsub="";
		
		Scanner snnr=new Scanner(System.in);
		System.out.println("Enter a sequence of strings:");
		String s=snnr.nextLine();
//		System.out.println(s);
		
		String a[]=s.split(" ");
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++){
			
			if(a[i].length()>maxl){
				
				maxl=a[i].length();
				longsub=a[i];
			}
			
		}
		System.out.println(longsub);
		
		
	}

}
