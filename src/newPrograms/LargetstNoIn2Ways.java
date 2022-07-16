package newPrograms;

import org.testng.annotations.Test;

public class LargetstNoIn2Ways {
	

	@Test
	public void simpleLogic() {
		
		int a=10,b=12,c=9;
		
		if(a>b&&a>c) {
			System.out.println("a is largest.");
		}else if(b>a&&b>c) {
			System.out.println("b is largest");
		}else {
			System.out.println("c is largest");
		}
	}
	
	@Test
	public void usingTernaryOperator() {
		
		int a=10,b=12,c=9;
		
		int l=a>b?a:b;
		int ll=l>c?l:c;
		
		System.out.println("largest is "+ll);
		
	}
}
