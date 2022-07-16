package programs;

public class ReverseOnlyString {

	public static void main(String a[]) {

		String s="my name123is manohar";
		char[] ch = new char[s.length()];
		
		String a1[]=s.split("123");
		
			System.out.println(a1.length);
			
			for(String l:a1) {
				System.out.print(l);
			}
	
			for (int i=a1.length;i>=0;--i) {
				
				ch[i]=s.charAt(i);
			}
	}
}
