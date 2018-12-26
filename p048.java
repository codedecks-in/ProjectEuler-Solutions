import java.math.BigInteger;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum = new BigInteger("0");
		BigInteger i = new BigInteger("1");
		BigInteger x = new BigInteger("1");
		//long sumAns = 0;
		//int z = 0;
		int y = 1;
		int j = 1;
		String s = "";
		
		for(;j<=1000;j++)
		{
			x = i.pow(j);
			sum = sum.add(x);
			
			i = i.add(BigInteger.ONE);
		}
		
		String str = sum.toString();
		//System.out.println(str);
		int len = str.length()-1;
		
		//System.out.println(len);
		
		for(y=1;y<=10;y++)
		{
			s += str.charAt(len);
			len--;
		}
		
		//System.out.println(s);
		StringBuffer buf = new StringBuffer(s);
		buf.reverse();
		System.out.println(buf);
	}

}
