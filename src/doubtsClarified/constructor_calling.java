package doubtsClarified;

import java.util.Map;

public class constructor_calling {

	 constructor_calling() {
		 this(10);
		 //this(20,32); only one this() is allowed for constructors
		 System.out.println("defualt constructor");
		 //this(10); error should be the first statement
	}
	 constructor_calling(int a){
		 this(10,20);
		 System.out.println(a);
	 }
	 constructor_calling(int a,int b){
		 Map<Thread, StackTraceElement[]>m=Thread.getAllStackTraces();
		 System.out.println(m.entrySet());
		 System.out.println(a+b);
	 }
	
	public static void main(String[] args){
		
	 new constructor_calling();
//	 new constructor_calling(10);
//	 new constructor_calling(10,20);
		
	}
}
