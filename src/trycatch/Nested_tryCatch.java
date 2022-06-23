package trycatch;

public class Nested_tryCatch {

	public static void main(String[] args) {
		
		try{
			System.out.println(10/0);
			
			try{
				int[] a=new int[2];
				
				System.out.println(a[1]);
					try{
						String s[]=new String[2];
							System.out.println(s[1]);
						}catch(Exception e){
						System.out.println("string index caught");
																 }
				}catch(Exception e1){
				
						try{
							System.out.println(" --------------");
						}catch(Exception jkds){
							System.out.println("----------------");
							
						}System.out.println("array index caught");
														}
		}catch(Exception e){
			
//			System.out.println("arithmetic caught");
			
			throw new ArithmeticException("not eligible");
		}
		
	
	}

}
