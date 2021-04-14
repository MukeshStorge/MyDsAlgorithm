package Arrays;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] a = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
		System.out.println(validMountainArray(a));

	}

	public static boolean validMountainArray(int[] A) {
		int N = A.length;
		int i = 1;
		// boolean goUp = false;
		//// if(A.length > 1) {
		//// if(A[1] <= A[0])
		//// return goUp;
		// goUp = true;
		//
		// for(int i =1; i< A.length; i++) {
		//
		//// if(A[i]==A[i-1])
		//// return false;
		//
		// if(goUp){
		// System.out.println(A[i]+"<"+A[i-1]);
		// if(A[i]<A[i-1]){
		// goUp = false;
		// }
		// }
		//
		// else {
		// if(A[i]>A[i-1])
		// return false;
		// }
		// }
		//
		//
		// return !goUp;
		//// }else return false;
		// }

	 if(A[1] <= A[0])
	return false;
		boolean uphill = true;
		while (i < N) {
			 if(A[i]==A[i-1])
			 return false;
			if (uphill) {
				if (A[i] < A[i -1]) {
					uphill = false;
				} 
			} else {//down hill
				
						if(A[i] >A[i-1])
						{
							return false;
						}
			}

		
//			System.out.println(A[i]);
			i++;
		}
		return !uphill;

		//
		//
		// // walk up
		// while (i+1 < N && A[i] < A[i+1])
		// i++;
		//
		// // peak can't be first or last
		// if (i == 0 || i == N-1)
		// return false;
		//
		// // walk down
		// while (i+1 < N && A[i] > A[i+1] )
		// i++;

		// return i == N - 1;
	}
}
