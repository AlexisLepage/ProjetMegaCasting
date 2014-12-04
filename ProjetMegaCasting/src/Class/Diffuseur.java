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
    private Information information;

    public long getId_diffuseur() {
        return id_diffuseur;
    }

    public void setId_diffuseur(long id_diffuseur) {
        this.id_diffuseur = id_diffuseur;
    }

    public String getNom_diffuseur() {
        return nom_diffuseur;
    }

    public void setNom_diffuseur(String nom_diffuseur) {
        this.nom_diffuseur = nom_diffuseur;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Diffuseur(String nom_diffuseur, Information information) {
        this.nom_diffuseur = nom_diffuseur;
        this.information = information;
    }

   
     
}
