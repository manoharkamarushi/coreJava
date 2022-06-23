package polymorphism;

public class C2 extends P2{

void m1(){
		System.out.println("c2 m1");
	}
	public static void main(String[] args){
	
		//new C2().m1();
		P2 p=new C2();
		p.m1();
		
	}
}
