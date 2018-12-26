import java.util.Arrays;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p052 {

	public static void main(String[] args) {
		
		// NOTE : Please don't read this algo
		
		// A shit algo --- Headache happened
		
		for(int x =1;;x++){
			
			String str = "" + x;
			int x1 = (2*x);
			String str1 = "" + x1;
			int x2 = (3*x);
			String str2 = "" + x2;
			int x3 = (4*x);
			String str3 = "" + x3;
			int x4 = (5*x);
			String str4 = "" + x4;
			int x5 = (6*x);
			String str5 = "" + x5;
			int count = 0;
			
			if( (str.length() == str1.length()) && (str.length() == str2.length()) && (str.length() == str3.length()) && (str.length() == str4.length()) && (str.length() == str5.length()))
			{
				count = 0;
				
				int [] arr = new int[str.length()];
				int [] arr1 = new int[str.length()];
				int [] arr2 = new int[str.length()];
				int [] arr3 = new int[str.length()];
				int [] arr4 = new int[str.length()];
				int [] arr5 = new int[str.length()];
				
				for(int i=0;i<str.length();i++){
					
					String s = "" + str.charAt(i);
					arr[i] = Integer.parseInt(s);
					
					String s1 = "" + str1.charAt(i);
					arr1[i] = Integer.parseInt(s1);
					
					String s2 = "" + str2.charAt(i);
					arr2[i] = Integer.parseInt(s2);
					
					
					String s3 = "" + str3.charAt(i);
					arr3[i] = Integer.parseInt(s3);
					
					
					String s4 = "" + str4.charAt(i);
					arr4[i] = Integer.parseInt(s4);
					
					
					String s5 = "" + str5.charAt(i);
					arr5[i] = Integer.parseInt(s5);
				}
				
				Arrays.sort(arr);
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				Arrays.sort(arr3);
				Arrays.sort(arr4);
				Arrays.sort(arr5);
				
				/*if((arr.equals(arr1)) && (arr.equals(arr2)) && (arr.equals(arr3)) && (arr.equals(arr3)) && (arr.equals(arr4)) && (arr.equals(arr5)))
				{
					System.out.println(arr);
					//count=1;
					break;
				}*/
				
				for(int number=0;number<str.length();number++){
					if((arr[number]==arr1[number]) && (arr[number]==arr2[number]) && (arr[number]==arr3[number]) && (arr[number]==arr4[number]) && (arr[number]==arr5[number])){
						count++;
					}
				}
				if(count==(str.length())){
					System.out.println(str);
					break;
				}
					
			}
			
		}
	}

}
