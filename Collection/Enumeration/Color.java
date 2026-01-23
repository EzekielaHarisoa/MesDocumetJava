

public enum  Color
{
   RED("Rouge","FF0000"),
   GREEN("vert", "00FF00"),
   BLUE("bleu", "0000FF");

   private String name;
   private String hexValue;

   private Color(String name, String hexValue)
   {
     this.name=name;
     this.hexValue=hexValue;
   }

   public String toString()
   {
    return this.name;
   }
}