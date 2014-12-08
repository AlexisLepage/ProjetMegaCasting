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
public class Metier {
    private long id_metier;
    private String lib_metier;
 

    public long getId_metier() {
        return id_metier;
    }

    public void setId_metier(long id_metier) {
        this.id_metier = id_metier;
    }

    public String getLib_metier() {
        return lib_metier;
    }

    public void setLib_metier(String lib_metier) {
        this.lib_metier = lib_metier;
    }

    public Metier(String lib_metier) {
        this.lib_metier = lib_metier;
    }

    
}
