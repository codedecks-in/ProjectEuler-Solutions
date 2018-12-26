/**
 * 
 * @author gouravrusiya
 *
 */
public class p035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		boolean b = false;
		boolean b1 = false;
		char a;
		int count = 0;
		int flag = 0;
		int k = 1;
		
		for(int i=2;i<1000000;i++){
			b = isPrime(i);
			if(i<10){
				if(b)
					count++;
			}
			
			else
			{
				if(b){
					String str = String.valueOf(i);
					String str1 = "";
					int len1 = str.length();
					//System.out.println(len1);
					int x = len1-1;
					b1 = false;
					flag = 1;
					
					while(x!=0){
						//flag = 1;
						
						k = 1;
						str1 = "";
						for(int j=0;j<len1;j++){
							
							if(j==(len1-1))
							{
								a = str.charAt(0);
								str1 += a;
							}
							
							else{
							a = str.charAt(k);
							str1 += a;
							}
							
							k++;
						}
						
						int res = Integer.parseInt(str1);
						b1 = isPrime(res);
						
						if(b1){
							flag++;
							//count++;
						}
						else
							break;
						
						x--;
						str = str1;
					}
					
					if(flag==len1){
						count++;
						//System.out.println(str1);
					}
					
				}
			}
		}
		System.out.println(count);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Running time "+(endTime-startTime)+"ms");
	}
	
	public static boolean isPrime(int n){
		int i=0;
		
		for(i=2;i<=(int)Math.sqrt(n);i++){
			
			if(n%i==0)
				break;
			
		}
		
		if(i>(int)Math.sqrt(n))
		return true;
		
		else
		return false;
	}
}
