package programs_ForLoop;

import java.util.HashSet;

import org.testng.annotations.Test;

public class ForLoopPrograms {
	@Test(enabled = false)
	public void Reverse_String() {

		String s = "Java";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}

	@Test(enabled = true)
	public void RemoveDuplicateLettersString() {

		String s = "Java";
		char c[] = s.toCharArray();
		String dup = "";

		HashSet<Character> nodup = new HashSet<Character>();

		for (int i = 0; i < c.length; i++) {

			nodup.add(c[i]);
		}

		for (char n : nodup) {
			System.out.println(nodup);
		}

	}

	@Test
	public void removedupString() {

		String s = "javaprogram";
		char c[] = s.toCharArray();

	}

}
