package strings;

import java.util.Date;

public class Tostring {

	public static void main(String[] args){
		
		Tostring ts=new Tostring();
		System.out.println(ts.toString());
		System.out.println(ts);
		
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.getTime());
	}
}
