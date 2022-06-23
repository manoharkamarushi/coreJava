package abstraction_Interface;

public abstract class T1 {

	
	int a;
	final static int b=9;
	public static void l1(){}
	
	public int ls(){
		
		return b;
				
	}
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
	abstract void m5();
	
	
	public static void main(String[] args){
//		new T1().m1();
	 
		System.out.println("cant instantiate the object.... but we can declare main() method");

	
	}
}
