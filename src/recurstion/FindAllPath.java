package recurstion;

public class FindAllPath
{
    public static void main(String[] args)
    {
        boolean [][]board={{true,true,true},{true,true,true},{true,true,true}};
        findAllPaths("",board,0,0);
    }
    private static void findAllPaths(String p,boolean [][]maze,int r,int c)
    {
        if (r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
        {
            return;
        }
        // i am considering this in my path
        maze[r][c]=false;
        if (r<maze.length-1)
        {
            findAllPaths(p+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1)
        {
            findAllPaths(p+'R',maze,r,c+1);
        }
        if (r>0)
        {
            findAllPaths(p+'U',maze,r-1,c);
        }
        if (c>0)
        {
            findAllPaths(p+'L',maze,r,c-1);
        }
        //this liine is where the
        // so before the fun get removed,also remove the changes
        maze[r][c]=true;
    }
}
