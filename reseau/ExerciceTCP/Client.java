
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{
    public static void main(String[] args){
        int port = 8585;
        String host = "localhost";
        String hafatra, hafatraAlefa;
        try {
            Socket svc = new Socket(host, port);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(svc.getOutputStream(),true);   
            int fin=0;
            do { 
                hafatra = reader.readLine();
                hafatraAlefa = hafatra + "\n";
                writer.write(hafatraAlefa);
                writer.flush();
                if(hafatra.contains("exit")){
                    fin=1;
                    break;
                }

            } while (fin==0);
            svc.close();
                
            writer.println("Cocou, je suis un client 1");
            System.out.println( "la reponse du serveur est \t"+reader.readLine());
           
        } catch (Exception e) {
            System.out.println("[ERREUR]" + e);
        }
    }
}