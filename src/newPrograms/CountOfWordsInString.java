package newPrograms;

import org.testng.annotations.Test;

public class CountOfWordsInString {

	@Test
	public void c() {
		String s = "welcome to java prog lang";
		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)== ' ') && (s.charAt(i + 1) != ' ')) {

				count++;
			}
		}
System.out.println(count);
	}

}
