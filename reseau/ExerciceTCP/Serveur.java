
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class  Serveur{
    public static void main(String[] args) {
        int port=8585;
        try
        {
           ServerSocket sersoc = new ServerSocket(port);
           System.out.println("Le serveur se demare sur le port : "+port +"");
           Socket soc = sersoc.accept();
           System.out.println("Connection du client accepter");

           BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
           PrintWriter writer = new PrintWriter(soc.getOutputStream());

           String message;

           while(true){

             message = reader.readLine();

             if(message.contains("fermer"))
             {
                System.out.println("Deconnection du client");
                sersoc.close();
                soc.close();
                break;
             }

             System.out.println("Message bien recue");

           }

        }catch(Exception e){
           e.printStackTrace();
        }
    }
}