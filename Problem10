package euler;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long count = 2L;
		long n = 2000000L;
		long sum = 0L;
		int j = 2;
		
		while(count<n){
			
		for(j=2;j<=(int)Math.sqrt(count);j++)
		{
			if(count%j==0)
				break;
		}
		
		if(j>(int)Math.sqrt(count))
			{
				sum = sum+count;
			}
		
		count++;
	   }
		System.out.println(sum);
	}

}
