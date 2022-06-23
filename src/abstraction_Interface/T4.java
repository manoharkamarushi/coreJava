package abstraction_Interface;

public class T4 extends T3{

	@Override
	void m5() {
	System.out.println("t4 m5");
		
	}

	public static void main(String[] args){
		T4 t4=new T4();
		  t4.m1();
		
		T2 t2=new T4();
		t2.m1();
	
		T4 t44=(T4)t2;
		t44.m5();
		t44.m2();
		
		
	}
	
}
