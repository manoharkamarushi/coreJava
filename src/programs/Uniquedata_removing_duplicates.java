package programs;
public class Uniquedata_removing_duplicates 
 {
 public static void main(String[] args) 
  {
int c=0;

String s1[]={"hello","hi","j2ee","j2ee",};

for(int i=0;i<s1.length;i++)
{
    for(int j=i+1;j<s1.length;j++)
    {
    	if(s1[i]==(s1[j]) )
    		{
    			c++;
    			s1[j]="";
    		 }
     }
    
        if(c==0)
            System.out.println(s1[i]);
         else
            {
                s1[i]="";
                c=0;    
            }
        }
    }
}