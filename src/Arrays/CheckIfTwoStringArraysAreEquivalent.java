package Arrays;

public class CheckIfTwoStringArraysAreEquivalent {

	public static void main(String args[]) {
		
		String[] a = { "a", "cb" };
		String[] b = { "ab", "c" };

		System.out.println(arrayStringsAreEqual(a, b));
	}

	public static boolean arrayStringsAreEqual(String[] a, String[] b) {
		
		String val1="";
		String val2="";
		
		for (String string : a) {
			val1+=string;
		}
		
		for (String string : b) {
			val2+=string;
		}
		System.out.println(val1+" "+ val2);
		if(val1.length()!=val2.length())
			return false;
			if(val1.equals(val2))
			return true;
			else
			return false;
		
//		String val1=String.join("",a);
//		String val2=String.join("",b);
//		if(val1.length()!=val2.length())
//		return false;
//		if(val1.equals(val2))
//		return true;
//		else
//		return false;
		
	}
}
