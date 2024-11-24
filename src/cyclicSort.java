import java.util.Arrays;

public class cyclicSort
{
    public static void main(String[] args)
    {
       int []a={2,1,4,3,6,5};
       cycleSort(a);
        System.out.println(Arrays.toString(a));
    }
    private static void cycleSort(int []a)
    {
        int i=0;
        while (i<a.length)
        {
            int correct=a[i]-1;
            if (a[i]!=a[correct])
            {
                swap(a,i,correct);
            }else
            {
                i++;
            }
        }
    }
    private static void swap(int []a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
