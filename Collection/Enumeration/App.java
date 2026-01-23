class App{
    public static void main(String[] args) {
        // Color c =Color.BLUE;
        // // Color c2= Color.BLUE;

        // // if(c2==c){
        // //   System.out.println(true);
        // // }
        //   System.out.println(c);
        //   try
        //   {
        //               System.out.println(c.valueOf("BLUE"));
        //   }
        //   catch( Exception e)
        //   {
        //     System.out.println("Il y a une erreur ".concat(e.getMessage()));
        //   }

          for(Color c : Color.values())
          {
             System.out.println(c);
          }


    }
}