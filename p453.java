/**
 * 
 * @author gouravrusiya
 *
 */
public class p453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 0.0;
		long count = 0L;
		long x = 1;
		int loop1 = 0;
		int loop2 = 0;
		
		for(long y =2;y<=100L;y++)
		{	
			for(x=1;x<y;x++)
			{
					n = (double)(x*y)/(x+y);
					
					if(n ==(int)n)
						{count++;
						System.out.println(x+" "+y+" "+n);
						//x = x+1;
						}
					//System.out.println(x);
					loop1++;
			}
			loop2++;
		}
		System.out.println(count+" "+loop1+" "+loop2);
	}

}