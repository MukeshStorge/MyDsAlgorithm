package Arrays;

public class StringLower {

	public static void main (String args[])
	{
		
		System.out.println(toLowerCase("A b C D Mukesh STORGE"));
		
	}
	 public static String toLowerCase(String str) {
		 
//		 char x='A';
//	        x=x+1;
//	        System.out.println(x);
	        
		   char[] res = str.toCharArray();
	        for(int i = 0; i < res.length; i++)
	            if(res[i] >= 'A' && res[i] <= 'Z') 
	            	res[i] += 32;
	        return new String(res);
	        
	    }
}
