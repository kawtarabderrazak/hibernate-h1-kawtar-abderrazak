/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProduitService produitService = new ProduitService();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Lire la date de début
            System.out.print("Entrez la date de début (dd/MM/yyyy) : ");
            Date dateDebut = dateFormat.parse(scanner.nextLine());

            // Lire la date de fin
            System.out.print("Entrez la date de fin (dd/MM/yyyy) : ");
            Date dateFin = dateFormat.parse(scanner.nextLine());

            // Étape 1 : Créer cinq produits avec les dates saisies
            Produit p1 = new Produit("Samsung", "Ref123", new Date(), 2000.0, "Samsung Galaxy S21", dateDebut, dateFin);
            Produit p2 = new Produit("Apple", "Ref124", new Date(), 3000.0, "iPhone 12", dateDebut, dateFin);
            Produit p3 = new Produit("Huawei", "Ref125", new Date(), 1500.0, "Huawei P40", dateDebut, dateFin);
            Produit p4 = new Produit("Sony", "Ref126", new Date(), 1200.0, "Sony Xperia 5", dateDebut, dateFin);
            Produit p5 = new Produit("Xiaomi", "Ref127", new Date(), 900.0, "Xiaomi Mi 11", dateDebut, dateFin);

            produitService.create(p1);
            produitService.create(p2);
            produitService.create(p3);
            produitService.create(p4);
            produitService.create(p5);

            // Étape 2 : Afficher la liste des produits
            System.out.println("\nListe de tous les produits :");
            List<Produit> produits = produitService.findAll();
            for (Produit p : produits) {
                System.out.println(p);
            }

            // Étape 3 : Afficher les informations du produit dont id = 2
            System.out.println("\nProduit avec ID = 2 :");
            Produit produitId2 = produitService.findById(2);
            if (produitId2 != null) {
                System.out.println(produitId2);
            } else {
                System.out.println("Produit avec ID 2 non trouvé.");
            }

            // Étape 4 : Supprimer le produit dont id = 3
            System.out.println("\nSuppression du produit avec ID = 3");
            Produit produitId3 = produitService.findById(3);
            if (produitId3 != null) {
                produitService.delete(produitId3);
                System.out.println("Produit supprimé.");
            } else {
                System.out.println("Produit avec ID 3 non trouvé.");
            }

            // Étape 5 : Modifier les informations du produit dont id = 1
            System.out.println("\nModification du produit avec ID = 1");
            Produit produitId1 = produitService.findById(1);
            if (produitId1 != null) {
                produitId1.setPrix(2500.0); // Modification du prix
                produitService.update(produitId1);
                System.out.println("Produit modifié : " + produitId1);
            } else {
                System.out.println("Produit avec ID 1 non trouvé.");
            }

            // Étape 6 : Afficher la liste des produits dont le prix est supérieur à 100 DH
            System.out.println("\nListe des produits avec un prix supérieur à 100 DH :");
            for (Produit p : produits) {
                if (p.getPrix() > 100) {
                    System.out.println(p);
                }
            }

            // Étape 7 : Afficher la liste des produits commandés entre deux dates lues au clavier
            System.out.println("\nEntrez la date de début pour la recherche (dd/MM/yyyy) :");
            Date dateDebutRecherche = dateFormat.parse(scanner.nextLine());

            System.out.println("Entrez la date de fin pour la recherche (dd/MM/yyyy) :");
            Date dateFinRecherche = dateFormat.parse(scanner.nextLine());

            System.out.println("\nListe des produits commandés entre " + dateDebutRecherche + " et " + dateFinRecherche + " :");
            for (Produit p : produits) {
                if (p.getDateAchat().after(dateDebutRecherche) && p.getDateAchat().before(dateFinRecherche)) {
                    System.out.println(p);
                }
            }

        } catch (ParseException e) {
            System.out.println("Erreur de format de date. Veuillez entrer la date au format dd/MM/yyyy.");
        } finally {
            scanner.close();
        }
    }
}
