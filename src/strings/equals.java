package strings;

public class equals {

	public equals(String string) {
	}

	public  static void main(String[] args){
		
//		equals s=new equals("ratan");
		String s=new String("ratan");
		System.out.println(s.equals("ratan")); //true

		String s1="anuk";
		String s2="anuk";
		String s10="anuk";
		s10="kishore";
		
		System.out.println(s10+"`````````");
		System.out.println(s10.length());
		System.out.println(s2.equals(s1)); //true
		
		StringBuffer sb=new StringBuffer("ratan");
		StringBuffer sb1=new StringBuffer("ratan");
		
		System.out.println("3."+sb.equals(sb1)); //false
		System.out.println("----");
		System.out.println(s.equals(s1));//false
		System.out.println(s1.compareToIgnoreCase(s2));//0
		System.out.println("Ratan".charAt(0));//r
		System.out.println(s1.length());//4
		
		int[] a=new int[1003];
		System.out.print(a.length);//1003
		
	}

	}
