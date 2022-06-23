package programs;
public class prime1 {
public void pno(int n){
	
	for(int i=2;i<=n;i++){
	int count=0;
	for(int j=2;j<=i/2;j++){
		if(i%j==0){
			count++;
			break;
		}
	}
if(count==0)
System.out.print(i+",");
                        }
}	
public static void main(String[] args) {
	new prime1().pno(100);
	}
}
