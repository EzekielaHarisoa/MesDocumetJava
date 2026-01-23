* BufferedReder : permet de lire des chaine de charactere
     synchrone
     thread-safe
     lecture de chaine de caract
     tampon de 8192 caractere
     > read() :lire une caractere
     > readLine() :lire une chaine
     > skip(N) :ignore N caracter

* Scanner : plus lente que buffered reader 
     asynchrone
     not thread-safe
     lecture de donné + parsing de donné 
     tampon de 1024 caractere
     > nextLine()
     > nextInt()
     > nextFloat()
     > nextChar()
     > nextByte()
     ...
