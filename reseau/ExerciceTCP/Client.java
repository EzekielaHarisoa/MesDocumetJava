
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("veuillmer identifier votre connection : \n Port: ");
        int port = sc.nextInt();
        sc.nextLine();
        System.out.print("  Host : ");
        String host = sc.nextLine();
        String hafatra, hafatraAlefa;

        try {
           
            Socket soc = new Socket(host,port);
            System.out.println("Connection au serveur reussi");
           
            OutputStreamWriter sortie = new OutputStreamWriter(soc.getOutputStream());
            System.out.println("Vuillez entrer votre message :");
            
            BufferedReader msg = new BufferedReader(new InputStreamReader(System.in));
           
            int fin =0;
           
            do { 
              hafatra = msg.readLine();
              hafatraAlefa = hafatra + "\n";

              sortie.write(hafatraAlefa);
              sortie.flush();
              if(hafatra.contains("fermer")){
                fin = 1;
                break;
              }

            } while (fin == 0);
            soc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}