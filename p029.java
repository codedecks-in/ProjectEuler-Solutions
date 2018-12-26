import java.math.BigInteger;
import java.util.*;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p029 {
	public static void main(String [] args){
		long startTime = System.currentTimeMillis();
		
		BigInteger a = new BigInteger("2");
		BigInteger limit = new BigInteger("100");
		BigInteger val = new BigInteger("1");
		
		ArrayList<BigInteger> array = new ArrayList<BigInteger>();
		
		for(int j=2;j<=100;){
			
			for(int b=2;b<=100;b++){
				
				val = a.pow(b);
				//System.out.println(val);
				array.add(val);
			}
			j++;
			a = a.add(BigInteger.ONE);
		}
		
		HashSet<BigInteger> hs = new HashSet<BigInteger>();
		hs.addAll(array);
		array.clear();
		array.addAll(hs);
		int itemCount = array.size();
		System.out.println(itemCount);
		
		long endTime = System.currentTimeMillis();
		//System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}
