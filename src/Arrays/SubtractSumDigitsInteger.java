package Arrays;

public class SubtractSumDigitsInteger {

	public static void main (String args[])
	{
		System.out.println(subtractProductAndSum(555));
	}
	
	  public static int subtractProductAndSum(int num) {
		  
		  int sum = 0, prod = 1;
	        while (num > 0) {
	            int digit = num % 10;
	            
	            sum += digit;
	            prod *= digit;
	            num /= 10;
	        } 
	        return prod - sum;       
	        
	    }
}


