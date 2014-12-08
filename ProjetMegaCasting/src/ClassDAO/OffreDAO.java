/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
import Class.Contrat;
import Class.Diffuseur;
import Class.Domaine;
import Class.Media;
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
    
    public static void CreerOffre(Connection cnx, Offre off) throws Exception{
        Offre o = TrouverOffre(cnx, off.getId_offre());
        if(o != null){
            throw new Exception(off.getInt_offre() + " existe déjà !");
        }      
        
        AnnonceurDAO.CreerAnnonceur(cnx, off.getAnnonceur());
        ContratDAO.CreerContrat(cnx, off.getContrat());
        MetierDAO.CreerMetier(cnx, off.getMetier());
        DomaineDAO.CreerDomaine(cnx, off.getDomaine());
        DiffuseurDAO.CreerDiffuseur(cnx, off.getDiffuseur());
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            
            if (off.getDiffuseur() == null && off.getMedia()!= null ){
               
               
            }
            
            stmt.executeUpdate("INSERT INTO offre (int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_poste_offre, desc_profil_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_diffuseur) "
                    + "VALUES ('" + off.getInt_offre()
                    + ", '" + off.getRef_offre() 
                    + ", " + off.getDate_offre() 
                    + ", " + off.getDuree_offre() 
                    + ", " + off.getDate_deb_offre() 
                    + ", " + off.getLoc_offre() 
                    + ", " + off.getDesc_poste_offre() 
                    + ", " + off.getDesc_profil_offre() 
                    + ", " + off.getAnnonceur().getId_anonceur() 
                    + ", " + off.getContrat().getId_contrat() 
                    + ", " + off.getMetier().getId_metier() 
                    + ", " + off.getDomaine().getId_domaine() 
                    + ", " + off.getDiffuseur().getId_diffuseur() 
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_offre) FROM offre");
            if (rs.next()){
                long id_offre = rs.getLong(1);
                off.setId_offre((int)id_offre);
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
    
    public static void ModifierOffre(Connection cnx, Offre off) throws Exception{
        
        
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("UPDATE offre SET"
                    
                    +" int_offre = '" + off.getInt_offre()
                    +" ref_offre = '" + off.getRef_offre() 
                    +" date_offre = " + off.getDate_offre() 
                    +" duree_offre = '" + off.getDuree_offre() 
                    +" date_deb_offre = '" + off.getDate_deb_offre() 
                    +" loc_offre = " + off.getLoc_offre()
                    +" desc_poste_offre = '" + off.getDesc_poste_offre() 
                    +" desc_profil_offre = '" + off.getDesc_profil_offre()               
                    +" WHERE id_offre = " + off.getId_offre()
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
    
    public static void SupprimerOffre(Connection cnx, Offre off) throws Exception{
             
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("DELETE FROM offre "
                    +" WHERE id_offre = " + off.getId_offre());
            
            AnnonceurDAO.SupprimerAnnonceur(cnx, off.getAnnonceur());
            ContratDAO.SupprimerContrat(cnx, off.getContrat());
            MetierDAO.SupprimerMetier(cnx, off.getMetier());
            DomaineDAO.SupprimerDomaine(cnx, off.getDomaine());
            DiffuseurDAO.SupprimerDiffuseur(cnx, off.getDiffuseur());
            MediaDAO.SupprimerMedia(cnx, off.getMedia());
            
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
    
    public static ArrayList<Offre> ListerOffre(Connection cnx){
        ArrayList<Offre> liste = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_offre, int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_poste_offre, desc_profil_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_diffuseur, id_media"
                    + " FROM offre"
                    + "'");
            while(rs.next()){
                long id = rs.getLong("id_offre");
                String int_offre = rs.getString(2);
                String ref_offre = rs.getString(3);
                Date date_offre = rs.getDate(4);
                int duree_offre = rs.getInt(5);
                Date date_deb_offre = rs.getDate(6);
                String loc_offre = rs.getString(7);
                String desc_poste_offre = rs.getString(8);
                String desc_profil_offre = rs.getString(9);
                long id_annonceur = rs.getInt(10);
                long id_contrat = rs.getInt(11);
                long id_metier = rs.getInt(12);
                long id_domaine = rs.getInt(13);
                long id_diffuseur = rs.getInt(14); 
                long id_media = rs.getLong(15);
                
                Annonceur ann = AnnonceurDAO.TrouverAnnonceurId(cnx, id_annonceur);
                Contrat con = ContratDAO.TrouverContratId(cnx, id_contrat);
                Metier met = MetierDAO.TrouverMetierId(cnx, id_metier);
                Domaine dom = DomaineDAO.TrouverDomaineId(cnx, id_domaine);
                Diffuseur dif = DiffuseurDAO.TrouverDiffuseurId(cnx, id_diffuseur);
                Media med = MediaDAO.TrouverMediaId(cnx, id_media);
                
                Offre off = new Offre(int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_poste_offre, desc_profil_offre, ann, con, met, dom);
                
                
                liste.add(off);
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
    
    public static Offre TrouverOffre(Connection cnx, long id_offre){
        Offre offre = null;
        Statement stmt = null;        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_offre, int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_poste_offre, desc_profil_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_diffuseur, id_media"
                    + " FROM offre"
                    + " WHERE id_offre = '" + id_offre + "'");
            if(rs.next()){
                
                String int_offre = rs.getString(2);
                String ref_offre = rs.getString(3);
                Date date_offre = rs.getDate(4);
                int duree_offre = rs.getInt(5);
                Date date_deb_offre = rs.getDate(6);
                String loc_offre = rs.getString(7);
                String desc_poste_offre = rs.getString(8);
                String desc_profil_offre = rs.getString(9);
                long id_annonceur = rs.getInt(10);
                long id_contrat = rs.getInt(11);
                long id_metier = rs.getInt(12);
                long id_domaine = rs.getInt(13);
                long id_diffuseur = rs.getInt(14);
                long id_media = rs.getLong(15);
                
                Annonceur ann = AnnonceurDAO.TrouverAnnonceurId(cnx, id_annonceur);
                Contrat con = ContratDAO.TrouverContratId(cnx, id_contrat);
                Metier met = MetierDAO.TrouverMetierId(cnx, id_metier);
                Domaine dom = DomaineDAO.TrouverDomaineId(cnx, id_domaine);
                Diffuseur dif = DiffuseurDAO.TrouverDiffuseurId(cnx, id_diffuseur);
                Media med = MediaDAO.TrouverMediaId(cnx, id_media);
                
                offre = new Offre(int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_poste_offre, desc_profil_offre, ann, con, met, dom );              
                offre.setId_offre((int) id_offre);
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
        return offre;
    }
}
