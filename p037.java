/**
 * 
 * @author gouravrusiya
 *
 */
public class p037 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//int j =0;
		//int i =0;
		long startTime = System.currentTimeMillis();
		int n = 3797 ;
		int count = 0;
		int count1 = 0,count2=0;
		int x = 0;
		int sum = 0;
		int digit = 0;
		int z = 0;
		
		for(n=11;;n++){
			count1=0;
			count2=0;
			digit=0;
			
		x = n;
		boolean status = isPrime(x);
		if(status){
			//System.out.println(x);
			while(x!=0){
				x = (x/10);
				if(x==0)
					break;
				//System.out.println(x);
				boolean s2 = isPrime(x);
				
				if(s2==true){
					count2++;
					//System.out.println("kk");
				}
				digit++;
			}
			//System.out.println(digit+" "+count2);
			
			String str = "" + n;
			
			if((count2==(digit))){
				
			for(int k=0;k<(str.length()-1);++k)
			{	
				String str1 = "";
				str1 = str.substring(k+1);
				z = Integer.parseInt(str1);
				//System.out.println(z);
				if(isPrime(z))
					count1++;
				else
					break;
			}
			//System.out.println(count1);
			
			if((count1==(digit))){
				sum = sum + n;
				count++;
			}
		}
			
		}
		//System.out.println(count);
		
		if(count==11)
			break;
		
		}
		
		System.out.println(sum);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time = "+(endTime-startTime)+" ms");
		
	}
	
	// Logic to check Prime
	static boolean isPrime(int n){
		int j = 0;
		int i = n;
		if(n==1)
			return false;
		
			for(j=2;j<=(int)Math.sqrt(i);j++){
				
				if((i%j)==0){
					break;
				}
			}
				
			if(j>(int)Math.sqrt(i))
				return true;
			
			else
				return false;
	}

}
