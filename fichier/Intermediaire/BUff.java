import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class BUff {
    public static void main(String[] args) {

        Path path = Paths.get("data.txt");
        Charset c = Charset.forName("UTF-8");
        StandardOpenOption mode = StandardOpenOption.CREATE;

        try( BufferedWriter writer = Files.newBufferedWriter(path,c,mode))
        {
             writer.write("Bonjour Java");
             writer.write("Bonjour Java");

             writer.newLine();
             writer.write("est la meilleur langage");
             writer.close();

             BufferedReader reader= Files.newBufferedReader(path);
             System.out.println(reader.readLine()+"\n");
        
        }  
        catch(IOException e)
        {
            System.out.println("Erreur: " + e.getMessage());
        }


     }
}
