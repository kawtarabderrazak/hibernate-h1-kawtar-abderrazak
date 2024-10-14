/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author PC
 */
 @Entity
 @Table(name="produit")
public class Produit {
@Id 
@GeneratedValue  
 private int id;
 private String marque;
 @Column (name = "reference")
 private String reference;
 @Temporal(TemporalType.DATE)
 private Date dateAchat;
 private double prix;
 private String designation;
 
 
  // Nouveaux attributs
    private Date dateDebut;
    private Date dateFin;

    public Produit(String marque, String reference, Date dateAchat, double prix, String designation,Date dateDebut,Date dateFin) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.designation = designation;
        this.dateFin=dateFin;
        this.dateDebut=dateDebut;
        
    }
 


    public Produit() {
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public String getReference() {
        return reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", reference=" + reference + ", dateAchat=" + dateAchat + ", prix=" + prix + ", designation=" + designation + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + '}';
    }
 

 
 
}
