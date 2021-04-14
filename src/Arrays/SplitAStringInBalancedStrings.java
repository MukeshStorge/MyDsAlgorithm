package Arrays;

public class SplitAStringInBalancedStrings {

	public static void main(String args[])
	{
		String s = "RLRRRLLRLL";
		System.out.println(balancedStringSplit(s));
	}
	
public static int balancedStringSplit(String s) {

	int tcount=0;
	if(1 <= s.length() && s.length()<= 1000)
	{
		int i=0;
		int count=0;
		
		char[] carr=s.toCharArray();
		for (char c : carr) {
			if(c=='R')
			{
				count++;
			}else {
				count--;
			}
			if(count==0)
			{
				tcount++;
			}
			
		}
		
		
		
	}
		return tcount;
        
    }
}
