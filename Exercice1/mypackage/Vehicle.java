package mypackage;

public abstract class  Vehicle
{
    protected int speedMouvement;
    protected String marque;
    protected String modele;
    protected String type;
   

    public void prenentation()
    {
        System.out.println("Hello, this is a vehicle (  type:"+this.type+",  marque:"+this.marque+", \t modelle: "+this.modele+")");
    }

    abstract public void move(int x, int y);
    abstract public void taille(String tai);
    abstract public void vitesse(int v);



}