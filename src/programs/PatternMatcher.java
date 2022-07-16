package programs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.BeforeTest;

public class PatternMatcher {

	public String s = "& testng_framew0rk_!@$";

	@Test(enabled = true)
	public void skipNumbers() {
		String s="my name123 is manohar";

		Pattern p = Pattern.compile("[^0-9]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		
		ArrayList<String> al = new ArrayList<String>();
		String rev="";
			
			while (m.find()) {
				al.add(m.group());
		}
			System.out.println(al);
			
		for(int i =al.size();i>=0;--i) {
			rev = rev + al.get(i);
			   
		}
		System.out.println("Rev:"+rev);
	}
	
	@Test(enabled = false)
	public void f() {
//	  any spl chars ?

		Pattern p = Pattern.compile("[^A-Za-z0-9]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);

		if (m.find()) {
			System.out.println("spl characters found");
		} else
			System.out.println("not found");
	}

	@Test(enabled = false)
	public void count() {
		int count = 0;
		for (int i = 0; i >= s.length(); i++) {

			char c = s.charAt(i);
			Pattern p = Pattern.compile("[^A-Z0-9a-z]", Pattern.CASE_INSENSITIVE);

			Matcher m = p.matcher(c + " ");

			if (m.find()) {
				System.out.println("found,count:" + count);
				count++;
			} else {
				System.out.println("not found");
			}

		}
	}

	@Test(enabled = false)
	public void separate() {
		String s1 = "manA558Sohar44";

		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();

		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(s1);

		Pattern p1 = Pattern.compile("[a-z A-Z]");
		Matcher m1 = p1.matcher(s1);

		while (m.find()) {
			al.add(m.group());
		}

		while (m1.find()) {
			a2.add(m1.group());
		}

		for (String s2 : al) {

			System.out.print(s2 + "");

		}
		System.out.println(" ");
		for (String s2 : a2) {

			System.out.print(s2 + "");

		}
	}

}
