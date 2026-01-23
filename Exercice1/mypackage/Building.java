package mypackage;
public abstract class Building
{
  protected String type;
  private String nom;

  public void setNom(String n)
  {
    if(n.startsWith("z")){ this.nom = n;}
  }
  public String getNom()
  { 
    return nom;
  }
  abstract void build( String materiel );
  abstract void nbrEtage( int nbn );
  public void presentation()
  {
    System.out.println("je suis une maison de type: ".concat(type));
  };



}
