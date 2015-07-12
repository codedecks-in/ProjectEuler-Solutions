package euler;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long startTime = System.currentTimeMillis();
		  
		  int P = 3;
		  int Q = 0;
		  int ans = 0;
		  int R = 0;
		  int count=0;
		  
		  for(;P<500;P++)
		  {
			  R = (int)Math.pow(P,2);
			  
			  for(Q=P+1;Q<500;Q=Q+2)
			  {
		   int x = R + (int)Math.pow(Q,2);
		   
		   double d = Math.sqrt(x);
		   
		   if(d==(int)d)
		   {
		    ans = (int)d;
		    if((P+Q+ans)==1000)
		    {
		    	System.out.println("P="+P+" "+"Q="+Q+" "+"ans="+ans);
		    	System.out.println(P*Q*ans);
		    	System.out.println("Loop executes :"+count+" times");
		    	break;
		    }
		    
		   }
		      }
		 count++;
		  }
		  
		  long endTime = System.currentTimeMillis();
		  System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}
