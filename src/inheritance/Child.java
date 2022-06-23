package inheritance;

public class Child extends Parent{

	public Child() {
		//super(); no need to declare to call Parent()
		this(3);
		System.out.println("child defualt");
	}
	Child(int q){
		System.out.println("child 1 arg");
	}
	
public static void main(String [] args){
	new Child();
//	new Child(3);
}
}