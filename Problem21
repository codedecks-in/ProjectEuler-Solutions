package euler;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalSum = 0;
		
		for(long i=220L;i<10000;i++){
			
			long x = properDivisors(i);
			long y = properDivisors(x);
			
			if((y==i) && (i!=x)){
				//System.out.println("i = "+i);
				totalSum += i;
			}
			
			//i = x;
		}
		
		System.out.println(totalSum);
	}
	
	static long properDivisors(long i){
		long sum = 0;
		
		for(long j=1L;j<i;j++){
			
			if((i%j)==0L){
				//System.out.println(j);
				sum += j;
			}
		}
		
		return sum;
	}
}
