package recurstion;

import java.util.ArrayList;
import java.util.List;

public class phoneDigit
{
    public static void main(String[] args)
    {
        System.out.println(pad("","23"));
    }
    private static List<String> pad(String p, String up)
    {
        if (up.isEmpty())
        {
            List<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String>list=new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for (int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char) ('a'+i);
           list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
}
