/**
 * 
 * @author gouravrusiya
 *
 */
public class p023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
		int sumAll = 0;
		//long nonAbundantSum = 0L;
		int [] sumAbun = new int[28123];
		int k = 0;
		
		sumAll = ((20161)*(20162))/2;
		//System.out.println(sumAll);
		
		for(int i=12;i<20161;i++){
			long sumDivisors = properDivisors(i);
			
			if(sumDivisors>i){
			sumAbun[k] = i;
			//System.out.println(sumAbun[k]);
			k++;
			}
		}
		//System.out.println(k);
		k--;
		int flag = 0;
		
		for(int i=12;i<20161;){
			flag = 0;
			
			for(int j=0;j<(k-1);j++){
				for(int x=0;x<k;x++){
					
					int y = sumAbun[j] + sumAbun[x];
					
					if(y==i){
						//System.out.println(i);
						sumAll -= i;
						//System.out.println("sum = "+sumAll);
						flag = 1;
						break;
					}
				}
				
				if(flag==1)
					break;
			}
			i++;
		}
		
		System.out.println(sumAll);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms");
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
