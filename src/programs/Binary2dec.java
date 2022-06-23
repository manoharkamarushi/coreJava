package programs;

import java.util.Scanner;

public class Binary2dec {

public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);

System.out.println("Enter bin number:");
String bin=input.nextLine();

System.out.println("decimal no:"+Integer.parseInt(bin,2));
input.close();
	}

}
