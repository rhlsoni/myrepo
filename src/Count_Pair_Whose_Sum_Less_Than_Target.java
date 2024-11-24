import java.util.Arrays;
import java.util.List;

public class Count_Pair_Whose_Sum_Less_Than_Target
{
    public static void main(String[] args)
    {
       List<Integer> nums= Arrays.asList(-1,1,3,2,5,4);
       int target=2;
       // System.out.println(countPair());
    }
    private static int countPair(List<Integer> nums,int target)
    {
        int res=0;
        int l=0;
        int r=nums.size()-1;
        while (l!=r)
        {
            if (nums.get(l)+nums.get(r)<target)
            {
                res +=r-l;
            }else
                r--;
        }
        return res;
    }
}
