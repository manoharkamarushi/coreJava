package programs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class RemovingDuplicates {

	@Test(enabled = false) // only removing adjacent chars
	public void dupremove() {
		String s, ans = "";
		char ch1, ch2;
		int l, i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string:"); // Inputting the word
		s = sc.nextLine();

		l = s.length();
		s += " "; // *Adding extra space at the end because last character
					// is compared with something else index out of bound error.

		ch1 = s.charAt(0); // taking ch1 as first character

		while (i < l) {
			ans = ans + ch1; // adding each individual character to the answer
								// string or output string without repeated
								// characters

			while (ch1 == (ch2 = s.charAt(++i)) && i < l) {
			}
			ch1 = ch2; // **to store the previously last character in ch1
		}

		System.out.println("String after removing repeated characters : \n" + ans); // Printing
																					// the
																					// string
																					// without
																					// duplicate
																					// characters
	}

	@Test(enabled = false) // only removing adjacent chars
	public void removedup2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: "); // Inputting the word

		String str = sc.nextLine();
		String ourString = "";

		for (int i = 0; i < str.length(); i++) { // traversing all the characters

			if (i == 0) {
				ourString = "" + str.charAt(i);
			} else {

				if (str.charAt(i - 1) != str.charAt(i)) {
					ourString = ourString + str.charAt(i);
				}
			}
		}
		System.out.println(ourString);
	}

}
