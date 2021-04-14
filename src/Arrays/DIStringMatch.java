package Arrays;

public class DIStringMatch {
	
	
	public static void main (String args[])
	{
		
		System.out.println(diStringMatch("DDI"));
	}
	
	public static int[] diStringMatch(String S) {
		
		int[] result=new int[S.length()+1];
		int inc=0,dec=S.length();
		for (int i = 0; i < S.length(); i++) {
			if(S.charAt(i)=='I') 
				result[i]=inc++;
			else if (S.charAt(i)=='D') 
				result[i]=dec--;
			
		}
		result[S.length()] = inc;
		for (int i : result) {
			System.out.println(i);
		}
		return result;
		
	}

}
