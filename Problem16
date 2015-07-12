package euler;

import java.math.BigInteger;

//import java.lang.*;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		int n = 1000;
		int sum = 0;
		BigInteger exp = new BigInteger("2");
		
		exp = exp.pow(n);
		
		String str = String.valueOf(exp);
		
		System.out.println(str);
		int len = str.length();
		
		for(int i=0;i<len;i++)
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
