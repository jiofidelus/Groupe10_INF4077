# Groupe10_INF4077

1-installation des apks 

les apk de du projet sont dans le dossier "apk" 

*coleriapp ionic.apk (est la version cross)

*coleriapp native.apk (est la version native)

2-installation des la version ionic

*installer nodejs

*clone du dossier "src ionic"

*installation de ionic 5

*aller dans le dossier du projet et installer les packages avec la commande "npm install"

*lancer lapplication avec la commande "ionic serve"

3-installation de la version native

*install android studio+sdk 

*clone du dossie "application mobile native (code source)"

*allez dans android studio et ouvrir le projet 

4-installation de la version angular 

*installer nodejs

*clone du dossier "choleriaapp angular"

*installer angular 10

*aller dans le dossier du projet et installer les packages avec la commande "npm install"

*lancer lapplication avec la commande "ng serve"

5-intallation de la version backend

le backend de lapplication est actuelement deployer sur heroku  

lien de lapplication :(https://tpmasterun.herokuapp.com/)

-avec heroku

Installez la CLI Heroku

Téléchargez et installez la CLI Heroku.

Si vous ne l'avez pas déjà fait, connectez-vous à votre compte Heroku et suivez les invites pour créer une nouvelle clé publique SSH.

 $ heroku login
 
 Cloner le référentiel

Utilisez Git pour cloner le code source de tpmasterun sur votre machine locale.

$ heroku git:clone -a tpmasterun

$ cd tpmasterun

Déployez vos modifications

Apportez quelques modifications au code que vous venez de cloner et déployez-les sur Heroku à l'aide de Git.

$ git add .

$ git commit -am "make it better"

$ git push heroku master


-en local
cloner le dossier "excutable backend (jar)"
importer la base de donne "localhost.sql"

les configuration mysql
host:localhost
port:3306
bd name:tpapplicationm1
server.port=8080 de springboot

lancer le fichir .tpprojetbien-0.0.1-SNAPSHOT.jar


6-les videos de presentation 

ouvrir le dossier video


ROJET INF4077
I-Description du projet

Le Choléra est une maladie bactérienne  qui menasse le monde depuis les décennies ; Cette maladie lorsqu’il n’est pas surveiller provoque de grave catastrophe. Pour résoudre ce problème,nous allons développés une application qui doit permettre une surveillance rapide et efficace à temps réel du choléra dans le Cameroun ;Afin de pouvoir détecte les zones les plus risquées. Notre application doit s’appelle Choleraapp( qui signifie application sur le choléra) ;elle doit permettre de détecter les zones touchés par le choléra ceci grâce au données fournis par l’utilisateur.

II- Planification de notre projet


La planification de notre projet est définit sous forme de tableau, elle doit s’étendre sur une durée de 70 jours.

III-
   1) Les fonctionnalités
       a) Gestion du Patient 
           Le système permettre :
    •  A un patient de s’authentifier afin d’entrée ces informations qui seront stockées dans une base de donnée ;
    • De recevoir les résultats de ces examens par SMS via son téléphone ceci grâce à un signal (son) ;
    •  A recevoir des conseilles conseils sur son état de santé.
2) Gestion des symptômes
 Le système pourra à travers les données d’un patient de lui dire si il est infecté ou pas

3) Gestion des Médecins
    • Le médecin doit d’authentifié afin de visualiser, de prescrire une ordonnance.
    • Le système doit permettre l’ajout d’un médecin.
    • L’ajout d’un patient
    • Planifier et prendre une décision sur un patient
4) Gestion de la géolocalisation
    • Localiser les cas et de visualiser le phénomène du choléra dans l’étendu ;
    • Orienter les interventions des services d’urgence vers les cas présentant les symptômes aigus grâce à un système GPS.
IV- Les outils appropriés pour développer notre application
1) Back-end
    •  Eclipse (IDE): C’est un environnement de développent Java
    •  Spring boot(framework):Doit permettre de démarrer rapidement l’application ou service en fournissant les dépendances.

2) Devemobile et front-end
    • ionic
    • VSCODE STUDIO (IDE)
    • cordova 
    • angular
V- Les Entités de l’application
    • Personne : une personne ici peut être soit un médecin, soit un patient et ils pourront effectués des taches précises.
    • Consultation : Cette entité doit permettre à un Patient de se faire consulter par un médecin.
    • User: Un user est un utilisateur du système
    • Droit: Cette entité doit nous permettre de donner les droits d’accès à chaque user pour des mesures de sécurité.
