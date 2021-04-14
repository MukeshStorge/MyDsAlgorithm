package Arrays;

import java.util.Arrays;

public class NumberofStepsToReduceNumberToZero {
	static int count=0;
	public static void main (String args[])
	{
		
		int num= 14;
		System.out.println(numberOfSteps(num));
	}
	
	public static int numberOfSteps(int num) {
		
//		  if (num==0) return 0;
//	        if (num==1) return 1;
//	        
//	        if (num%2==0){
//	            return 1 + numberOfSteps (num/2);
//	        }
//	        else
//	            return 1 + numberOfSteps (num-1);
	 
		
		if(num==0)	return 0;
		if(num==1) return 1;
		
		num=(num%2==0)?(num/=2):(num-=1);
			
		if(num!=0)
			return 1+ numberOfSteps(num);
		else
		return 0;
		
	}
	

}
