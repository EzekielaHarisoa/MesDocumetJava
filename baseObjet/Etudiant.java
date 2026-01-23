public class Etudiant {
    private String nom;
    private int age;
    private double moyenne;
    private static int nbrEtudiant=0; 
    public Etudiant(String nom, int age, double moyenne) {
       this.setNom(nom);
       this.setAge(age);
       this.setMoyenne(moyenne); 
       //incrementer l'etudiant 
       nbrEtudiant++; 
    }
// ceci evite d'incrementer chaque contructeur
    public Etudiant(String nom, int age) {
       this(nom,age,0);
    }

    public Etudiant(String nom) {
       this(nom,0,0);
    }

//les setters
    public String getNom(){ return nom; }
    public int getAge(){ return  age; }
    public double getMoyenne(){ return moyenne; }

//les getters
    public void setNom(String nom){ 
        if (nom!=null && !nom.isEmpty()){
            this.nom=nom;
        } 
        else { 
           throw new IllegalArgumentException("Nom invalide"); 
        }
    }

    public void setAge(int age){
         if ( age >= 0 ) { this.age=age; } 
         else { throw new IllegalArgumentException("Age invalide");}
    }

    public void setMoyenne(double moyenne){
        if(moyenne >=0 && moyenne <= 20 ){this.moyenne=moyenne;}
        else{ throw new IllegalArgumentException("moyenne invalide");}
    }

    public void afficherInfo(){
        System.out.println("Nom: " + nom + "\n" + "Age :"+this.age + "\n"+"Moyenne: "+ this.moyenne );
    }
 
 //methode pour voir admis ouu pas
    public boolean  estAdmis(){
      if( moyenne>=(double)10 ){
        return true;
      }
        return false;
    }

// nombre d'etudiant 
    public static int getnbrEtudiant(){
      return nbrEtudiant;
    }

}