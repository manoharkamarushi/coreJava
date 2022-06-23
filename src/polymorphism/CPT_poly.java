package polymorphism;
// method signatures are different
public class CPT_poly {
 
void m1(int a){
	
}	
void m1(int a,int b){
	
}	
void m2(String s){
	
}
void m2(int x){
	
}
public static void main(String[] args) {
	CPT_poly mo=new CPT_poly();
		mo.m1(0);
		mo.m1(10, 13);
		mo.m2(1);
		mo.m2(23);
	}

}
