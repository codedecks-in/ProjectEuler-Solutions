import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p002
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long a=1L,b=2L,c=0L;
		long sum=2L;
		
		for(int i=1;c<4000000L;i++)
		{
			c=a+b;
			
			if(c%2==0)
				sum+=c;
			
			a=b;
			b=c;
		}
		System.out.println(sum);
	}
}
