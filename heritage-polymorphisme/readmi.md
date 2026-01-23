
## Exercice 6 : Héritage et polymorphisme

Objectif : créer une hiérarchie et utiliser le polymorphisme

* Créer une nouvelle classe `Personne` : attributs `nom`, `age`, constructeur et méthodes `getNom()`, `getAge()`, méthode `afficherInfo()`
* Créer une nouvelle classe `Etudiant2` qui hérite de `Personne`, avec un attribut `moyenne`
* Redéfinir `afficherInfo()` pour afficher la moyenne et l'admissibilité (`moyenne >= 10`)
* Tester dans `main` : créer un tableau `Personne[]` contenant des `Personne` et `Etudiant2` et parcourir le tableau avec `afficherInfo()` pour vérifier le polymorphisme
* Ne pas toucher à la première classe `Etudiant` existante
* 