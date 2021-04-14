package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {

	public static void main(String args[]) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };// [2,3,5,4,1,7] //0-0/1-3/2-4/3-5
		int n = 3;
				  //12345678
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2	, 1, 3 };
//		System.out.println(shuffleInt(nums, n));
		System.out.println(restoreString(s, indices));
	}

	public static String shuffleString(String s, int[] indices) {
		char[] carr=s.toCharArray();
		
		for (int i = 0; i < carr.length; i++) {
			System.out.println(i+"-"+carr[i]+"-"+indices[i]+"-"+carr[indices[i]]);
			carr[indices[i]]=s.charAt(i);
		}
		
		return new String(carr);
		
	}
	
public static String restoreString(String s, int[] indices) {        
	    char[] cArr = s.toCharArray();
	    for (int i = 0; i < cArr.length; i++) {
	        while (i != indices[i]) {
	            swapChar(cArr, i, indices[i]);
	            swapInt(indices, i, indices[i]);
	        }        
	    }
	    return String.valueOf(cArr);
	}

	public static void swapInt(int[] indices, int x, int y) {
	    int temp = indices[x];
	    indices[x] = indices[y];
	    indices[y] = temp;   
	}

	public static void swapChar(char[] cArr, int x, int y) {
	    char t = cArr[x];
	    cArr[x] = cArr[y];
	    cArr[y] = t;
	}

	public static int[] shuffleInt(int[] nums, int n) {

		int count = n;
		int icount = 0;
		int[] result = new int[nums.length];

		for (int i = 0; i < n; i++) {

			result[icount] = nums[i];
			icount++;
			result[icount] = nums[count];
			count++;
			icount++;
		}
		for (int i : result) {
			System.out.println(i);
		}

		return result;
	}

}
