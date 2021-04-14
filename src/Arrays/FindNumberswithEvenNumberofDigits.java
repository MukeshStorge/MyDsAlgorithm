package Arrays;

public class FindNumberswithEvenNumberofDigits {
	
	public static void main(String args[]) {
		int[] a = { 555,901,482,1771};
		System.out.println(findNumbers2(a));

	}

	  public static int findNumbers(int[] nums) {
		  int count=0;
          int i = 0;
        
		 while(i<nums.length) {
			  if(digitCounter(nums[i])%2==0)
			  {
				  count=count+1;
			  }
             i++;
		  }
		return count;
	  }
	  
	  private static int digitCounter(int num)
	  {
		  int count = 0;
	        while(num != 0)
	        {
	            num /= 10;
	            ++count;
	        }
	        return count;
	  }
	  
	  public static int findNumbers2(int[] nums) {
	        String s="";
	        int k = 0;
	        for (int j : nums) {
	            s = String.valueOf(j);
	            if (s.length() %2 == 0){
	                k++;
	            }
	        }
	        return k;
	    }
	  
	  public int findNumbersOms(int[] nums) {
	        int counter = 0;
	        
	        for (int i : nums) {
	            if (i < 10) {
	                continue;
	            }
	            
	            if (i >= 10 && i < 100) {
	                ++counter;
	            }
	            
	            if (i >= 1000 && i < 10000) {
	                ++counter;        
	            }
	            
	            if (i >= 100000 && i < 1000000) {
	                ++counter;               
	            }
	        }
	        
	        return counter;
	    }
	        
}
