package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] a = { 1,0,1,1,0,1};
//		System.out.println(findMaxConsecutiveOnes(a));
		System.out.println(findMaxConsecutiveOnes3(a));

	}

	public static int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0;
        int count = 0;  
        for(int i = 0; i<nums.length; i++){
            if(nums[i] ==1){
                count = count +1;
                max = Math.max(max,count);
            }
            else count = 0;
        }
        return max;
    }
	
	public static int findMaxConsecutiveOnes3(int[] nums) {
		int i = 1;
		int count=1;
		int max=0;
		while (i < nums.length) {
			if(nums[i]==nums[i-1])
			{
				if(i!=1)
				count=count+1;
				max=Math.max(max, count);
			}else {
				count=1;
			}
			i++;
		}
		
		return count;
		
		
//		int count = 0;
//		int max=0; 		 
//		int i=0;
//				while(i<nums.length) {
//				if (nums[i] == 1) {
//					count = count + 1;
//					max = (max >= count) ? max : count;
//				  }
//				else {
//					count = 0;
//				}
//				i++;
//			}
//			return max;
		} 
	
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		List<Integer> counter = new ArrayList<Integer>();
		
		if (contains(nums,0)) {
			for (int n : nums) {
				if (n == 1)
					count = count + 1;
				else {
					count = 0;
				}
				counter.add(count);
			}
			return Collections.max(counter);
		} else {
			return nums.length;
		}
	}
	
	public static boolean contains(int[] nums,int compare)
	{
		for (int f : nums) {
			if (f == compare)
				return true;
		}
		return false;
	}

}
