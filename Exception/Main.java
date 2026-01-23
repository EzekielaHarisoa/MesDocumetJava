
import java.util.*;
public class Main{
    public static void main(String[] args) {
        
       Scanner src=new Scanner(System.in);
       
       try 
       {
          System.out.print("votre date de naissance");
          int age=src.nextInt();
          System.out.println(age);
       }
       catch (InputMismatchException e)
       {
            System.out.println("La date de naissance est incorect");
       }
        catch (Exception e)
       {
        
       } 
       finally
       {
        System.out.println("Ok");
       }
             
    
    }
}