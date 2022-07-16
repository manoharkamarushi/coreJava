package newPrograms;

import org.testng.annotations.Test;

public class CountOccurrencesInString {
	
	@Test
	public void t() {
		
		String str="selenium java programminngg";
		int totalLength= str.length();
		int WithoutOccurrences= str.replaceAll("e", "").length();
		
		System.out.println(totalLength-WithoutOccurrences); 
	}

}
