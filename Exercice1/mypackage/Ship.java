package mypackage;
public class Ship extends Vehicle implements Navigue
{
    public Ship(String model,String mark)
    {
        this.modele=model;
        this.marque=mark;
        this.type="Ship";
    }
  
    @Override
    public void move(int x, int y)
    {
        System.out.println("The ship is moving to coordinates (" + x + ", " + y + ")");
    }

    @Override
    public void taille(String tai) 
    {
        System.out.println("The ship's size is: " + tai);
    }

    @Override
    public void vitesse(int v) 
    {
        System.out.println("The ship's speed is: " + v);
    }

    @Override
    public void navir(String nav) 
    {
        System.out.println("je navigue avec un "+ nav);
    }
    
  
}