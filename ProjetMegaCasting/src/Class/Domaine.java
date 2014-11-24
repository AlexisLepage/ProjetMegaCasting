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
public class Domaine {
    private long id_domaine;
    private String lib_domaine;
    private Metier metier;
    private Annonceur annonceur;

    public long getId_domaine() {
        return id_domaine;
    }

    public void setId_domaine(int id_domaine) {
        this.id_domaine = id_domaine;
    }

    public String getLib_domaine() {
        return lib_domaine;
    }

    public void setLib_domaine(String lib_domaine) {
        this.lib_domaine = lib_domaine;
    }

    public Domaine(String lib_domaine) {
        this.lib_domaine = lib_domaine;
    }
    
    
}
