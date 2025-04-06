# To-Do List Application

## Description
Application web de gestion de tâches développée avec **React** pour le frontend et **Spring Boot** pour le backend. L'application permet à l'utilisateur de gérer ses tâches : ajouter, marquer comme terminées ou non terminées, et supprimer. Les tâches terminées sont affichées en vert et barrées pour une meilleure visibilité.

## Prérequis

Avant de commencer, vous devez avoir installé sur votre machine :
- **Node.js** (pour le frontend)
- **Java JDK** et **Maven** (pour le backend)
- **PostgreSQL** ou une autre base de données configurée pour Spring Boot (selon votre configuration)

## Installation

### Backend (Spring Boot)
1. Clonez ce projet :  
   ```bash
   git clone https://github.com/ton-utilisateur/to-do-list.git
   
Accédez au répertoire du backend :
cd backend

Compilez et exécutez le serveur Spring Boot :
mvn spring-boot:run

Le backend sera accessible sur http://localhost:8080.

Frontend (React)
Accédez au répertoire du frontend :
cd frontend

Installez les dépendances :
npm install

Lancez l'application React :
npm start

L'interface frontend sera disponible sur http://localhost:3000.

Fonctionnalités
Ajouter des tâches : Permet d'ajouter une nouvelle tâche à la liste.

Marquer comme fait/non fait : Permet de marquer les tâches comme complètes ou incomplètes.

Supprimer des tâches : Supprime une tâche de la liste.

Affichage dynamique : Les tâches terminées apparaissent en vert et barrées.

Technologies utilisées
Frontend : React, HTML, CSS

Backend : Spring Boot

Base de données : H2 ou PostgreSQL (selon la configuration)

### Explication rapide :
- **Backend (Spring Boot)** : Serveur qui gère les requêtes API pour les tâches (ajout, suppression, mise à jour).
- **Frontend (React)** : Interface utilisateur pour interagir avec le backend et afficher les tâches.
- **CSS** : Styles de base pour rendre l'application esthétique et intuitive.

Ce README fournit toutes les informations nécessaires pour installer et exécuter le projet localement, ainsi qu'une description de ses fonctionnalités principales.
