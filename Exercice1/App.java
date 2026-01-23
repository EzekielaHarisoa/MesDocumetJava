
import mypackage.Glider;
import mypackage.Ship;
import mypackage.Vehicle;



public class App{
    public static void main(String[] args) {
     Vehicle someVehicle[]= new Vehicle[3];
     someVehicle[0]= new Ship("2015", "paquet");
     someVehicle[1]= new Glider("2021", "R47");
     someVehicle[2]= new Glider("2025", "le marpice");
     
     someVehicle[0].prenentation();  

    }
}