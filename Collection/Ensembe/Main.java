
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> hs= new TreeSet<Integer>();

        hs.add(15);
        hs.add(-4);
        hs.add(-9);
        hs.add(-2);
        hs.add(388);

        hs.add(400);
        
      

        System.out.println(hs.tailSet(150));
        System.out.println(hs.subSet(-4,20));


    }
}