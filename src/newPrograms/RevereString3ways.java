package newPrograms;

import org.testng.annotations.Test;

public class RevereString3ways {

	@Test
	public void usingStringConcat() {
		String s = "JAVA";
		String rev = "";
		int l = s.length();

		for (int i = l - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		System.out.println(" rev: " + rev);
	}

	@Test
	public void usingCharArray() {
		String s = "JAVA";
		char a[] = s.toCharArray();
		int l = s.length();
		String rev = "";

		for (int i = l - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(" rev: " + rev);
	}
	
	@Test
	public void stringBufferReverseMethod() {
		
		StringBuffer sb= new StringBuffer("JAVA");
		System.out.println(" rev: " +sb.reverse());
	}
}
