
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Appl{
    /**
     * isDone()
     * isCaled(()
     * get()
     * cancel()
     */
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        
        Runnable task1 = ()->{
           for (int i = 0; i < 5; i++) {
               System.out.println(i);
           
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
           }
           }
        };

        Runnable task2 = ()->{
           for (int i = 0; i < 9; i++) {
               System.out.println(i);
           
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
           }
           }
        };

        Future<String> fut1 = ex.submit(task1,"je suis kela ,j'ai fini");
        Future<String> fut2 = ex.submit(task2,"je suis mimi, j'ai fifi");

        while(!fut1.isDone() || !fut2.isDone()){
            System.out.println("On attend ...");
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

        ex.shutdown();
    }
}