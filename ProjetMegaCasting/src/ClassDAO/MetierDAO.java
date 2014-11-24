/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
import Class.Domaine;
import Class.Information;
import Class.Metier;
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
public class MetierDAO {
    public static void CreerMetier(Connection cnx, Metier lib) throws Exception{
            Metier m = TrouverMetier(cnx, lib.getLib_metier());
        if(m != null){
            throw new Exception(lib.getLib_metier() + " existe déjà !");
        }
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            stmt.executeUpdate("INSERT INTO metier (lib_metier) "
                    + "VALUES ('" + lib.getLib_metier()
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_metier) FROM metier");
            if (rs.next()){
                long id_metier = rs.getLong(1);
                lib.setId_metier((long) id_metier);
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
    
    public static void ModifierMetier(Connection cnx, Metier met) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE metier"
                    + " SET lib_metier ='" + met.getLib_metier());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
    
    static  public void SupprimerMetier(Connection cnx, Metier met) throws SQLException{
         Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("DELETE FROM metier"
                    + " WHERE id =" + met.getId_metier() + ";");
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
    
    
     public static ArrayList<Metier> ListerMetier(Connection cnx){
        ArrayList<Metier> liste = new ArrayList<>(); 
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_metier, lib_metier"
                    + " FROM metier;");
            
           while(rs.next()){
               long id_metier = rs.getInt(1);
               String lib_metier = rs.getString(2);
               long id_domaine = rs.getLong("id_domaine");
                
               Domaine dom = DomaineDAO.trouver(cnx, id_domaine);
                
               Metier met = new Metier(lib_metier, dom);         
               met.setId_metier(id_metier);
               
               liste.add(met);
               
               
               
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

    private static Metier TrouverMetier(Connection cnx, String lib_metier) {
        Metier met = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_metier, lib_metier"
                    + " FROM metier"
                   + " WHERE lib_metier ='" + lib_metier + "';");
            
         if (rs.next()){
                                      
               int id_metier = rs.getInt(1);
               long id_domaine = rs.getLong("id_domaine");
               
               Domaine dom = DomaineDAO.trouver(cnx, id_domaine);
                
               met.setId_metier(id_metier);
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
         
        return met;
             
           }
}
