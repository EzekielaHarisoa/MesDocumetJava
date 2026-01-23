public class Etudiant extends Personne{
    private double moyenne;
    public Etudiant(String nom, int age, double moyenne) {
        super(nom,age);
        this.moyenne=moyenne;
    }
    public double getMoyenne(){ return moyenne;}

    @Override
    public void afficheInfo() {
        super.afficheInfo();
        System.out.println((moyenne >=10? "admis":"nom admis")+ "moyenne : "+ moyenne);
        
    }
    


}