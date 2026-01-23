
import kela.heritage.Horse;
import kela.heritage.Pegasus;

public class App{
    public static void main(String[] args) {
        
        Horse h= new Horse("Tanos");
        h.move(150, 520);

        Pegasus p= new Pegasus("mart");
        p.move(25, 20);
        p.fly(540);

        if (p instanceof Pegasus)
          System.out.print("c'est un pegas");

    }
}