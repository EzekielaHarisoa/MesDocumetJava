# newSingleThread
  > 1 seul thread 
  > les taches s'execute une par une
  > ordre garantie

  => Utilisation :
      * Logs
      * Ecriture Fichier
      * Acces a un ressource unique

# newFixedThreadPool
  > le nombre de THread fixé
  > très stable
  > les taches en trop attendent
  
  => Utilisation :
       * backend
       * serveur
       * appele BD
       * API
# newCachedThreadPool
  > creer des threads à la demande
  > peut etre creer beaucoup
  > reutiliser les threads
  > dangereux si mal utiliser

  => Utilisation :
        * tache courtes
        * pics de charge
        * test
