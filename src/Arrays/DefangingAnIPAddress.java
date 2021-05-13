package Arrays;

import java.util.Iterator;

public class DefangingAnIPAddress {

	public static void main(String args[]) {
		System.out.println(defangIPaddr("1.1.1.1"));
		

	}
	
	  public static String defangIPaddr(String address) {
		  
		  String total = "";
	        for(char c : address.toCharArray()){
	           total += (c == '.') ? "[.]" : c;
	        }
	        return total;
	        
	        
//	        String[] ip=address.split("\\.");
//	        System.out.println(ip.length);
//	        return String.join("[.]",ip);
	        
	        
//		  return address.replace(".", "[.]");
	    }
	  
	  
}
