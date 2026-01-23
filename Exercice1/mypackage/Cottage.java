package mypackage;
public class Cottage extends Building implements 
{
    String n=getNom();
    public Cottage(String nom)
    {
       this.n=nom;
    }

    @Override
    void build(String materiel) 
    {
        System.out.println("Je suis une maison fait en :".concat(materiel));
    }

    @Override
    void nbrEtage(int nb) 
    {
        System.out.println("Je suis une maison qui comporte ("+nb+")");
    }
    
}