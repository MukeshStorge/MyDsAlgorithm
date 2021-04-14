package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberXOR {
	public static void main(String args[]) {
//		int[] arr = { 4,1,2,1,2,5 };
		System.out.println(isHappy(2));
//		System.out.println(singleNumber(arr));
	}
	
//	 public static boolean isHappy(int n) {
//		 int total=0;
//	       return helper(n);
//	    }
	    
	    private static boolean isHappy(int n){
	    	
	    	if(n==0)
	    	return false;
	    	
	    	int sum=0;
	        while(n>0){
	            int digit=n%10;
	            sum+=digit*digit;
	            n/=10;
	            System.out.println(sum);
	        }        
	        return sum==1?true:isHappy(sum);
	    }
	    
//	 public static boolean isHappy(int n) {	
//	        int val=0,rs=0;
//	        if(n==1)
//	        	return true;
//	        while (n>0)
//	        {
//	            val=(n%10);
//	            val*=val;
//	            rs+=val;
//	            n/=10;
//	        }
//	        if(rs!=1 && rs!=0)
//	        return	rs==1 || isHappy(rs);
//			return false;
//	        
//	    }
//	false XOR false: false
//	false XOR true: true
//	true XOR false: true
//	true XOR true: false
	
//	different 1 add if(10^20)?30:if(20^10)?30:if(20^30):10:if(30^10):20
//	same 0 sub

	private static int singleNumber(int[] vals) {
		
		
		 //Sanity check
//        if (vals == null || vals.length < 1) {
//            return 0;
//        }
//        Set<Integer> set = new HashSet<>();
//        for (int num : vals) {
//            if (set.contains(num)) {
//                set.remove(num);
//            } else {
//                set.add(num);
//            }
//        }
//        return set.iterator().next();
        
		int result=0;
		int a=20,b=10,c=20,d=30;
		int r=b^c; 
		int x=a^b; 
		int y=c^d;
		int z=d^b;
		System.out.println(x^y);
				
		for (int val : vals) {
			System.out.println(result+" "+val+" "+ (result ^val));
			result=result ^val;
		}
		
		return result;
	}
	}