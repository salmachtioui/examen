# examen
# Gestion du Stockage avec Spring Boot
Ce projet a pour objectif de simplifier la gestion des articles et des catégories dans un système de stockage. Il offre un service web doté de fonctionnalités essentielles pour la gestion des informations des articles, y compris leur catégorie et leur date de production.

# Objectif
L'objectif principal de ce service web est de fournir une plateforme simple et efficace pour la gestion des articles et des catégories dans un système de stockage. Le projet utilise Spring Boot, offrant une architecture robuste pour le développement de services web.

# Fonctionnalités Clés
- Gestion des Articles
- Ajout, consultation, mise à jour et suppression des informations des articles, notamment leur nom, catégorie, et date de production.
- Gestion des Catégories
- Classification des articles par catégorie pour une organisation efficace.
- Recherche des Articles
- Possibilité de rechercher des articles en fonction de la catégorie ou de la période de production.
#  Technologies Utilisées
- Spring Boot: Framework Java pour le développement d'applications Java.
- Spring Data JPA: Simplifie l'accès aux données en utilisant des annotations Java.
- Hibernate: Framework de persistance pour la gestion des entités.
- Spring MVC: Modèle-Vue-Contrôleur pour le développement de l'interface web.
# H2 Database: Base de données embarquée pour faciliter le développement et les tests.
-Configuration
Clonez le dépôt : git clone https://github.com/votre-utilisateur/stockage-service.git
Accédez au répertoire du projet : cd stockage-service
Lancez l'application : ./mvnw spring-boot:run
Assurez-vous d'avoir Java et Maven installés sur votre machine.

# Configuration de la Base de Données
Le projet est configuré pour utiliser une base de données H2 embarquée par défaut. Pour une utilisation en production, veuillez configurer une base de données appropriée dans le fichier application.properties.
![image](https://github.com/salmachtioui/examen/assets/147477621/674534f0-4c74-404d-a486-00286f4eab2f)
# Des screens pour ce projet :
. Test qulques code "CRUD " sur Swaggar/Postman :
# Pour Article :
. Affichage des articles :
![image](https://github.com/salmachtioui/examen/assets/147477621/c2fb9b96-6a76-48f0-8e2d-64c6b0d6be81)

. Suppression des articles :
![image](https://github.com/salmachtioui/examen/assets/147477621/ebf7f947-7d3e-4019-95a9-9ce40731f4d2)
- Avant :
![image](https://github.com/salmachtioui/examen/assets/147477621/a460c8cd-6a2a-456f-bdb6-248912d9d9ee)
 
- Apres:
![image](https://github.com/salmachtioui/examen/assets/147477621/c73cf0f4-7140-4a82-9ad7-7282116eb98d)

. Modification des articles :
- Avant :
![image](https://github.com/salmachtioui/examen/assets/147477621/a9445671-8a8b-4e8f-97de-c3fdfa74c826)
![image](https://github.com/salmachtioui/examen/assets/147477621/8328b6c3-a75d-4cb2-8050-772668fbf844)

-Apres :
![image](https://github.com/salmachtioui/examen/assets/147477621/817fafde-bb72-4d6f-856e-c83198d66b28)
![image](https://github.com/salmachtioui/examen/assets/147477621/c669d019-6c74-4457-a756-30cd400fd8eb)
. Ajout des articles :
![image](https://github.com/salmachtioui/examen/assets/147477621/baafd357-c52e-4c67-b27a-52c06864d70a)
# Pour categorie :
. Ajout des categories :
![image](https://github.com/salmachtioui/examen/assets/147477621/ea4482e9-4dda-4493-aac3-9684f43c0b22)
![image](https://github.com/salmachtioui/examen/assets/147477621/b3505cc7-e6a2-45b5-b194-79c13af325b6)
![image](https://github.com/salmachtioui/examen/assets/147477621/36af49b0-5cb0-4876-b865-980d856e738a)
. Suppression des categories :
![image](https://github.com/salmachtioui/examen/assets/147477621/8ba8a639-076c-40b0-9ff2-18f142dea5e7)
- Avant :
 ![image](https://github.com/salmachtioui/examen/assets/147477621/0caeb2cf-8f7a-478e-ba84-75077dce391a)
-Apres :
![image](https://github.com/salmachtioui/examen/assets/147477621/fb18a9ca-30a0-4be8-9cd8-be22b8a636dc)
 # Pour   :
 



