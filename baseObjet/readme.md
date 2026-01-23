# POO Java - Exercices Progressifs

## Exercice 1 : Classe Etudiant simple

Objectif : créer une classe de base et afficher les informations

* Créer une classe `Etudiant` avec les attributs `nom` (String), `age` (int), `moyenne` (double)
* Ajouter un constructeur pour initialiser ces attributs
* Ajouter une méthode `afficherInfo()` pour afficher toutes les informations d'un étudiant
* Tester dans une classe `Main`

## Exercice 2 : Encapsulation (Getters & Setters)

Objectif : protéger les données avec des getters et setters

* Rendre tous les attributs `private`
* Ajouter des getters pour lire les valeurs
* Ajouter des setters pour modifier les valeurs

  * Vérifier que `age >= 0`
  * Vérifier que `0 <= moyenne <= 20`
* Tester que l'objet reste cohérent dans `main`

## Exercice 3 : Validation stricte dans le constructeur

Objectif : empêcher la création d'un objet invalide

* Utiliser les setters dans le constructeur pour éviter la duplication de code
* Vérifier que les valeurs passées au constructeur respectent les règles (`age >= 0`, `0 <= moyenne <= 20`)
* Lever des exceptions (`IllegalArgumentException`) si les valeurs sont invalides

## Exercice 4 : Méthode métier

Objectif : créer une méthode pour la logique métier d'admission

* Ajouter une méthode `estAdmis()` : retourne true si `moyenne >= 10`, sinon false
* Ne pas créer de nouvel attribut pour stocker le résultat
* Tester la méthode dans `main`

## Exercice 5 : Surcharge de constructeurs et attribut static

Objectif : manipuler plusieurs constructeurs et un compteur d'objets

* Ajouter des constructeurs secondaires : sans moyenne (moyenne = 0) et sans âge et moyenne (age = 0, moyenne = 0)
* Ajouter un attribut static `nbrEtudiant` pour compter les étudiants créés
* Mettre à jour tous les constructeurs pour incrémenter `nbrEtudiant`
* Ajouter un getter static pour récupérer le nombre total d'étudiants
* Tester tous les constructeurs et le compteur dans `main`
