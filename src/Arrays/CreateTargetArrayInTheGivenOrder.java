package Arrays;

import java.util.ArrayList;

class CreateTargetArrayInTheGivenOrder {
	
	public static void main(String args[])
	{
		int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
		
		for (int i : createTargetArray(nums, index)) {
			System.out.println(i);
		}
	}
	
    public static int[] createTargetArray(int[] nums, int[] index) {
    	
    	
    	
    	
	int[] result=new int[nums.length];
	int temp=0;
    	for (int i = 0; i < index.length; i++) {
    		
    		if(index[i]!=i)
    		for (int j = i; j < result.length; j++) {
    			
    			temp=nums[index[j]];
    			nums[index[j]]=nums[j];
				nums[j]=temp;
				temp=0;
				
			}
    		System.out.println(nums[i]);
    	}
    	return result;
    	
    	

//    	  int[] target = new int[nums.length];
//          
//          for (int i = 0; i < nums.length; ++i) 
//          {
//              if (index[i] == i) 
//              {
//                  target[index[i]] = nums[i];
//              }
//              else 
//              {  // index[i] < i
//                  int temp;
//                  for (int j = index[i]; j < i+1; ++j) 
//                  {
//                      temp = target[j];
//                      target[j] = nums[i];
//                      nums[i] = temp;
//                  }
//              }
//          }
//          
//          return target;
//    	 ArrayList<Integer> a = new ArrayList<Integer>();
//         for(int i=0;i<nums.length;i++)
//         {
//             a.add(index[i],nums[i]);
//         }
//         return a.stream().mapToInt(i -> i).toArray();

    	
    }

	private static void swap(int[] nums, int targetValue, int targetIndex) {
		
		
		
	}
}