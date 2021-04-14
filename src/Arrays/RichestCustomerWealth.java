package Arrays;

import java.util.Arrays;

public class RichestCustomerWealth {
	public static void main (String args[])
	{
//		int[][]num= {{1,2,3},{3,2,1}};
		
		int[][]num= {{1,5},{7,3},{3,5}};
		System.out.println(maximumWealth(num));
	}
	
	public static int maximumWealth1(int[][] accounts) {
	    return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
	}
	
	public static int maximumWealth(int[][] accounts) {
		int max=0;
		for (int[] is : accounts) {
			int sum=0;
			for (int in : is) {
				sum+=in;
			}
			max=max<sum?sum:max;
		}
		
		return max;
	}

}
