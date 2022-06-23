package doubtsClarified;

public class ObjectCreationTypes {

	ObjectCreationTypes(){
		System.out.println("am defualt/zero argument constructor");
	}
	ObjectCreationTypes(int a){
		System.out.println(a);
	}
	ObjectCreationTypes(int a,int b){
		System.out.println(a+b);
	}
	void disp(){
		System.out.println("disp");
	}
	
	void show(){
		System.out.println("");
	}
	public static void main(String[] args) {
	
	ObjectCreationTypes ob=new ObjectCreationTypes(); //named appraoch
	
		new ObjectCreationTypes(); // nameless approach
		new ObjectCreationTypes(10);
		new ObjectCreationTypes(20,30);	
		
		new ObjectCreationTypes().show();
		new ObjectCreationTypes().disp(); // method calling through nameless approach
	}

}
