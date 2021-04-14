package Arrays;

public class MaximumRepeatingSubstring {
	
	public static void main(String args[])
	{
		System.out.println(maxRepeating("ababc", "ab"));
		System.out.println(maxRepeating("baba", "b"));
		System.out.println(maxRepeating("b", "a"));
		System.out.println(maxRepeating("b", "b"));
	}
//5 2 1
//4 1 3
	
	 public static int maxRepeating(String s, String word) {
		 
		 if(word.length() > s.length())
	            return 0;
	        int max = 0;
	        for(int i=0;i<s.length();i++){
	            int j=0, k=0;
	            while(i < s.length() && s.charAt(i) == word.charAt(j)){
	                if(j == word.length() - 1){
	                    k++;
	                    j = -1;
	                }
	                i++; j++;
	            }
	            if(j != 0)
	                i -= j;
	            if(k > max)
	                max = k;
	        }
	        return max;
	    }
//		int val=sequence.replace(word, "").length();		
//		 if((sequence.length()-val)==word.length())
//			 return 1;
//		 else return (sequence.length()-val)/word.length();
//			 
//	    }
}
