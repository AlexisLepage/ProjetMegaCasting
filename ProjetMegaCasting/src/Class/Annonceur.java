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
    private Information information;
    private Domaine domaine;

    public Annonceur(String nom_annonceur, Information information, Domaine domaine) {
        this.nom_annonceur = nom_annonceur;
        this.information = information;
        this.domaine = domaine;
    }

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

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

   
}

