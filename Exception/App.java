public class App{
      static void verifAge(int age){
      if(age<18){
        throw new  ArithmeticException("Acces refusé , age doit etre superieur à 18");
      }else{
        System.out.println("Bravo, tu es majeur");
      }
      }
      static void tab() {
        int i[] = {1,2,3,4,5,6};
        for (Integer il : i) {
            System.out.println(il);
        }
      
      }
      public static void main(String[] args){
         int age = 15;
         try {
              verifAge(age);

         } finally {
           tab();

         }

      }
    }
