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
public class Offre_Diffuseur {
    private int id_offre;
    private Diffuseur id_diffuseur;

    public Offre_Diffuseur(Diffuseur id_diffuseur) {
        this.id_diffuseur = id_diffuseur;
    }

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public Diffuseur getId_diffuseur() {
        return id_diffuseur;
    }

    public void setId_diffuseur(Diffuseur id_diffuseur) {
        this.id_diffuseur = id_diffuseur;
    }
    
}
