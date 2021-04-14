package Arrays;

class RunningSum {

	public static void main(String[] args) {
		int[] a = { 1, 1, 4, 2, 1, 3 };
		System.out.println(runningSum(a));

	}

	public static int[] runningSum(int[] heights) {
		int i = 0;
		int sum=0;
		int[] result = new int[heights.length];
		
		while (i < heights.length) {
			sum=sum+heights[i];
			result[i]=sum;
			i++;
		}
		
		return result;
		
		
//		while (i < heights.length) {
//			if(i==0)
//				result[i]  = heights[i] ;
//			else {
//			result[i] = sum(i, heights);
//			}
//			i++;
//		}
//		return result;
	}

//	private static int sum(int i, int[] heights) {
//		int sum=0;
//		for (int j = 0; j <= i; j++) {
//			
//			sum=sum+heights[j];
//		}
//		return sum;
//	}

}