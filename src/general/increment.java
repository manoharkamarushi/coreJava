package general;

public class increment {

	public static void main(String[] args) {
int x=10;
int a=x--; System.out.println(a); //10
int b=--x; System.out.println(b); //8
System.out.println(a-b);
System.out.println("-----------------");
int c=10;
int d=c++; System.out.println(c);
int e=++c; System.out.println(e);
System.out.println(d-e);
System.out.println("-----------------");
int f=10;
//System.out.println(f+"::"+ f++ +"::"+ ++f+":"+f); //10,10,12,12
System.out.println(f+"::"+ f-- +"::"+ --f +"::"+ --f); // 10,10,8,7 
//System.out.println(null); cant print null value in println,print
//System.err.println(f);

	}

}
