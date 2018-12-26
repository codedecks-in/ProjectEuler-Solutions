import java.util.*;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p003 {
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		long l = 600851475143L;
		int j = 0;
		long max = 0L;
		
		for(long i=2L;i<=l;i++)
		{
			if(l%i==0)
			{
				for(j=2;j<=(int)Math.sqrt(i);j++)
				{
					if((i%j)==0)
						break;
				}
				
				if(j>(int)Math.sqrt(i))
					{
					System.out.println(i);
					if(max<i)
						max = i;
					}
			}
		}
		System.out.println(max);
		long endTime = System.currentTimeMillis();
		System.out.println("Time ="+(endTime-startTime)+" ms");
	}

}
