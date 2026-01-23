
import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
     {
        ArrayDeque<Integer> adq=new ArrayDeque<Integer>();
        adq.addFirst(4);
        adq.addLast(15);
        adq.addLast(0);
        adq.removeFirst();
        // // Consultation sans suppression
        // System.out.println(adq.peek()); 
        // System.out.println(adq.poll());
        // System.out.println(adq.poll());
        // System.out.println(adq.poll());
        // System.out.println(adq.poll());
        // System.out.println(adq.poll());

        // System.out.println(adq);

        Iterator<Integer> it= adq.iterator();
        while(it.hasNext())
             System.out.println(it.next());



    }
}