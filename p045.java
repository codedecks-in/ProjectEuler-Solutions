/**
 * 
 * @author gouravrusiya
 *
 */
public class p045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// T = ((n*(n+1))/2);
		// P = ((j*((3*j)-1))/2);
		// H = (j*((2*j)-1));
		long startTime = System.currentTimeMillis();
		long n = 0L;
		long j = 0L;
		long k = 0L;
		int flag = 0;
		
		long T=0L,P=0L,H=0L;
		
		for(n = 286L;n<=100000L;n++)
		{
			j=1L;
			T = (n*(n+1L))/2L;
			
			while(j<=n){
				
			P = (j*((3L*j)-1L))/2L;
			k=1L;
			
			if(P==T){
				
			while(k<=n){
			
			H = (k*((2L*k)-1L));
			
				if(H==T){
					System.out.println(T);
					/*System.out.println(n);
					System.out.println(j);
					System.out.println(k);
					System.out.println("");
					System.out.println(T);
					System.out.println(P);
					System.out.println(H);*/
					flag = 1;
					break;}
			
			k++;
			}
			
			}
			
			if(flag==1)
			{
				break;
			}
			j++;
			}
			
			if(flag==1)
				break;
			
		}
		/*System.out.println(T);
		System.out.println(P);
		System.out.println(H);*/
		long endTime = System.currentTimeMillis();
		
		//System.out.println("Time = "+(endTime-startTime)+" ms");
	}

}
