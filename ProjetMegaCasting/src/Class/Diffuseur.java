/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author
 * Alexis
 */
public class Diffuseur {
    private long id_diffuseur;
    private String nom_diffuseur;
    private Information id_information;

    public long getId_diffuseur() {
        return id_diffuseur;
    }

    public void setId_diffuseur(int id_diffuseur) {
        this.id_diffuseur = id_diffuseur;
    }

    public String getNom_diffuseur() {
        return nom_diffuseur;
    }

    public void setNom_diffuseur(String nom_diffuseur) {
        this.nom_diffuseur = nom_diffuseur;
    }

    public Information getId_information() {
        return id_information;
    }

    public void setId_information(Information id_information) {
        this.id_information = id_information;
    }

    public Diffuseur(String nom_diffuseur, Information id_information) {
        this.nom_diffuseur = nom_diffuseur;
        this.id_information = id_information;
    }
     
}
