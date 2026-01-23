# Fichiers en Java — File / Path / Files

## 1️⃣ Concepts essentiels

- **File**   → informations + gestion du fichier
- **Path**   → représentation du chemin
- **Files**  → opérations sur fichiers (lire / écrire / copier / déplacer / supprimer)
- **NIO**    → API moderne (recommandée)

---

## 2️⃣ Classe `Files` (java.nio.file)

### 📄 Création / Suppression

- `Files.exists(Path)` → vérifier l’existence
- `Files.createFile(Path)` → créer un fichier
- `Files.createDirectory(Path)` → créer un dossier
- `Files.createDirectories(Path)` → créer dossiers imbriqués
- `Files.delete(Path)` → supprimer (exception si absent)
- `Files.deleteIfExists(Path)` → supprimer sans exception

---

### 📖 Lecture

- `readString(Path)` → lire tout le fichier
- `readAllLines(Path)` → lire ligne par ligne
- `newBufferedReader(Path)` → lecture avancée

---

### ✍️ Écriture

- `write(Path, byte[])` → écrire dans un fichier
- `newBufferedWriter(Path)` → écriture avancée

Options importantes :
- `APPEND` → ajouter sans écraser
- `CREATE` → créer si absent
- `TRUNCATE_EXISTING` → écraser le contenu
- `DELETE_ON_CLOSE`

---

### 📂 Gestion de fichiers

- `Files.copy(source, target)` → copier
- `Files.move(source, target)` → déplacer / renommer
- `Files.size(Path)` → taille du fichier
- `Files.isDirectory(Path)` → est-ce un dossier ?
- `Files.isRegularFile(Path)` → est-ce un fichier ?

---

## 3️⃣ Classe `File` (java.io)

- `exists()` → vérifier l’existence
- `createNewFile()` → créer un fichier
- `delete()` → supprimer
- `isFile()` → est-ce un fichier ?
- `isDirectory()` → est-ce un dossier ?
- `mkdir()` → créer un dossier
- `mkdirs()` → créer dossiers imbriqués
- `list()` → lister les noms
- `listFiles()` → lister les fichiers

---

## 4️⃣ Classe `Path` (java.nio.file)

- `getFileName()` → nom du fichier
- `getParent()` → dossier parent
- `getRoot()` → racine
- `toAbsolutePath()` → chemin absolu

---

## 5️⃣ Logique de lecture / écriture (à comprendre)

- `write()` → écrase par défaut
- `APPEND` → ajoute sans supprimer
- `readString()` → lit tout le fichier
- `readAllLines()` → retourne une liste de lignes

---

## 6️⃣ À mémoriser absolument

- `Path + Files` = API moderne
- Toujours gérer les exceptions (`IOException`)
- Tester l’existence avant créer / supprimer
- Préférer `deleteIfExists()` pour éviter les erreurs
# Concernant File et Path !File  → info + gestion fichier Path  → chemin Files → lire / écrire / copier / supprimer NIO   → moderne
