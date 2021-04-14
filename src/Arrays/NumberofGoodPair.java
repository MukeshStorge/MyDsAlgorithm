package Arrays;

public class NumberofGoodPair {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 1, 1, 1, 1 ,2};
		int val = 0;
		int n=8;
		n--;
		System.out.println((n*(n+1)/2));
		System.out.println(numIdenticalPairs(arr));
		System.out.println(palindrome(val));
	}

	private static boolean palindrome(int val) {
		
		  if (val < 0 || (val % 10 == 0 && val != 0)) {
	            return false;
	        }
		int rev = 0;
		int actual=val;
		while (val > 0) {
	          rev= (rev*10)+(val%10);	
			  val /= 10;
		}
		return actual==rev;

	}
	
//geometric series formula
	
	// 1 - 0  0 1*(1-1)/2= 1*0/2= 1/2 =0   
	// 2 - 1  1 2*(2-1)/2= 2*1/2= 2/2 =1
	// 3 - 3  2 3*(3-1)/2= 3*2/2= 30/2 =15
	// 4 - 6  3 4*(4-1)/2= 4*3/2= 30/2 =15
	// 5 - 10 4 5*(5-1)/2= 5*4/2= 30/2 =15
	// 6 - 15 5 6*(6-1)/2= 6*5/2= 30/2 =15
	// 7 - 21 6 7*(7-1)/2= 7*6/2= 42/2 =21
	// 8 - 28 7 8*(8-1)/2= 8*7/2= 56/2 =28

	public static int numIdenticalPairs(int[] arr) {
		int res = 0, count[] = new int[101];
		int counter = 0;
		// for (int a: arr) {
		//
		// res = res+ counter++;
		// System.out.println(counter +" "+res);
		//
		// }
		// res=0;
//
		for (int a : arr) {
			res = res + count[a]++;
			System.out.println(count[a] + " " + res);
		}
		return res;

//		 int[] count = new int[101];
//		 for(int i = 0 ; i < arr.length ; i ++) {
//		 count[arr[i]] ++; ///learning
//		 }
//		 int pairs = 0;
//		 for(int i = 0; i < 101 ; i ++)
//		 if(count[i] >1)
//		 pairs += (count[i] * (count[i] - 1))/2;
//		 return pairs;

		// int count = 0;
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr.length; j++) {
		// if(i!=j && arr[i]==arr[j] && i<j)
		// count++;
		// }
		// }
		// return count;

	}
}
