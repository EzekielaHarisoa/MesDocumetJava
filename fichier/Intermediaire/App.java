
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App 
{
    public static void main(String[] args) throws IOException
    {
        // creer un fichier avec Files
        Path path = Paths.get("Note.md");

        if (!Files.exists(path))
            Files.createFile(path);

        System.out.println("Fichier existe: " + Files.exists(path));
        System.out.println("Nom du fichier: " + path.getFileName());
        System.out.println("Taille du fichier: " + Files.size(path));
        
        //ecrire dans le fichier sans ecreaser (le troisime paramettre)
        Files.write(path, "# Concernant File et Path !".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, ("File  → info + gestion fichier " +
                   "Path  → chemin " +
                   "Files → lire / écrire / copier / supprimer " +
                   "NIO   → moderne\n").getBytes(StandardCharsets.UTF_8), 
            StandardOpenOption.APPEND);

        // creer un dossier
        Path dirPath = Paths.get("Dossier2.txt");
        Files.delete(dirPath);

      
    }
}