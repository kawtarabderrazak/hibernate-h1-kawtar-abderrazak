# hibernate-h1-kawtar-abderrazak
 Description
Ce projet est une application de gestion des produits développée en Java en utilisant Hibernate et MySQL. L'application permet de gérer les produits (création, modification, suppression) ainsi que d'afficher des listes spécifiques de produits. L'objectif est de manipuler des entités et d'utiliser Hibernate pour interagir avec une base de données MySQL.

Fonctionnalités
L'application propose les fonctionnalités suivantes :

Création d'un produit : Insertion de nouveaux produits dans la base de données.
Affichage des produits : Récupération et affichage de tous les produits disponibles.
Recherche par ID : Affichage des informations d'un produit spécifique à partir de son identifiant.
Suppression d'un produit : Suppression d'un produit de la base de données.
Mise à jour d'un produit : Modification des informations d'un produit existant.
Filtrage par prix : Affichage des produits dont le prix est supérieur à une valeur donnée (100 DH).
Filtrage par date : Affichage des produits commandés entre deux dates saisies au clavier.
Prérequis
NetBeans IDE ou tout autre IDE supportant Java.
Java Development Kit (JDK) 1.8 ou supérieur.
MySQL pour gérer la base de données.
Hibernate-JPA pour la gestion des entités.
Pilote JDBC de MySQL pour la connexion avec la base de données.
Structure du Projet
Package ma.projet.entity : Contient l'entité Produit.
Package ma.projet.config : Contient le fichier de configuration hibernate.cfg.xml.
Package ma.projet.util : Contient la classe utilitaire HibernateUtil pour la gestion de la session Hibernate.
Package ma.projet.dao : Contient l'interface IDao définissant les méthodes CRUD.
Package ma.projet.service : Contient la classe ProduitService implémentant les opérations CRUD définies par IDao.
Classe de test : Contient les scénarios de test pour créer, afficher, modifier et supprimer des produits, ainsi que les recherches avancées.
Étapes d'Installation et d'Exécution
Créer le projet Java sous NetBeans :

Nommer le projet "H1".
Ajouter les bibliothèques nécessaires : Hibernate-JPA et le Pilote JDBC MySQL.
Créer l'entité Produit :

Ajouter la classe Produit dans le package ma.projet.entity avec les annotations Hibernate (@Entity, @Id, @GeneratedValue, @Column, @Table).
Configurer la base de données :

Créer une base de données MySQL nommée "H1".
Configurer la connexion à la base de données dans le fichier hibernate.cfg.xml (package ma.projet.config).
Créer la classe utilitaire HibernateUtil :

Implémenter la classe dans le package ma.projet.util pour gérer la session Hibernate via SessionFactory.
Implémenter le service produit :

Créer la classe ProduitService dans le package ma.projet.service qui implémente l'interface IDao pour les opérations CRUD (ajouter, modifier, supprimer, afficher).
Exécution des scénarios de test :

Créer cinq produits.
Afficher tous les produits.
Afficher les informations du produit avec l'ID = 2.
Supprimer le produit avec l'ID = 3.
Modifier le produit avec l'ID = 1.
Afficher les produits avec un prix supérieur à 100 DH.
Afficher les produits commandés entre deux dates saisies par l'utilisateur.
Exécution des Tests
Exécuter les tests dans la classe de test pour vérifier le bon fonctionnement de l'application.
Utiliser les méthodes implémentées dans ProduitService pour valider chaque fonctionnalité.











