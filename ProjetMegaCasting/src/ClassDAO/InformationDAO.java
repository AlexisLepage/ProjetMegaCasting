/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

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
public class InformationDAO {

    public static void CreerInformation(Connection cnx, Information inf) throws Exception{
            Information i = TrouverInformation(cnx, inf.getMail_information());
        if(i != null){
            throw new Exception(inf.getMail_information() + " existe déjà !");
        }
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            stmt.executeUpdate("INSERT INTO information (mail_information) "
                    + "VALUES ('" + inf.getMail_information()
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_information) FROM information");
            if (rs.next()){
                long id_information = rs.getLong(1);
                inf.setId_information((long) id_information);
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
    
    public static void ModifierInformation(Connection cnx, Information inf) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE information"
                    + " SET mail_information ='" + inf.getMail_information());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
    
    static  public void SupprimerInformation(Connection cnx, Information inf) throws SQLException{
         Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("DELETE FROM information"
                    + " WHERE id_ =" + inf.getId_information() + ";");
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
    
    
     public static ArrayList<Information> ListerInformation(Connection cnx){
        ArrayList<Information> liste = new ArrayList<>(); 
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id_information, mail_information"
                    + " FROM information;");
            
           while(rs.next()){
               long id_information = rs.getLong(1);
               String mail_information = rs.getString(2); 
               int tel_fixe_information = rs.getInt(3);
               int tel_port_information = rs.getInt(4);
               String rue_information = rs.getString(5);
               String ville_information = rs.getString(6);
               int cp_information = rs.getInt(7);
               String pays_information = rs.getString(8);
               
               
               Information inf = new Information(mail_information, tel_fixe_information, tel_port_information, rue_information, ville_information, cp_information, pays_information);         
               inf.setId_information(id_information);
               
               liste.add(inf);
               
               
               
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

    private static Information TrouverInformation(Connection cnx, String mail_information) {
        Information inf = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_information, mail_information"
                    + " FROM information"
                   + " WHERE mail_information ='" + mail_information + "';");
            
         if (rs.next()){
                                      
               long id_information = rs.getLong(1);
               mail_information = rs.getString(2); 
               int tel_fixe_information = rs.getInt(3);
               int tel_port_information = rs.getInt(4);
               String rue_information = rs.getString(5);
               String ville_information = rs.getString(6);
               int cp_information = rs.getInt(7);
               String pays_information = rs.getString(8);
               
               inf = new Information(mail_information, tel_fixe_information, tel_port_information, rue_information, ville_information, cp_information, pays_information);
               inf.setId_information(id_information);
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
         
        return inf;
             
           }
}
