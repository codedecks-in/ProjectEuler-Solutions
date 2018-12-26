package euler;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 5 - Indirectly WAP to find LCM from 1 to 20
		
		int a =1,b=2;
		int x=0,y=0;
		int i = 2;
		
		for(i=2;i<20;i++)
		{
			b=i;
			x=a;
			y=b;
			while(a!=b)
			{
				if(a>b)
					a-=b;
				else
					b-=a;
			}
			//System.out.println(a);
			a=(x*y)/a;
		}
		System.out.println(a);
	}

}
