package Arrays;

public class NumbersAreSmallerThanCurrentNumber {

	public static void main(String args[]) {
		int[] nums = { 8,1,2,2,3 };
		System.out.println(smallerNumbersThanCurrent(nums));
	}
	
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
		 int count=0;
		 int[] result=new int[nums.length];
		 for (int i = 0; i < nums.length; i++) {
			for (int j : nums) {
				if(nums[i]>j)
					count++;
			}
			result[i]=count;
			count=0;
		}
		 for (int i : result) {
			System.out.println(i);
		}	
		return result;
	        
	    }
	 
	 public static int[] smallerNumbersThanCurrent0ms(int[] nums) {
	        int[] count = new int[101];
	        for (int num: nums) {
	            count[num] = count[num] + 1;
	        }
	        int cur = 0;
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] != 0) {
	                int temp = count[i];
	                count[i] = cur;
	                cur += temp;
	            }
	        }
	        for (int j = 0; j < nums.length; j++) {
	            nums[j] = count[nums[j]];
	        }
	        
	        return nums;
	    }
}

