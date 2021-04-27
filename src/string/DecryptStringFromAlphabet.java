package string;
class DecryptStringFromAlphabet {
	
	public static void main(String args[]) {
		System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
	}

	
    public static String freqAlphabets(String s) {
    	
    	for (int i = 0; i < 200; i++) {
			System.out.println(i+" - "+(char)(i));
		}
        StringBuilder sb = new StringBuilder("");
        int v = 0;
        int i = s.length() - 1;
        
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                v = Integer.parseInt(s.substring(i-2, i)) - 1;
                i = i - 2;
            } else {
                v = s.charAt(i) - '0' - 1;
            }
            sb.append((char)('a' + v));
            i--;
        }
        
        return sb.reverse().toString();
    }
}