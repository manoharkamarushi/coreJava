package doubtsClarified;

public class Defualt_Values {

	int a;
	short s;
	char c;
	String st;
	long l;
	double d;
	float f;
	
	public void f(){
	System.out.println("---"+a+"---"+s+"---"+c+"---"+st+"---"+l+"---"+d+"---"+f);
	}
	public static void main(String[] args){
		Defualt_Values dv=new Defualt_Values();
		dv.f();
	}
}
