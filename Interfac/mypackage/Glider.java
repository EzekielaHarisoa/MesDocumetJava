
package mypackage;

public class Glider extends Vehicle
{

    public Glider()
    {
        this.mouvementSpeed=28;
    }

    @Override
    public void moveXY(int x, int y) 
    {
        System.out.println("le gleder brasse les flotes et se deplace en "+ x+ ","+ y);
    }

    @Override
    public void fly() 
    {

        System.out.println("le gleder vole sans carburant");
    }
  

}