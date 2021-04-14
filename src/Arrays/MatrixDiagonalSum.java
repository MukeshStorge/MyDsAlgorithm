package Arrays;

public class MatrixDiagonalSum {

	public static void main(String args[]) {
//		int[][] mat = { { 1, 1, 1,1 }, { 1, 1, 1,1 }, { 1, 1, 1,1 } , { 1, 1, 1,1 }};
//		int[][] mat={{1,2,3},
//				     {4,5,6},
//				     {7,8,9}};
		int[][] mat={{5}};
		System.out.println(diagonalSum(mat));
	}


	public static int diagonalSum(int[][] mat) {
		int sum = 0;
		int length=mat.length;
		for (int i = 0; i < length; i++) {
			
			sum+=mat[i][i];
			sum+=mat[i][length-1-i];
			
		}
		if(length%2!=0)
			sum-=mat[length/2][length/2];
		return sum;

	}
}
