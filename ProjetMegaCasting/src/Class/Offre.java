/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;

/**
 *
 * @author
 * Alexis
 */
public class Offre {
    private int id_offre;
    private String int_offre;
    private String ref_offre;
    private Date date_offre;
    private int duree_offre;
    private Date date_deb_offre;
    private String loc_offre;
    private String desc_poste_offre;
    private String desc_profil_offre;
    private Annonceur annonceur;
    private Contrat contrat;
    private Metier metier;
    private Domaine domaine;
    private Diffuseur diffuseur;
    private Media media;

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public String getInt_offre() {
        return int_offre;
    }

    public void setInt_offre(String int_offre) {
        this.int_offre = int_offre;
    }

    public String getRef_offre() {
        return ref_offre;
    }

    public void setRef_offre(String ref_offre) {
        this.ref_offre = ref_offre;
    }

    public Date getDate_offre() {
        return date_offre;
    }

    public void setDate_offre(Date date_offre) {
        this.date_offre = date_offre;
    }

    public int getDuree_offre() {
        return duree_offre;
    }

    public void setDuree_offre(int duree_offre) {
        this.duree_offre = duree_offre;
    }

    public Date getDate_deb_offre() {
        return date_deb_offre;
    }

    public void setDate_deb_offre(Date date_deb_offre) {
        this.date_deb_offre = date_deb_offre;
    }

    public String getLoc_offre() {
        return loc_offre;
    }

    public void setLoc_offre(String loc_offre) {
        this.loc_offre = loc_offre;
    }

    public String getDesc_poste_offre() {
        return desc_poste_offre;
    }

    public void setDesc_poste_offre(String desc_poste_offre) {
        this.desc_poste_offre = desc_poste_offre;
    }

    public String getDesc_profil_offre() {
        return desc_profil_offre;
    }

    public void setDesc_profil_offre(String desc_profil_offre) {
        this.desc_profil_offre = desc_profil_offre;
    }

    public Annonceur getAnnonceur() {
        return annonceur;
    }

    public void setAnnonceur(Annonceur annonceur) {
        this.annonceur = annonceur;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public Metier getMetier() {
        return metier;
    }

    public void setMetier(Metier metier) {
        this.metier = metier;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Diffuseur getDiffuseur() {
        return diffuseur;
    }

    public void setDiffuseur(Diffuseur diffuseur) {
        this.diffuseur = diffuseur;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Offre(String int_offre, String ref_offre, Date date_offre, int duree_offre, Date date_deb_offre, String loc_offre, String desc_poste_offre, String desc_profil_offre, Annonceur annonceur, Contrat contrat, Metier metier, Domaine domaine) {
        this.int_offre = int_offre;
        this.ref_offre = ref_offre;
        this.date_offre = date_offre;
        this.duree_offre = duree_offre;
        this.date_deb_offre = date_deb_offre;
        this.loc_offre = loc_offre;
        this.desc_poste_offre = desc_poste_offre;
        this.desc_profil_offre = desc_profil_offre;
        this.annonceur = annonceur;
        this.contrat = contrat;
        this.metier = metier;
        this.domaine = domaine;    
    }

   
}
