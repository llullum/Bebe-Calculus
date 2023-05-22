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


Pour le générateur de question, tous ce passe dans la classe Number.

Si l'utilisateur a choisi la difficulté facile, il n'y aura que des additions ou soustraction avec des nombres ne dépassant pas les 50.

Pour la difficulté moyenne, les nombres seront en général plus compliqué.

Pour la difficulté difficile, il y a aussi des multiplications, des divisions simples et la complexité des nombres ont encore plus augmenté.


Pour le générateur de réponse, 

4 nombres sont générés de manière aléatoire entre le résultat attendu +- un bound défini en fonction de la difficulté.

Un cinquième nombre "tricky" est généré de manière à avoir la même unité que le résultat et une dizaine proche.

Ce nombre remplacé parfois une des 3 propositions fausse mais pas tout le temps pour faire en sorte que l'utilisateur ne voie pas le pattern.

Pour finir, le résultat remplacera de manière aléatoire une des 4 propositions sauf celle du nombre "tricky"