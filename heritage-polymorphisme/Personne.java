public class Personne{
  private  String nom;
  private int age;

  public Personne(String nom,int age) {
        this.nom=nom;
        this.age=age;
  }

 //les getters 
  public String getNom(){ return nom; }
  public int getAge(){ return  age; }

  //methoàde affiche info
  public void afficheInfo(){
    System.out.println("Nom: " + this.nom + "\n" + "Age :"+this.age );
  }
  

}