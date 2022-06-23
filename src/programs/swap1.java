package programs;

public class swap1 {

	public static void main(String[] args) {
	 int a=2,b=3;
	 
	 System.out.println(a+" --"+ b);
	 
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 
	 System.out.println(a+" --"+ b);
	 
	 a=a*b;
	 b=a/b;
	 a=a/b;
	 System.out.println(a+" --"+ b);
	 
	 a=a^b;
	 b=a^b;
	 a=a^b;	
	 System.out.println(a+"--"+ b);
	}

}
