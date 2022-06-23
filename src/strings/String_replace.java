package strings;

public class String_replace {

	public static void main(String[] args){
		
		String s=new String("manohar");
		String s1="kamarushi";
//		System.out.println(s1.concat(s));
		//System.out.println(s1.concat("kamarushi"));
//		System.out.println(s+s1);
		
String repeated = new String(new char[5]).replace("/0","manohar");
String repeated1 = String.format(String.format("%%%ds", 4), " ").replace(" ","manu");

//	System.out.println(repeated);
	System.out.println(repeated1);
	}
}
