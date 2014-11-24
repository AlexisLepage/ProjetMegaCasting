/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Objects;

/**
 *
 * @author
 * Alexis
 */
public class Annonceur {
    private long id_anonceur;
    private String nom_annonceur;
    private Information id_information;

    public long getId_anonceur() {
        return id_anonceur;
    }

    public void setId_anonceur(long id_anonceur) {
        this.id_anonceur = id_anonceur;
    }

    public String getNom_annonceur() {
        return nom_annonceur;
    }

    public void setNom_annonceur(String nom_annonceur) {
        this.nom_annonceur = nom_annonceur;
    }

    public Information getId_information() {
        return id_information;
    }

    public void setId_information(Information id_information) {
        this.id_information = id_information;
    }

    public Annonceur(String nom_annonceur) {
        this.nom_annonceur = nom_annonceur;
    }
     
   
}

