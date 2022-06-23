package doubtsClarified;

/** class Object{
 * 
 * public String toString(){
 * 
 * returns "classname@hashcode";
 * }
 * }
 * -----------
 * class Integer{
 * public String toString(){
 * returns "content of the integer object";
 * }
 * }
 * 
 *
 */
public class wrap1 {

	public static void main(String[] args) {

	wrap1 w=new wrap1();
	System.out.println(w);
	System.out.println(w.toString());

	Integer i=new Integer(100); // primitive integer constructor
	Integer i1=new Integer("100"); // string constructor
	System.out.println(i);
	System.out.println(i.toString()); // it is over riding the method present in superclass object & returns the content of the integer object
	System.out.println("----"+Integer.valueOf(109));
	
	
	int a=Integer.valueOf(545);
	System.out.println(a);
	Integer as=Integer.valueOf(202);
	System.out.println(as);
	
	Integer asa=Integer.valueOf("2087");
	System.out.println(asa);
	
	//String asaa=Integer.valueOf("207");
	}

}

