package euler;

public class p006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First find the square of the sum using -> {(n*(n+1))/2}^2
		int n = 100;
		long squareSum = (long)Math.pow(((n*(n+1))/2),2);
		//System.out.println(squareSum);
		// Now just subtract each digit's square from this squareSum and get the answer
		
		long ans = 0;
		long sum = 0;
		
		for(int i=1;i<=100;i++)
		{
			sum = (long)Math.pow(i, 2);
			ans += sum;
		}
		System.out.println(squareSum-ans);
	}

}
