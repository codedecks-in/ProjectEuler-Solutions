/**
 * 
 * @author gouravrusiya
 *
 */
public class p004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Obviously the largest palindrome made from product of two 3-digit nos will be 6 digits
		int value = 0;
        for(int i = 100;i <=999;i++)
        {
            for(int j = i;j <=999;j++)
            {
            int value1 = i * j;
			String str = "" + value1;
			StringBuffer buf = new StringBuffer(str);
			buf.reverse();
			
			if((str.contentEquals(buf)) && (value<value1))
			{
				value = value1;
				//System.out.println(buf);
			}
				
            }
        }
        System.out.println(value);
}
}
