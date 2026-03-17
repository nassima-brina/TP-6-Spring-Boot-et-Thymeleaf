# TP 6 — Application CRUD avec Spring Boot et Thymeleaf

📚 Cours  
Développement Jakarta EE : Spring

## Contexte

#### Ce TP s'inscrit dans le cadre du cours Développement Jakarta EE : Spring.  
#### Il constitue une mise en pratique complète des concepts Spring Boot, en abordant la création d'une application web CRUD complète avec persistance en base de données, validation des formulaires, et rendu côté serveur avec Thymeleaf.  
#### Le but est de maîtriser la configuration d'une application Spring Boot, l'utilisation de Spring Data JPA, la gestion des formulaires avec validation, et le templating dynamique avec Thymeleaf.

## Objectifs

#### - Configurer un projet Spring Boot avec Maven
#### - Mettre en place une entité JPA avec validation Bean Validation
#### - Créer un repository Spring Data JPA
#### - Développer un contrôleur MVC avec gestion des requêtes GET/POST
#### - Gérer les formulaires avec Thymeleaf (binding, validation, messages d'erreur)
#### - Afficher une liste dynamique avec suppression et modification
#### - Structurer une application web Spring Boot de manière claire et maintenable

## Technologies utilisées

#### - Spring Boot 3.5.x
#### - Java 21
#### - Spring Web
#### - Spring Data JPA
#### - Thymeleaf
#### - Hibernate Validator (spring-boot-starter-validation)
#### - MySQL Driver
#### - Maven

## 📁 Structure du projet

<img width="1301" height="942" alt="image" src="https://github.com/user-attachments/assets/f9736a6a-a6e9-4600-b781-900c48d5db83" />


## Installation et lancement

### 1. Prérequis
 ####  - Java 17 ou 21 installé  
 ####  - MySQL installé et lancé (base thymeleaf créée )  
 ####  - Maven installé

### 2. Lancer l'application


#### Depuis le dossier racine du projet
mvn clean install

#### Ou directement via l'IDE (IntelliJ / Eclipse / VS Code)
#### Puis exécuter la classe DemothymeleafApplication

#### L'application s'ouvre sur :
http://localhost:8081

## Fonctionnalités implémentées

### - Page d'accueil (/)
####   Affiche la liste complète de tous les utilisateurs avec les boutons **Modifier** et **Supprimer** pour chaque ligne.  
####   Si aucun utilisateur n'est enregistré dans la base de données, affiche le message clair :  
####  « Aucun utilisateur enregistré pour le moment » (ou « No users yet! » selon la langue choisie).


### - Ajout d'un utilisateur (/signup)  
 ####  Formulaire dédié avec les champs Nom et Email.  
####   Validation côté serveur via les annotations @NotBlank (Hibernate Validator).  
####   Les messages d'erreur s'affichent directement sous les champs concernés en cas de saisie invalide.

### - Modification d'un utilisateur (/edit/{id}) 
 ####  Charge les données existantes de l'utilisateur sélectionné et pré-remplit le formulaire.  
 ####  Sauvegarde les modifications après validation et redirige vers la liste.

### - Suppression d'un utilisateur (/delete/{id})  
  #### Supprime l'utilisateur correspondant à l'ID fourni.  
 ####  Opération confirmée par redirection vers la page d'accueil avec mise à jour immédiate de la liste.

## Aperçu de l'application

### Page d'accueil (liste vide)
![WhatsApp Image 2026-03-17 at 14 54 19](https://github.com/user-attachments/assets/f586dcd0-33a6-4a15-aa52-6e5a5fc308b9)


### Formulaire d'ajout d'un utilisateur

![WhatsApp Image 2026-03-17 at 14 55 57](https://github.com/user-attachments/assets/2f2e3fb3-0823-4137-aa33-350050b073f9)


### Liste des utilisateurs (avec données)
![WhatsApp Image 2026-03-17 at 14 57 18](https://github.com/user-attachments/assets/916bdc6c-9009-4589-9649-5066895a807e)

### base de donnes :

![WhatsApp Image 2026-03-17 at 14 58 35](https://github.com/user-attachments/assets/ee14ccc6-dfc8-4893-8691-3c71fb424912)

## Conclusion

Ce sixième TP m'a permis de comprendre et d'appliquer des notions essentielles du développement avec Spring Boot :

#### - La configuration automatique et rapide grâce aux starters (Web, Data JPA, Thymeleaf, Validation)
#### - La persistance des données avec Spring Data JPA et Hibernate (génération automatique des tables via ddl-auto=update)
#### - La gestion moderne des formulaires avec Thymeleaf : binding d'objets via th:object et th:field, affichage conditionnel des erreurs
#### - L'utilisation de Bean Validation (@NotBlank, @Email, etc.) et l'intégration fluide avec les formulaires web
#### - Le respect strict du pattern MVC : séparation claire entre entité (User), repository (UserRepository), contrôleur (UserController) et vues (templates/*.html)
#### - La structuration propre d'une application web full-stack Java avec rendu côté serveur



