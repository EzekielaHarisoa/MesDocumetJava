
import java.util.Map;
import java.util.TreeMap;

public  class Main
{
    public static void main(String[] args) 
    {
        TreeMap<Integer,String> tm= new TreeMap<Integer,String>();
    /**les Entrer */
        tm.put(1, "Mark");
        tm.put(2, "luc");
        tm.put(3, "jhon");
        tm.put(4, "julie"); 
      
        System.out.println(tm.get(4)); 

        for(Map.Entry<Integer,String> ent: tm.entrySet())
        {
            System.out.println("cle : "+ ent.getKey() + "/ Valeur : "+ ent.getValue() );
        }

  
            
                  

    }
}