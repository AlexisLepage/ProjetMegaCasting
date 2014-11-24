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
public class Information {
    private long id_information;
    private String mail_information;
    private int tel_fixe_information;
    private int tel_port_information;
    private String rue_information;
    private String ville_information;
    private int cp_information;
    private String pays_information;

    public Information(String mail_information, int tel_fixe_information, int tel_port_information, String rue_information, String ville_information, int cp_information, String pays_information) {
        this.mail_information = mail_information;
        this.tel_fixe_information = tel_fixe_information;
        this.tel_port_information = tel_port_information;
        this.rue_information = rue_information;
        this.ville_information = ville_information;
        this.cp_information = cp_information;
        this.pays_information = pays_information;
    }

    public long getId_information() {
        return id_information;
    }

    public void setId_information(long id_information) {
        this.id_information = id_information;
    }

    public String getMail_information() {
        return mail_information;
    }

    public void setMail_information(String mail_information) {
        this.mail_information = mail_information;
    }

    public int getTel_fixe_information() {
        return tel_fixe_information;
    }

    public void setTel_fixe_information(int tel_fixe_information) {
        this.tel_fixe_information = tel_fixe_information;
    }

    public int getTel_port_information() {
        return tel_port_information;
    }

    public void setTel_port_information(int tel_port_information) {
        this.tel_port_information = tel_port_information;
    }

    public String getRue_information() {
        return rue_information;
    }

    public void setRue_information(String rue_information) {
        this.rue_information = rue_information;
    }

    public String getVille_information() {
        return ville_information;
    }

    public void setVille_information(String ville_information) {
        this.ville_information = ville_information;
    }

    public int getCp_information() {
        return cp_information;
    }

    public void setCp_information(int cp_information) {
        this.cp_information = cp_information;
    }

    public String getPays_information() {
        return pays_information;
    }

    public void setPays_information(String pays_information) {
        this.pays_information = pays_information;
    }
    
}
