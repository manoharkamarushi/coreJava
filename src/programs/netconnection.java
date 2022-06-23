package programs;

import java.net.URL;
import java.net.URLConnection; 

public class netconnection{
public static void main(String[] args){
  
try 
{
        URL url = new URL("http://www.instanceofjava.com");
 
        URLConnection con = url.openConnection();
        			  con.connect();   
 
        System.out.println("Internet Connected");   
            
 }catch (Exception e){
     
System.out.println("Sorry, No Internet Connection");    
System.out.println(e);
                                                            
} 

}
}