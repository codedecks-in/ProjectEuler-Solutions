import java.math.BigInteger;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		long startTime = System.currentTimeMillis();
		
				BigInteger a = new BigInteger("1");
				BigInteger b = new BigInteger("1");
				BigInteger c = new BigInteger("0");
				
				//long n = 4000000L;
				long i = 0;
				
				for(i=3;;i++)
				{
					c= a.add(b);
					
					String str = new String(c.toString());
					//System.out.println(str);
					int len = str.length();
					
					if(len == 1000)
						break;
					a=b;
					b=c;
				}
				System.out.println(i);
				
				long endTime = System.currentTimeMillis();
				System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}
