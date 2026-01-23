package kela.heritage;
public class Horse{
    
    public Horse(String nom)
    {

      this.nom=nom;
      this.mPoseX=50;
      this.mPoseY=50;

    }

    public void move(int x, int y)
    {
      this.mPoseX=x;
      this.mPoseY=y;
      System.out.println("Le cheval de deplave : (X= "+this.mPoseX+",  Y=" + this.mPoseY +")");
    
    }

    protected  String nom;
    protected  int mPoseX;
    protected  int mPoseY;
}