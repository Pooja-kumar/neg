/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj= new Scanner(System.in);
	    String d=obj.nextLine();
	    StringBuilder sb = new StringBuilder(d);
	    String b=sb.reverse().toString();
	    System.out.println(b);
	     System.out.println(d);
	    if(d.equals(b)){
	    	System.out.println("yes");
	   }
	    else{
	    	System.out.println("no");
	    }
	    
	}
}
