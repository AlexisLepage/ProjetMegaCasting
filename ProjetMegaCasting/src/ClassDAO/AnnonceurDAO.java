/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
import Class.Information;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author
 * Alexis
 */
public class AnnonceurDAO {
    
    public static void CreerAnnonceur(Connection cnx, Annonceur ann) throws Exception{
            Annonceur a = TrouverAnnonceur(cnx, ann.getNom_annonceur());
        if(a != null){
            throw new Exception(ann.getNom_annonceur() + " existe déjà !");
        }
        
        InformationDAO.CreerInformation(cnx, ann.getId_information());
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            stmt.executeUpdate("INSERT INTO PERSONNE (nom_annonceur, id_information) "
                    + "VALUES ('" + ann.getNom_annonceur() + "'"                 
                    + ", " + ann.getId_information().getId_information()
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_annonceur) FROM annonceur");
            if (rs.next()){
                long id = rs.getLong(1);
                ann.setId_anonceur((int) id);
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
    
    public static void ModifierAnnonceur(Connection cnx, Annonceur ann) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE annonceur"
                    + " SET nom_annonceur ='" + ann.getNom_annonceur());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
    
    static  public void SupprimerAnnonceur(Connection cnx, Annonceur ann) throws SQLException{
         Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("DELETE FROM annonceur"
                    + " WHERE id =" +ann.getId_anonceur() + ";");
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    
    
     public static ArrayList<Annonceur> ListerAnonceur(Connection cnx){
        ArrayList<Annonceur> liste = new ArrayList<>(); 
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_annonceur, nom_annonceur, id_information"
                    + " FROM anonceur;");
            
           while(rs.next()){
               long id_annonceur = rs.getInt(1);
               String nom_annonceur = rs.getString(2);                 
               long id_information = rs.getInt(3);
               
               Information inf = InformationDAO.TrouverInformation(cnx, id_information);
               
               Annonceur ann = new Annonceur(nom_annonceur, inf);         
               ann.setId_anonceur(id_annonceur);
               
               liste.add(ann);
               
               
               
           }
         } catch (Exception e) {
             e.printStackTrace();
         }finally {
            
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        return null;
     
       
    }

    private static Annonceur TrouverAnnonceur(Connection cnx, String nom_annonceur) {
        Annonceur ann = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_annonceur, nom_annonceur, id_information"
                    + " FROM annonceur"
                   + " WHERE nom_annonceur ='" + nom_annonceur + "';");
            
         if (rs.next()){
             
               long id_information = rs.getLong(3);                           
               int id_annonceur = rs.getInt(1);
                
               
               Information inf = InformationDAO.TrouverInformation(cnx, id_information);
               
               ann = new Annonceur(nom_annonceur, inf);
               ann.setId_anonceur(id_annonceur);
               }
            
         
              
        } catch (Exception e) {
            
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
         
        return ann;
             
           }

    }

