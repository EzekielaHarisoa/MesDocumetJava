public class Main{
    public static void  printTab(int[] t){
      for (int ele : t) {
          System.out.println(ele);
      }
    }
    public static void main(String[] args) {
//     for(int i=0; i<tab.length;i++){
//         System.out.println(tab[i]);
//     }
// //foreach
//     for (int ele : tab) {
//         System.out.print(ele);
//     }

    // int[][] tab2={
    //     {5,64,6},
    //     {0,25,8}
    // };

    
    // for (int[] i: tab2) {
    //  for (int j: i) {   
    //       System.out.println(j);
    //  }
    // }
            int[] tab={1,2,3,4};
            printTab(tab);

    }
} 