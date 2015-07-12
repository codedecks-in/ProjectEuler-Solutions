package euler;
import java.math.*;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();

		BigInteger fact = new BigInteger("1");
		int n = 1000000;
		int sum =0;
		
		for (BigInteger bi = BigInteger.valueOf(n);
	            bi.compareTo(BigInteger.ZERO) > 0;
	            bi = bi.subtract(BigInteger.ONE)) {
			
			fact = fact.multiply(bi);
			
	    }
		
		//System.out.println(fact);
		
		String str = new String(fact.toString());
		
		//System.out.println(str);
		
		for(int i=0;i<str.length();i++)
		{
			String s;
			s = ""+str.charAt(i);
			
			int x = Integer.parseInt(s);
			sum = sum + x;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}
}
