import mypackage.*;

public  class  App{
    public static void main(String[] args) 
    {
    //    Vehicle someVehicle[] = new Vehicle[3];
    //    Building someBuilding[]=new Building[2];

    //    someVehicle[0]= new Ship();
    //    someVehicle[1]= new Ship();
    //    someVehicle[2]=new Glider();

    //    someBuilding,0]= new Cottage();
    //    someBuilding[1]= new Cottage();

    //    someVehicle[0].moveXY(15,25);
    //    someVehicle[0].fly();
    //    someVehicle[1].moveXY(40, 50);
    //    someVehicle[1].fly();
    //    someVehicle[2].moveXY(5,10);
    //    someVehicle[2].fly();

    //    someBuilding[0].build("bois");
    //    someBuilding[1].build("paille");
    Flyable elements[]= 
    {
         new Ship(), 
         new Cottage() , 
         new Cottage()
    };
    for (Flyable elem : elements) {
        elem.fly();
    }

    //    System.out.println("Fin du programme.");

    }
}