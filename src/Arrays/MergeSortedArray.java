package Arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String args[]) {
		int[] a = { 1,2,3,0,0,0};
		int m=3;
		int[] b = { 2,5,6};
		int n=3;
		System.out.println(merge(a,m,b,n));

	}
	

	  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		  
		  int[] merge=new int [m+n];
		  merge=nums1;
		  int i=0;
		  while(m<merge.length)
		  {
			  merge[m]=nums2[i];
			  i++;
			  m++;
		  }
		Arrays.sort(merge);
		 
		  
		return merge;   
    }
	  
	  public static void merge0ms(int A[], int m, int B[], int n) {
		    int i=m-1, j=n-1, k=m+n-1;
		    while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
		    while (j>-1)         A[k--]=B[j--];
		}
}
