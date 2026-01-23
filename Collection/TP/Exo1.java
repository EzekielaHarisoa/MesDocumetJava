
import java.util.ArrayList;
import java.util.Collections;

class Exo1
{
    public static void main(String[] args)
    {
        ArrayList<String> listPays =new ArrayList<String>(4);

        listPays.add("Mada");
        listPays.add("france");
        listPays.add("USA");
        listPays.add("Kongo");

        // System.out.println("la collection contient "+ listPays.size() + " pays");
        // listPays.clear();
        // if(listPays.isEmpty()){
        //     System.err.println("Liste vide");
        // }
  
        listPays.remove(2);
        listPays.add("Gabon");
        for (String st : listPays) 
        {
            System.out.println(st);
        }

        Collections.sort(listPays);

        for (String st : listPays) 
        {
            System.out.println(st);
        }

    }
}