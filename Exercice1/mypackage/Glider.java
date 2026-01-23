package mypackage;
public class Glider extends Vehicle implements  Flyable
{
    public Glider(String model,String mark)
    {
        this.modele=model;
        this.marque=mark;
        this.type="Glider";
    }

    @Override
    public void move(int x, int y) 
    {
        System.out.println("The glider is moving to coordinates (" + x + ", " + y + ")");
    }

    @Override
    public void taille(String tai) 
    {
        System.out.println("The glider's size is: " + tai);
    }

    @Override
    public void vitesse(int v) 
    {
        System.out.println("The glider's speed is: " + v);
    }

    @Override
    public void fly(String facon) 
    {
       System.out.println("I fly with a "+ facon);
    }
}