package doubtsClarified;

public class WrapperClasses {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Object a=new WrapperClasses();

	// for every class object is a super class...
	// Wrapper classes is the super class for all wrapper classes...	
	Integer a1=new Integer("");
	// Integer class has 2 constructors ,,,  & refer core java notes
	Integer a2=new Integer(100);
	
    Object b=new Integer("");
    
    Character c=new Character('d');
    Object ca=new Character('w');
    
    Number n=new Integer("");
    
    new Float(0.998f);
    
	}

}
