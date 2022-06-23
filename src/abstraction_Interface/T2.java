package abstraction_Interface;

public abstract class T2 extends T1 {

	void m1(){
		System.out.println("T1 m1"); }
	void m2(){
		System.out.println("T2 m2"); }
	public int ls(){
		
		
		return a;
			
	}
	// it extends means , it contains all abstract methods ,but you implemented only two Mehthod
	// so cant create object to this class T2
	// either we need to implement all the methods or declare this class as abstract &
	// implement some methods	
	
	public static void main(String []p){
//		new T1().m1();
	}
}
