/**
 * 
 * @author gouravrusiya
 *
 */
public class p028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		long sum1=0L;	// 1,9,25,49............are square of 1,3,5,7.........
		long sum2=1L;	// 1,3,13,31............pattern from 3rd term is [2*(N) + previousSum] where n = 1 for 1st term & then n=n+4
		long sum3=1L;	// 1,5,17,37............pattern from 3rd term is [2*(M) + previousSum] where n = 1 for 1st term & then n=n+4
		long sum4=1L;	// 1,7,21,43............pattern from 3rd term is [2*(P) + previousSum] where n = 1 for 1st term & then n=n+4
		long n = 1L;
		long m = 2L;
		long p = 3L;
		int count = 0;
		
		for(int i=1;i<=1001;i++)
		{
			if((i%2)!=0){
				sum1 += (i*i);
				count++;
			}
		}
		//System.out.println(count);
		
		sum2 = (2L*n) + sum2;
		sum1 += sum2;
		
		sum3 = (2L*m) + sum3;
		sum1 += sum3;
		
		sum4 = (2L*p) + sum4;
		sum1 += sum4;
		
		for(int i=1;i<(count-1);i++){
			
				n = (n+4L);
				sum2 = (2L*n) + sum2;
				sum1 += sum2;
				
				m = (m+4L);
				sum3 = (2L*m) + sum3;
				sum1 += sum3;
				
				p = (p+4L);
				sum4 = (2L*p) + sum4;
				sum1 += sum4;
				
				//System.out.println(sum1);
		}
		System.out.println(sum1);
		long endTime = System.currentTimeMillis();
		System.out.println("Time = "+(endTime-startTime)+" ms");
	}

}
