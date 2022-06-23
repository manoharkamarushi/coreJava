package programs;

import java.util.Arrays;

public class SecondHigh_Array {

	public static void main(String[] args) {
		
		int numbers[] = {6,3,37,12,46,5,64,21};
		int highest = 0;
		 int second_highest = 0;
		
		 Arrays.sort(numbers);
		 
		 for(int n:numbers)
		 System.out.print(n);
		 
		 System.out.println("length::"+numbers.length);
		
		 int sh=numbers.length-2;
		 System.out.println(numbers[numbers.length-1]);
		System.out.println("---------------");
		 for(int n:numbers){
		 		if(highest < n){
		 second_highest = highest;
		      highest =n;
		  } else if(second_highest < n){
		          second_highest = n;
		 }
		} 
		        System.out.println("First Max Number: "+highest);
		        System.out.println("Second Max Number: "+second_highest);

		 
		 }
	}


