package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class LongestNiceSubstring {

	public static void main(String args[]) {
//		System.out.println(longestNiceSubstring("YazaAay"));

		System.out.println(removeDuplicates("abbaca"));
		System.out.println(removeDuplicates3("abbaca"));
	}

	public static String removeDuplicates(String S) {
		char[] ch = new char[S.length()];
		int i = 0;

		for (int j = 0; j < S.length(); j++) {
			if (i > 0 && ch[i - 1] == S.charAt(j)) {
				i--;
			} else {
				ch[i] = S.charAt(j);
				i++;
			}
		}
		return new String(ch, 0, i);
	}

	public static String removeDuplicates3(String s) {

		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.reverse().toString();
	}

	public static String removeDuplicates2(String S) {
		StringBuilder sb = new StringBuilder();
		for (char ch : S.toCharArray()) {
			if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ch) {
				sb.deleteCharAt(sb.length() - 1);
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static String longestNiceSubstring2(String s) {
		if (s.length() == 1)
			return "";

		int localMax = 1, globalMax = 0;
		String result = "";

		for (int i = 1; i < s.length(); i++) {
			if (Character.toUpperCase(s.charAt(i - 1)) == Character.toUpperCase(s.charAt(i)))
				localMax++;
			else {
				if (localMax > globalMax) {
					result = s.substring(i - localMax, i);
				}
				globalMax = Math.max(globalMax, localMax);
				localMax = 1;
			}
		}

		return result.length() == 1 ? "" : result;

	}

	public static String longestNiceSubstring(String s) {
		if (s.length() < 2)
			return "";
		char[] arr = s.toCharArray();
		Set<Character> set = new HashSet<>();

		for (char c : arr)
			set.add(c);

		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];

			if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c)))
				continue;

			String sub1 = longestNiceSubstring(s.substring(0, i));
			String sub2 = longestNiceSubstring(s.substring(i + 1));

			return sub1.length() >= sub2.length() ? sub1 : sub2;
		}
		return s;
	}
}