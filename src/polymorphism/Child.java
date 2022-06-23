package polymorphism;

public class Child extends Parent{

	void m1(){
		System.out.println("child m1"); // overriding method
	}
	void m2(){
		System.out.println("child m2 "); //direct method
	}
	public static void main(String[] args) {
		
		Parent obj=new Child(); // always remember --- after new-- that object is created
		
		obj.m1();
	}

}
