package mypackage ;
 public class Ship extends Vehicle implements Flyable
{
 public Ship(){
    this.mouvementSpeed=16;
 }

 @Override
  public void moveXY(int x, int y) 
  {
     System.out.println("le navire brasse les flotes et se deplace en "+ x+ ","+ y);
  }


//  @Override
//   public void boost(int x) 
//   {
//      System.out.println("le navire augment de vitesse a  "+ x + "km/h");
//   }
  
//  @Override
//  public void test(){
//    System.out.println("je test mon test");
//  }

 @Override
 public void fly() 
 {
   System.out.println("je vole");

 }
 
}