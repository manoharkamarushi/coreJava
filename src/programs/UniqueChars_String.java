package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueChars_String {

	public static void main(String[] args) {
		
		String s[]={"mom","d","d","e","rushi","mom"};
	
		Set<String> unique=new TreeSet<String>();
		
		for(String s1:s)
		     unique.add(s1);
		
	   for(String s2:unique)
		     System.out.print(","+s2);
			
	}
	}	
	

