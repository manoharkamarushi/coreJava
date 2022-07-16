package newPrograms;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RemoveJunkCharAndWhiteSpaces {

	@Test
	public void usingReplaceAll() {
		
		String str= "%$#My$%$ #Name@!##is~789 5278Joshith";
		
		str=str.replaceAll("[^a-zA-Z]", "");//replaceAll with nothing
		System.out.println(str);

	}

	@Test
	public void usingReplaceAlll() {
		
		String str= "My    name    is Joe";
		
		str=str.replaceAll("\\s", "");//replaceAll with nothing
		System.out.println(str);

	}

	@Test
	public void usingPatternMatcher() {
		
		String str= "%$#My$%$ #Name@!##is~789 5278Joshith";
		Pattern p = Pattern.compile("[a-zA-Z]",Pattern.CASE_INSENSITIVE);
		Matcher m= p.matcher(str);
		
		ArrayList<String> al= new ArrayList<>();

		while(m.find()) {
			al.add(m.group());
			
		}
		System.out.println(al);
	}
}
