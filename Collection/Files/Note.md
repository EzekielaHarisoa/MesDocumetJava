# PriorityQueue (Java)

## Définition
Implémentation de l’interface `Queue` basée sur une **file de priorité** (Heap).

## Propriétés
- ❌ Pas d’accès direct par index
- 🔢 Ordonnée (ordre naturel ou `Comparator`)
- 🔁 Accepte les doublons
- ⛔ Refuse les valeurs `null`
- 🔒 Pas thread-safe
- 🎯 Accès uniquement à l’élément prioritaire (tête)
- 🧠 Implémentée avec un **min-heap** par défaut

## Complexité
- Insertion (`add`, `offer`) : `O(log n)`
- Suppression (`poll`) : `O(log n)`
- Consultation (`peek`) : `O(1)`

## Méthodes de PriorityQueue

### add(E e)
- Ajoute un élément dans la file
- Lance une exception si l’ajout échoue
- Respecte la priorité (heap)

### offer(E e)
- Ajoute un élément dans la file
- Retourne `true` ou `false` (pas d’exception)
- Méthode recommandée pour les files

### peek()
- Retourne l’élément **le plus prioritaire**
- Ne supprime pas l’élément
- Retourne `null` si la file est vide

### poll()
- Retourne **et supprime** l’élément le plus prioritaire
- Retourne `null` si la file est vide

### remove()
- Supprime **et retourne** l’élément le plus prioritaire
- Lance une exception si la file est vide

### element()
- Retourne l’élément le plus prioritaire
- Ne supprime pas l’élément
- Lance une exception si la file est vide

### size()
- Retourne le nombre d’éléments dans la file

### isEmpty()
- Vérifie si la file est vide

### contains(Object o)
- Vérifie si un élément existe dans la file

### clear()
- Supprime tous les éléments

### iterator()
- Permet de parcourir les éléments
- ⚠️ Ne garantit PAS l’ordre de priorité

## Remarques
- L’itération **ne respecte pas l’ordre**
- Pour un max-heap → utiliser un `Comparator`
- Pour le multithreading → `PriorityBlockingQueue`


# ArrayDeque (Java) : plus rapide 
- ## Propriétés
- ❌ Pas d’accès direct par index
- 🔢 Ordonnée (ordre naturel ou `Comparator`)
- 🔁 Accepte les doublons
- ⛔ Refuse les valeurs `null`
- 🔒 Pas thread-safe
- 🎯 Accès uniquement à l’élément prioritaire (tête)
- 🧠 Implémentée avec un **min-heap** par défaut


# Methode surplus
- addFirst()
- addLast()
- removeFirst()
- removeLast()
- peekFirst()
- removeLastOccurence()