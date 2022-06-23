package programs;

public class unique_String {

	
	
	
	
	public static void main(String[] args) {

		String s="manohar";
//		s.concat("k");
		System.out.println(s);
		char[] c=s.toCharArray();
		
		for(char ch:c){
			if(s.indexOf(ch)==s.lastIndexOf(ch)){
// indexOf() returns the index of the first occurence of a character in a string
// lastIndexOf() returns the index of last occurence of a character in a string
				System.out.print(ch);
			}
			
		}
		
			
			
		}
		
	}


//}
