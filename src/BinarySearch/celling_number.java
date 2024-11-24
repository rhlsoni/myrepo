package BinarySearch;

public class celling_number
{
    public static void main(String[] args)
    {
       int []a={1,2,3,4,5,6,7};
       int t=6;
        System.out.println(cellingNumber(a,t));
    }
    private static int cellingNumber(int []a,int target)
    {
        int s=0;
        int e=a.length-1;
        while (s<e)
        {
            int m= (e+s)/2;
            if (target<a[m])
            {
                e=m-1;
            } else if (target>a[m])
            {
               s=m+1;
            }else
            {
                return m;
            }
        }
        return s;
    }
}
