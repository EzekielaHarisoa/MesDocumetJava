
import java.io.FileWriter;
import java.io.IOException;

//creer un fichier et ecrire dedans
public class App 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter wr= new FileWriter("salut.txt", true);
            wr.write("Salut java boiot!");
            wr.close();

            FileWriter wr2= new FileWriter("Note.md");
            wr2.write("# Filewrite "+ "\n" +"> sert a creer un fichier");
            wr2.write("# .write "+ "\n" +"> sert a ecrrir dans  un fichier");
            wr2.close();

        }catch (IOException e)
        {
            System.out.println("Il y a une erreur"+ e.getMessage());
        }
    }
}