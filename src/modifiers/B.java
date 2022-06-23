package modifiers;

class B extends A{

	void f(){
		System.out.println(a);
	}
	public static void main(String[] args){
		new B().f();
	}
}
