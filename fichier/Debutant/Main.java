import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class  Main
{
    public static void main(String[] args) 
    {

      try 
      {
        //
         BufferedReader reader = new BufferedReader(new  FileReader("Note.md"));
         String line;

         while((line = reader.readLine())!= null)
         {
            System.out.println(line);
         }
         reader.close();

      } 
      catch (IOException e) 
      {
        System.out.println("il y a une erreur " + e.getMessage());
      }
    }
}