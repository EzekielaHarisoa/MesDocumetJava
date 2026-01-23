# String = tableau de carachtere
  * une class immuable (contennue non modifiable)
  * s1.concat(" ").concat(s2) -> plus rapide que s1+" "+s2
  * length()
  * toUpperCase()
  * toLowercase()
  * trim( ) :  enleve tout les espaces
  * replace(<old>,<new>)
  * charAt(<indice>) 
  * substring(<indexD>,<indexD>): extraction de chainne 
   * s1.equals(s2): verifier sy deux objet sont de meme type -> retourne un boolean
   * s1.compareTo(s2): compare le code ASCII    return 0 si vrai  et nbr ,negatif si faux

  >StringTokenizer(s,"/",true): StringTokenizer Z= new StringTokenizer(<string>);
    * Z.hasMoreToken();
    * Z.nextString();

  >  StringBuilder(asynchrone)
       monothread
  >  StringBuffer(synchronisé, thread-safe) 
       multiThread

     StringBuilder Z=new StringBuilder(<String>); =====> ce sont des type immuable
    * Z.length()
    * Z.capacity() :
    * Z.append(<String>) :ajoute les le String a la fin de la String z ie Z+ string
    * Z.insert(<index>,<String>): inserer une String à l'indece preferer