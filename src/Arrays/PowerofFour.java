package Arrays;
class PowerofFour {
	
	public static void main(String args[])
	{
		System.out.println(isPowerOfFour(2));
		
	}
    public static boolean isPowerOfFour(int num) {
          if(num==1 || num==4) return true;
        if(num<=0)
            return false;
        if((num&(num-1))==0 && ( Math.sqrt(num) % 4)==0)       
            return true;
        return false;
    }
}