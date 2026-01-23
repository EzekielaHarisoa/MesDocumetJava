
import java.io.IOException;
import java.util.Scanner;
public  class App{
    public static void main(String[] args) throws IOException {
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new  BufferedReader(isr);

        // System.out.println("Comment t'appel tu?");
        // String name = br.readLine();
        // System.out.println(name);

        Scanner src= new Scanner(System.in);
        System.out.print("le numero du game :");
        int game_level=src.nextInt();
        System.out.println(game_level);





    }
}