/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
import Class.Contrat;
import Class.Domaine;
import Class.Metier;
import Class.Offre;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author
 * Alexis
 */
public class OffreDAO {
    private static Object id_offre;
    
    public static void creer(Connection cnx, Offre offre) throws Exception{
        Offre o = trouver(cnx, offre.getInt_offre(), offre.getRef_offre(), offre.getDate_offre(), offre.getDuree_offre(), offre.getDate_deb_offre(), offre.getLoc_offre(), offre.getDesc_poste_offre(), offre.getDesc_profil());
        if(o != null){
            throw new Exception(offre.getInt_offre() + " " + offre.getRef_offre() + " " + offre.getDate_offre() + " " + offre.getDuree_offre() + " " + offre.getDate_deb_offre() + " " + offre.getLoc_offre() + " " + offre.getDesc_poste_offre() + " " + offre.getDesc_profil() + " existe déjà !");
        }
        
        AnnonceurDAO.creer(cnx, offre.getId_annonceur());
        ContratDAO.creer(cnx, offre.getId_contrat());
        MetierDAO.creer(cnx, offre.getId_metier());
        DomaineDAO.creer(cnx, offre.getId_domaine());
        
        
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
            stmt.executeUpdate("INSERT INTO offre (int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_poste_offre, desc_profil_offre, id_annonceur, id_contrat, id_metier, id_domaine) "
                    + "VALUES ('" + offre.getInt_offre() + "'"
                    + ", '" + offre.getRef_offre() + "'"
                    + ", " + offre.getDate_offre() + ""
                    + ", " + offre.getDuree_offre() + "'"
                    + ", " + offre.getDate_deb_offre() + "'"
                    + ", " + offre.getLoc_offre() + "'"
                    + ", " + offre.getDesc_poste_offre() + "'"
                    + ", " + offre.getDesc_profil() + "'"
                    + ", " + offre.getId_annonceur().getId() + "'"
                    + ", " + offre.getId_contrat().getId() + "'"
                    + ", " + offre.getId_metier().getId() + "'"
                    + ", " + offre.getId_domaine().getId() + "'"
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_offre) FROM offre;");
            if (rs.next()){
                long id = rs.getLong(1);
                offre.setId_offre((int) id_offre);
            }
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
        
    }
    
    public static void modifier(Connection cnx, Offre offre) throws Exception{
        Offre o = trouver(cnx, offre.getInt_offre(), offre.getRef_offre(), offre.getDate_offre(), offre.getDuree_offre(), offre.getDate_deb_offre(), offre.getLoc_offre(), offre.getDesc_poste_offre(), offre.getDesc_profil());
        if(o != null){
            throw new Exception(offre.getInt_offre() + " " + offre.getRef_offre() + " " + offre.getDate_offre() + " " + offre.getDuree_offre() + " " + offre.getDate_deb_offre() + " " + offre.getLoc_offre() + " " + offre.getDesc_poste_offre() + " " + offre.getDesc_profil() + " existe déjà !");
        }
        
        AnnonceurDAO.creer(cnx, offre.getId_annonceur());
        ContratDAO.creer(cnx, offre.getId_contrat());
        MetierDAO.creer(cnx, offre.getId_metier());
        DomaineDAO.creer(cnx, offre.getId_domaine());
        
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("UPDATE offre SET"
                    
                    +" NOM = '" + personne.getNom() + "'"
                    +" PRENOM = '" + personne.getPrenom() + "'"
                    +" AGE = " + personne.getAge() + ""
                    +" WHERE ID = " + personne.getId()
            );
            
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    
    public static void supprimer(Connection cnx, Offre offre) throws Exception{
        Offre o = trouver(cnx, offre.getInt_offre(), offre.getRef_offre(), offre.getDate_offre(), offre.getDuree_offre(), offre.getDate_deb_offre(), offre.getLoc_offre(), offre.getDesc_poste_offre(), offre.getDesc_profil());
        if(o != null){
            throw new Exception(offre.getInt_offre() + " " + offre.getRef_offre() + " " + offre.getDate_offre() + " " + offre.getDuree_offre() + " " + offre.getDate_deb_offre() + " " + offre.getLoc_offre() + " " + offre.getDesc_poste_offre() + " " + offre.getDesc_profil() + " existe déjà !");
        }
        
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("DELETE FROM PERSONNE "
                    +" WHERE ID = " + personne.getId()
            );
            
            AdresseDAO.supprimer(cnx, personne.getAdr());
            
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    
    public static ArrayList<Personne> lister(Connection cnx){
        ArrayList<Personne> liste = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID, NOM, PRENOM, AGE, ID_ADR FROM PERSONNES");
            while(rs.next()){
                long id = rs.getLong("ID");
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                int age = rs.getInt("AGE");
                long idAdresse = rs.getLong("ID_ADR");
                
                Adresse adresse = AdresseDAO.trouver(cnx, idAdresse);
                
                Personne personne = new Personne(nom, prenom, adresse);
                personne.setAge(age);
                personne.setId((int) id);
                
                liste.add(personne);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex){
                }
        }
        return liste;
    }
    
    public static Offre trouver(Connection cnx, String ref_offre){
        Offre offre = null;
        Statement stmt = null;        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID, AGE, ID_ADR FROM PERSONNES WHERE Nom = '" + nom + "' AND Prenom = '" + prenom + "'");
            if(rs.next()){
                int id_annonceur = rs.getInt("id_annonceur");
                int duree_offre = rs.getInt("duree_offre");
                long id = rs.getInt("ID");
                Annonceur ann = AnnonceurDAO.TrouverAnnonceur(cnx, id_annonceur);
                Contrat con = ContratDAO.trouver(cnx, id_annonceur);
                Metier met = MetierDAO.trouver(cnx, id_metier);
                Domaine dom = DomaineDAO.trouver(cnx, id_domaine);
                offre = new Offre(int_offre, ref_offre, date_offre, null, date_deb_offre, loc_offre, desc_poste_offre, desc_profil);
                offre.setDuree_offre(duree_offre);
                offre.setId((int) id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex){
                }
        }
        return personne;
    }
}
