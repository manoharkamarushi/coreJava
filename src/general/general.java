package general;

public class general {

	public static<T extends Number> T add(T x, T y){
		  Double sum;
		  sum = x.doubleValue() + y.doubleValue();
		  return (T) sum;
		}

public static void main(String a[]){
	System.out.println(new general().add(45, 78));
	System.gc();
}
}
