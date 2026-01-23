package mypackage;

public class  Cottage extends Building implements Flyable
{ 
    public Cottage(){
        System.out.println("Parcelle en place ...");
    }

    @Override
    public  void build(String materiel) 
    {
        System.out.println("Construction du batiemant en " + materiel); 
    }


    // @Override 
    // public void boost(int x) 
    // {
    //  System.out.println("le cottage augment de vitesse a  "+ x + "km/h");
    // }

    @Override
    public void fly() {
        System.out.println("le cottage vole avec des ailes en bois");
    }

}