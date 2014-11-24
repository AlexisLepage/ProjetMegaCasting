/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Contrat;
import Class.Domaine;
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
public class DomaineDAO {
    
    static public void CreerDomaine(Connection cnx, Domaine dom){
               
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("INSERT INTO domaine (lib_domaine)"                   
                    + " VALUES (" +dom.getLib_domaine() + "');");
              ResultSet rs = stmt.executeQuery("SELECT Max(id_domaine) FROM domaine");
              if ( rs.next()){
                  long id = rs.getLong(1);
                  dom.setId_domaine((int) id);
              }
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 try {
                    stmt.close(); 
                 } catch (Exception ex) {
                    ex.printStackTrace();
                 }
                 
             }
         }
    }
    
     public static void ModifierDomaine(Connection cnx, Domaine dom) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE domaine"
                    + " SET lib_domaine ='" + dom.getLib_domaine());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
     
     static  public void SupprimerDomaine(Connection cnx, Domaine dom) throws SQLException{
         Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("DELETE FROM domaine"
                    + " WHERE id =" +dom.getId_domaine() + ";");
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

     
     public static ArrayList<Domaine> ListerDomaine(Connection cnx){
        ArrayList<Domaine> liste = new ArrayList<>(); 
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_domaine, lib_domaine"
                    + " FROM domaine;");
            
           while(rs.next()){
               long id_domaine = rs.getInt(1);
               String lib_domaine = rs.getString(2);                                         
               
               Domaine dom = new Domaine(lib_domaine);         
               dom.setId_domaine((int)id_domaine);
               
               liste.add(dom);
               
               
               
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
     
     
    private static Domaine TrouverDomaine(Connection cnx, String lib_domaine) {
        Domaine dom = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_domaine, lib_domaine"
                    + " FROM domaine"
                   + " WHERE lib_domaine ='" + lib_domaine + "';");
            
         if (rs.next()){
                                                      
               int id_domaine = rs.getInt(1);
                        
               
               dom = new Domaine(lib_domaine);
               dom.setId_domaine(id_domaine);
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
         
        return dom;
             
           }

   

}
