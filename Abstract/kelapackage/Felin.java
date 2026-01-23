 package kelapackage;

 public abstract class Felin{

  protected  String nom;
  
  //encapsulation
  public String whoIam(){
    return nom;
  }
 
// simple methode nom modifiable
  public void speak()
  {
    System.out.println("Je rusgis");
  }

 // methode abstraite
  abstract public void eat();

}