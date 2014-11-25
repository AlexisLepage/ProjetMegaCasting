/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
import Class.Contrat;
import Class.Diffuseur;
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
public class ContratDAO {
              
    static public void CreerContrat(Connection cnx, Contrat con) throws Exception{
            
        Contrat c = TrouverContratNom(cnx, con.getLib_contrat());
        if(c != null){
            throw new Exception(con.getLib_contrat() + " existe déjà !");
        } 
        
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("INSERT INTO contrat (lib_contrat)"                   
                    + " VALUES (" +con.getLib_contrat() + "');");
              ResultSet rs = stmt.executeQuery("SELECT Max(id_contrat) FROM contrat");
              if ( rs.next()){
                  long id = rs.getLong(1);
                  con.setId_contrat((int) id);
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
    
     public static void ModifierContrat(Connection cnx, Contrat con) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE contrat"
                    + " SET lib_contrat ='" + con.getLib_contrat());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
     
     static  public void SupprimerContrat(Connection cnx, Contrat con) throws SQLException{
         Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("DELETE FROM contrat"
                    + " WHERE id = " + con.getId_contrat());
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

     
     public static ArrayList<Contrat> ListerContrat(Connection cnx){
        ArrayList<Contrat> liste = new ArrayList<>(); 
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_contrat, lib_contrat"
                    + " FROM contrat");
            
           while(rs.next()){
               long id_contrat = rs.getInt(1);
               String lib_contrat = rs.getString(2);                                         
               
               Contrat con = new Contrat(lib_contrat);         
               con.setId_contrat((int)id_contrat);
               
               liste.add(con);
               
               
               
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
     
     
    public static Contrat TrouverContratId(Connection cnx, long id_contrat) {
        Contrat con = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_contrat, lib_contrat"
                    + " FROM contrat"
                    + " WHERE id_contrat = '" + id_contrat + "'");
            
         if (rs.next()){
                                                      
               String lib_contrat = rs.getString(2);
                        
               
               con = new Contrat(lib_contrat);
               con.setId_contrat((int)id_contrat);
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
         
        return con;
             
           }
    
        public static Contrat TrouverContratNom(Connection cnx, String lib_contrat) {
        Contrat con = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_contrat, lib_contrat"
                    + " FROM contrat"
                    + " WHERE lib_contrat = '" + lib_contrat + "'");
            
         if (rs.next()){
                                                      
               long id_contrat = rs.getLong(1);
                        
               
               con = new Contrat(lib_contrat);
               con.setId_contrat((int)id_contrat);
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
         
        return con;
             
           }

    }

