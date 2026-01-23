import kelapackage.Lion;
import kelapackage.Tiger;

public class App{
    public static void main(String[] args) {
        Tiger ti = new Tiger();
        Lion li=new Lion();

        System.out.println("Je suis un " + ti.whoIam());
        
        ti.eat();
        ti.speak();
        
        System.out.println("Je suis un " + li.whoIam());

        li.eat();
        li.speak();        
    }
}