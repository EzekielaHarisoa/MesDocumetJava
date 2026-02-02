
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) throws IOException {
        int port = 8585;

        try( ServerSocket svs = new ServerSocket(port))
         {
            System.out.println("le serveur est demarer sur le port : "+port+" ");

            Socket svc = svs.accept();
            System.out.println("Connection d'un client accepter");
         
            BufferedReader reader = new BufferedReader(new InputStreamReader(svc.getInputStream()));
            PrintWriter writer = new PrintWriter(svc.getOutputStream(),true);
            
            String message;
            while((message = reader.readLine())!=null )
            {
                System.out.println("Voici les message du client : " + message);

                if(message.equalsIgnoreCase("exit"))
                {
                    System.out.println("Fermeture de la connexion avec le client");
                    svc.close();
                    break;
                }
                writer.println("Message bien  recu par le serveur");

            }
          
        } catch (Exception e) {
            System.out.println("[ERREUR]" + e);
        }

    }
}