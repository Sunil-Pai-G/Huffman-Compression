import java.util.*;
public class MyComparator implements Comparator<Node>
{
    @Override
    public int compare(Node x, Node y)
    {
        /**if(x.freq<y.freq)
            return -1;
        else
        if(x.freq>y.freq)
            return 1;
        return 0;*/
        return  x.frequency - y.frequency;
    }
}
//return ((Integer)d.age).compareTo(d1.age);
