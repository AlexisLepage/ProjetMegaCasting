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
    private int id_metier;
    private int lib_metier;

    public Metier(int lib_metier) {
        this.lib_metier = lib_metier;
    }

    public int getId_metier() {
        return id_metier;
    }

    public void setId_metier(int id_metier) {
        this.id_metier = id_metier;
    }

    public int getLib_metier() {
        return lib_metier;
    }

    public void setLib_metier(int lib_metier) {
        this.lib_metier = lib_metier;
    }
    
}
