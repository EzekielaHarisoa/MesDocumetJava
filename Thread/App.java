
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class App{
    /**
     * newSingleThread
     * newCachedThreadPool : traitement rapide , dynamiqye , asynchrone
     * newFixedThreadPool : traitement rapide , dynamiqye , asynchrone
     * 
     */
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();

        Runnable task1 = () ->{
            for (int i = 0; i <5 ; i++){
               System.out.println(i);
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
               }
            }
        };
        Runnable task2 = () ->{
            for (int i = 0; i <10 ; i++){
               System.out.println(i);
               try {
                   Thread.sleep(2000);
               } catch (Exception e) {
               }
            }
        };

        ex.execute(task1);
        ex.execute(task2);

        ex.shutdown();

    }
}