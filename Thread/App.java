
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class App{
    /**
     * newSingleThread
     * newCachedThreadPool : traitement rapide , dynamiqye , asynchrone
     * newFixedThreadPool : traitement rapide , dynamiqye , asynchrone
     * 
     */
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);

        Runnable task1 = () ->{
            for (int i = 0; i <3 ; i++){
               System.out.println(i + "tache 1");
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
               }
            }
        };
          Runnable task2 = () ->{
            for (int i = 0; i <3 ; i++){
               System.out.println(i + "tache 2");
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
               }
            }
        };
          Runnable task3 = () ->{
            for (int i = 0; i <3 ; i++){
               System.out.println(i + "tache 3");
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
               }
            }
        };
          Runnable task4 = () ->{
            for (int i = 0; i <3 ; i++){
               System.out.println(i + "tache 4");
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
               }
            }
        };
         Runnable task5 = () ->{
            for (int i = 0; i <3 ; i++){
               System.out.println(i + "tache 5");
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
               }
            }
        };

        Future fut1 = ex.submit(task1,"je suis chaton ");
        Future fut2 = ex.submit(task2,"je suis mimi ");
        // Future fut3 = ex.submit(task3,"je suis chaton ");
        // Future fut4 = ex.submit(task4,"je suis chaton ");
        // Future fut5 = ex.submit(task5,"je suis chaton ");

        while(!fut1.isDone() && !fut2.isDone()  ){
          System.out.println("en attend ...");
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
          }
        }
        if(fut1.isDone()){
            try {
                System.out.println(fut1.get());

            } catch (Exception e) {
            }
        }
         if(fut2.isDone()){
            try {
                System.out.println(fut2.get());

            } catch (Exception e) {
            }
        }
        System.out.println("tache fini");
        
        ex.shutdown();

    }
}