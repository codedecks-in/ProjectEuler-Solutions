import java.util.*;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p012 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		int series = 0;
		int s1 = 0;
		int div = 0;
		
		for(int i=1;;i++){
			series = i;
			s1=0;
			
			while(series>0){
				s1 += series;
				series--;
			}
			
			div = divisors(s1);
			if(div>500){
				System.out.println(s1);
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time = "+(endTime-startTime)+" ms");
	}
	
	// Algo to find divisors of any number
	static int divisors(int x) {
	    int limit = x;
	    int numberOfDivisors = 0;

	    for (int i = 1; i < limit; ++i) {
	       
	    	if (x % i == 0) {
	            limit = x / i;
	            
	            if (limit != i) {
	                numberOfDivisors++;
	            }
	            numberOfDivisors++;
	        }
	    }

	    return numberOfDivisors;
	}

}
