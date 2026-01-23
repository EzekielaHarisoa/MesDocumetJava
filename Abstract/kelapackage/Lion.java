package kelapackage;

public class Lion extends  Felin{
    public Lion(){
        nom="lion";
    }
    
    @Override
    public void eat() {
       System.out.println("je mange un elephan");
    }
    public void speak(){
        System.out.println("je suis un nouveau spak editer");
    }
}