package abstraction_Interface;

public class Cons1 extends Cons{

	
	Cons1(){
		//super();
		System.out.println("cons1");
	}
	@Override
	void m1() {
		System.out.println("cons1 m1");		
	}
	public static void main(String[] args) {

		new Cons1().m1();
		
	}

	

}
