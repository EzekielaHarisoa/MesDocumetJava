

package  kela.heritage;
public final class Pegasus extends  Horse{

    public Pegasus(String nom)
    {
        super(nom);
        this.mPosZ=100;
    }

    public void move(int x ,int y){
        super.move(x, y);
        System.out.println("Le pegas se deplace : (X= "+this.mPoseX+",  Y=" + this.mPoseY +")");

    }
 
    public void fly(int z){
       this.mPosZ=z;
       System.out.println("Le pegas vol  avec une hauteur de ( Z= "+this.mPosZ+")");
    }
   
    private  int mPosZ;


}