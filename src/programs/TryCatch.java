package programs;
public class TryCatch {
public int cal(){
	try{
		
	System.out.println("__");
    int a=10/0;
		
		return 1;
	
	}catch(Exception e){
		
	//System.out.println(e.getMessage());	
	return 12;	
		
	}
//return 122;

}	
	
public static void main(String[] args) {
TryCatch tc=new TryCatch();
System.out.println(tc.cal());	

	}

}
