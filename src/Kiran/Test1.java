package Kiran;

import java.util.Arrays;

public class Test1 {
	
	
	
    public static void main(String[] args) 
    {
		
 	   String S1="SILENT";
 	   String S2="LISTEN";
 	   
 	   char[]  a=S1.toCharArray();
 	   char[]  b=S2.toCharArray();
 	   
 	   Arrays.sort(a);
 	   Arrays.sort(b);
 	   
 	   boolean  result=Arrays.equals(a,b);
 	   
 	   if(result==true)
 	   {
 		   
 		   System.out.println("Given Strings are Anagram"); 
 		   
 	   }
 	   
 	   else
 	   {
 		   
 		   System.out.println("Given Strings are not Anagram"); 
 		   
 	   }
 	   
 	   
 	   
 	   
	   }

}
