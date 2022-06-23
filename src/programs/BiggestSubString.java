package programs;

public class BiggestSubString{
	 
public static void main(String[] args) {
 
String str="manohar kamarushi gmail com";
 
 @SuppressWarnings("unused")
 String longest="";
 int maxlength=0;
 
 @SuppressWarnings("unused")
 int sh=0;
 String arr[]=str.split(" ");
 System.out.println(arr.length);
 
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]); // printing substrings
           if(arr[i].length() > maxlength){
               maxlength = arr[i].length();
                longest = arr[i];
                            
            }
            	
            }  
           }      

//syso("Longest substring is: "+longest);
  
}
