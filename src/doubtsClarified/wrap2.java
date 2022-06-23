package doubtsClarified;

public class wrap2 {

	public static void main(String[] args) {
	
//	method valuof() returns wrapper object -factory method
// now converting wrapper object to primitive value we use - xxxvalue()
	Integer g=Integer.valueOf(1003);
	g.intValue();
	g.byteValue();
	g.byteValue();
	
// and xxxvalue() is not factory method
	int i=g.intValue();
	System.out.println(i);
	byte b=g.byteValue();
	System.out.println(b);
	}

}
