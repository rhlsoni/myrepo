package recurstion;
public class binarySearch
{
    public static void main(String[] args)
    {
       int []a={1,2,3,4,5,6,7,8};
       int t=3;
       System.out.println(binarySear(a,t,0,a.length-1));
    }
    private static int binarySear(int []a,int t,int s,int e)
    {
        if (s > e)
        {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (t == a[m])
        {
            return m;
        }
        if (t < a[m])
        {
            return binarySear(a, t, s, m - 1);
        }
        return binarySear(a,t,m+1,e);
    }
}
