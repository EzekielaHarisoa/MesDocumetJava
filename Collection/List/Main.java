
import java.util.Iterator;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args)
     {
        LinkedList<String> str= new LinkedList<>();

        str.add("kela");
        str.add("mimi");
        str.add("chaton");
        
        // str.addFirst("bomba");
        // System.out.println(str);
        // str.addLast("zoe");

        Iterator<String> li = str.iterator();
        System.out.println(li.next());
       


    }
}