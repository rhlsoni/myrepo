package BinarySearch;

import java.util.Arrays;

public class find_first_last_position
{
    public static void main(String[] args)
    {
       int []a={5,7,7,8,8,10};
       int t=8;
        System.out.println(Arrays.toString(indexNum(a, t)));
    }
    private static int[] indexNum(int []a,int t)
    {
        int []ans={-1,-1};
        int start=firstAndLast(a,t,true);
        int end=firstAndLast(a,t,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    private static int firstAndLast(int []a,int target,boolean findfirst)
    {
        int ans=-1;
        int s=0;
        int e=a.length-1;
        while (s<=e)
        {
            int m=s+(e-s)/2;
            if (target<a[m])
            {
                e=m-1;
            } else if (target>a[m])
            {
               s=m+1;
            }else
            {
               ans=m;
               if (findfirst)
               {
                   e=m-1;
               }else
               {
                   s=m+1;
               }
            }
        }
        return ans;
    }
}
