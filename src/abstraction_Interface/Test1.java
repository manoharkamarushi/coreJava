package abstraction_Interface;

public class Test1 extends Test {

	public static void main(String[] args) {
		
		/*Test1 t1=new Test1();
		t1.m1();
		t1.m2();
		t1.m3();*/

		Test t=new Test1();
		t.m1();
		t.m2();
		t.m3();
	
		Test1 t1=(Test1)t;
		t1.m4();
	}	
	
	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println(" test1 implementation overrided m1");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("test1 implementation overrided m2");
	}
	void m4(){
		System.out.println("test1 m4");
	}

}
