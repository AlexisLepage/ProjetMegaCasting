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
public class Contrat {
    private int id_contrat;
    private String lib_contrat;

    public int getId_contrat() {
        return id_contrat;
    }

    public void setId_contrat(int id_contrat) {
        this.id_contrat = id_contrat;
    }

    public String getLib_contrat() {
        return lib_contrat;
    }

    public void setLib_contrat(String lib_contrat) {
        this.lib_contrat = lib_contrat;
    }

    public Contrat(String lib_contrat) {
        this.lib_contrat = lib_contrat;
    }
    
    
}
