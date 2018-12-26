import java.math.BigInteger;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long sum = 0L;
		long max = 0L;
		BigInteger x = new BigInteger("0");
		
		for(int a=2;a<100;a++){
			
			for(int b=2;b<100;b++){
				
				BigInteger biga = new BigInteger(Integer.toString(a));
				
				x = biga.pow(b);
				
				long n = x.longValue();
				//System.out.println(x);
				
				sum = 0L;
				String str = x.toString();
				//System.out.println(str);
				
				for(int i=0;i<(str.length());i++){
					String s = "" +str.charAt(i);
					int m = Integer.parseInt(s);
					
					sum+=m;
				}
				
				if(sum>max)
					max = sum;
			}
		}
		System.out.println(max);
		long endTime = System.currentTimeMillis();
		//System.out.println("Time = "+(endTime-startTime)+" ms");
	}

}
