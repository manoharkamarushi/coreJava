package programs;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInput_JAVA {

	public static void main(String[] args) throws IOException {
//		using console
		  Console console = System.console();
		  
	        if (console == null) {
	            System.out.println("No console: not in interactive mode!");
	            System.exit(0);
	        }
	 
	        System.out.print("Enter your username: ");
	        String username = console.readLine();
	         
	        System.out.print("Enter your password: ");
	        char[] password = console.readPassword();
	 
	        System.out.println("Thank you!");
	        System.out.println("Your username is: " + username);
	        System.out.println("Your password is: " + String.valueOf(password));
	 
	        // using Console with formatted prompt
	        String job = console.readLine("Enter your job: ");
	         
	        String passport = console.readLine("Enter your %d (th) passport number: ", 2);
	 
	        System.out.println("Your job is: " + job);
	        System.out.println("Your passport number is: " + passport);
//		---------------------------------------------------------------------------------
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		 
		String name = reader.readLine();
		System.out.println("Your name is: " + name);
//	-------------------------------------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your nationality: ");
		String nationality = scanner.nextLine();
		 
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
	}

}
