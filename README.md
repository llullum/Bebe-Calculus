# Bebe-Calculus


Pour lancer mon application il faut avoir la librairi javfx installé sur son pc.
Pour lancer le .jar:

On execute la commande: java -jar --module-path "chemin" --add-modules javafx.controls calculus.jar
Où "chemin" est le chemin complet du répertoire lib contenant JavaFX par exemple "C:\....\javafx-sdk-20.0.1\lib"

Pour lancé le code depuis un IDE:
Il faut aussi mettre la ligne --module-path "chemin" --add-modules javafx.controls dans la partie VM arguments dans la Run configuration.


Je suis désolé que vous deviez faire ceci pour devoir lancer mon application, je n'ai pas réussi à trouver le moyen de faire autrement.

Mon application est une application de calcul mental.

Il y a trois difficultés. Quand vous répondez une réponse fausse, vous perdez du temps.

Il y a 10 questions par round et chaque round sont chronométrés pour vous indiquer en combien de temps vous finissez un round.