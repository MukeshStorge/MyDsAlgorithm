package Arrays;

public class JewelsAndStones {

	
	 public static void main(String args[]) {
		 
	        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	    }
	 
	 public static int numJewelsInStones(String J, String S) {

		 int count=0;
		 char jarr[]=J.toCharArray();
		 char sarr[]=S.toCharArray();
		 for (char s : sarr) {
			 for (char j : jarr) {
				 if(s==j)
				 {
					count++; 
				 }
			}
		}
		 
		return count;
	    }
}
