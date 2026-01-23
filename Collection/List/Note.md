# ArrayList et Vector possedent les meme fonctionnalité et meme methode 
==> la seul difference c que ArrayList (mono-thread) , et Vector (multi-thread)
==> optimiser pour la lecture 

# les methodes utiliser
  > add(), addAll()
  > remove(<index>)
  > clear()
  > capacity() :(celui qu'on met dans le (index));  reserver pour le vector
  > size() :avoir la taille 
  > collectiions.sort(): permet de ranger la liste
  > get(): parcourir l'element
  > set(<index>, objet) : ecrase l'objet a l'indice 0 et creer uneautre aubjet a sa plce

# LinkedList est comme ArrayList mais: 
  > LinkedList :il ast utiliser pour manipuer le tableau (CRUD), dynamique ( ne creer pas une autre tableau a chaque ajout ), Insertion rapide
  >ArrayList: Stocker et parcourir les donnée, pas dynamic
             
# methode 
  > les meme methodes que ArrayList car ils implements l'interface List 
  > addFirst(),  addLast
  > removeFirst()  , removeLast()       
  > getFirst()  , getLast()           

# ListIterator
  > sert a   
  > hasNext()
  > next()

# Stack: thread-safe (multi-thread)
  > puch() : ajouter
  > pop() : remove
  > peek() : recuperer le first element


==>> pour verifier si une collection est vide ou pas
  > isEmpty()
  > empty()  

==>> tout ces collection implements l'interface List