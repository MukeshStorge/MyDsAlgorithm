package Arrays;

public class SumOfAllOddLengthSubarrays {
	public static void main(String args[]) {
		int[] mat={1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(mat));
	}


	public static int sumOddLengthSubarrays(int[] mat) {
		int sum = 0;
		int length=mat.length;
		int inc=0;
		//5 - 0 012 123
		
		
		while(inc<length)
		{
			for (int i = 0; i < mat.length; ++i) {
				
				
				sum+=mat[i];
				
			}
			inc+=2;
		}
		return sum;

	}
}
