package Arrays;

public class PrimeNumbers {
	
		public static void main(String args[]) {
			System.out.println(primeNumbers(36));
		}
		
		    private static boolean primeNumbers(int n){
		    	
		    	if (n <= 0) {
		            return false;
		        }
		        int sum = 0;
		        for (int i = 1; i < n; i++) {
		            if (n % i == 0) {
		            	System.out.println(i);
		                sum += i;
		            }

		        }
		        return sum == n;
//		    	 boolean[] m = new boolean[n];
//		         int count = 0;
//		         for (int i=2; i<n; i++) {
//		             if (m[i])
//		                 continue;
//		              
//		             count++;
//		             for (int j=i; j<n; j=j+i)
//		                 m[j] = true;
//		         }
//		          
//		         return count;
		         
		         
//		    	   boolean[] notPrime = new boolean[n];
//		           int count = 0;
//		           for (int i = 2; i < n; i++) {
//		               if (notPrime[i] == false) {
//		                   count++;
//		                   for (int j = 2; i*j < n; j++) {
//		                       notPrime[i*j] = true;
//		                   }
//		               }
//		           }
//		           
//		           return count;
		    	
		    }

}
