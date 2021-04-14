package Arrays;

import java.util.Arrays;

class HeightChecker {
	
	public static void main(String[] args) {
		int[] a = {1,1,4,2,1,3};
		System.out.println(heightChecker(a));

	}
    public static int heightChecker(int[] heights) {
    	int count=0;
    	int [] sorted=new int[heights.length];
    	System.arraycopy(heights, 0, sorted, 0, heights.length);
    	Arrays.sort(sorted);
    	for (int i = 0; i < sorted.length; i++) {
			if(sorted[i]!=heights[i])
				count++;
		}
    	return count;
    	
//        int count = 0;
//        int i=0;
//        int len = heights.length;
//        int[] newArr = new int[heights.length];
//        System.arraycopy(heights, 0, newArr, 0, len);
//        Arrays.sort(heights);
//        while(i<len) {
//            if (newArr[i] != heights[i])
//                count++;
//           i++;
//        }
//        return count;
    }
    public int heightChecker0ms(int[] heights) {
        int[] freq = new int[101];
        
        for (int h : heights) {
            freq[h]++;
        }
        
        int count = 0;
        int currHeight = 1;
        for (int h : heights) {
            while (freq[currHeight] == 0) {
                currHeight++;
            }
            
            if (h != currHeight) {
                count++;
            }
            freq[currHeight]--;
        }
        
        return count;
    }
}