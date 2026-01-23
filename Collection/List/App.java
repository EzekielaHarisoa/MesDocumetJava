
import java.util.ListIterator;
import java.util.Stack;



/** perme t de travailler sur 
 *   > les ifos ordonné
 *   > acceptent des valeurs nul 
 *   > accepte les  doublons
 * 
 * ArrayList: moono-thread, acces direct
 * LinkedList:
 * Vector: multi-thread, acces direct
 * Stack: heritiere de Vector
 * 
 * capacité != taille

 */
public class App
{
    public static void main(String[] args)
     {
        Stack<Cat> group= new Stack<Cat>();

       Cat c1 =new Cat("man");
       Cat c2 =new Cat("pan");
       Cat c3 =new Cat("kan");
       
        group.push(c1);
        group.push(c3);
        group.push(c2);
       
       ListIterator<Cat> li= group.listIterator();

       while (li.hasNext()) 
       {
           li.next().miol();         
       }

       System.out.println("Sommet " + group.peek() );
       group.peek().miol();
        


    }
} 