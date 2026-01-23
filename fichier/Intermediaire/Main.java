
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class  Main
{
 public static void main(String[] args) 
 {
    //le fichier (existe deja)
    Path fileSource= Paths.get("newFile.truc");
    //le dossier (existe deja)
    Path machinDir = Paths.get("Machin");
    Path fileDest = machinDir.resolve("newFile.newtruc");   
    
    try
    {
      Files.move(fileSource, fileDest);
    }
    catch( IOException e)
    {
      System.out.println(e.getMessage());
    }
  }
}