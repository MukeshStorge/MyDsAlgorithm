package Arrays;
class Fibonacci 
{
    public int fib(int num)
    {
        if(num<=1)
            return num;
        
        int a=0;int b=1;int sum=0;
        
        while(num>1)
        {
          sum=a+b;
            a=b;
            b=sum;
            num--;
        }   
        return sum;
    }
}
