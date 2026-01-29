public class Main extends  Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Je suis un treaitement");
    }
    public static void main(String[] args) {
        Main task1 = new Main();
        Main task2 = new Main();

        task1.start();
        task2.start();

      try {
        task1.join();
        task2.join();
        System.out.println("tou les taches sont finis");
      } catch (InterruptedException e) {
      }
        
    }
}