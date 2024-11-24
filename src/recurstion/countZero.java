package recurstion;

public class countZero
{
    public static void main(String[] args)
    {
      int n=10100;
        System.out.println(countZer(n));
    }
    private static int countZer(int n)
    {
        return helper(n,0);
    }
    private static int helper(int n,int c)
    {
        if (n==0)
        {
            return c;
        }
        int rem=n%10;
        if (rem==0)
        {
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
