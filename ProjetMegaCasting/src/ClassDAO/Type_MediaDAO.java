/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Media;
import Class.Type_Media;
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
public class Type_MediaDAO {
    
    public static void CreerType_Media(Connection cnx, Type_Media typ_med) throws Exception{
            Type_Media t = TrouverType_MediaNom(cnx, typ_med.getLib_type_media());
        if(t != null){
            throw new Exception(typ_med.getLib_type_media() + " existe déjà !");
        }   
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            stmt.executeUpdate("INSERT INTO type_media (id_type_media, lib_type_media) "
                    + "VALUES ('" + typ_med.getId_type_media()                
                    + ", " + typ_med.getLib_type_media()
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_type_media) FROM type_media");
            if (rs.next()){
                long id = rs.getLong(1);
                typ_med.setId_type_media((int) id);
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
    
    public static void ModifierType_Media(Connection cnx, Type_Media typ_med) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE type_media"
                    + " SET lib_media ='" + typ_med.getLib_type_media()    
                    + " WHERE id_offre = " + typ_med.getId_type_media());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
     
      public static void SupprimerType_Media(Connection cnx, Type_Media typ_med) throws Exception{
             
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("DELETE FROM type_media "
                    +" WHERE id_type_media = " + typ_med.getId_type_media());
                        
            
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
      
      public static ArrayList<Type_Media> ListerType_Media(Connection cnx){
        ArrayList<Type_Media> liste = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_type_media, lib_type_media"
            + " FROM type_media;");
            while(rs.next()){
                long id_type_media = rs.getLong("id_type_media");
                String lib_type_media = rs.getString(2);                            
                
                Type_Media typ_med = new Type_Media(lib_type_media);
                typ_med.setId_type_media(id_type_media);
                
                liste.add(typ_med);
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

    public static Type_Media TrouverType_MediaId(Connection cnx, long id_type_media)  {
        Type_Media typ_med = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_type_media, lib_type_media"
                    + " FROM type_media"
                   + " WHERE id_type_media ='" + id_type_media + "';");
            
         if (rs.next()){
             
               String lib_type_media = rs.getString(2);                                                                               
               
               typ_med = new Type_Media(lib_type_media);
               typ_med.setId_type_media(id_type_media);
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
         
        return typ_med;
             
           }
       
    private static Type_Media TrouverType_MediaNom(Connection cnx, String lib_type_media) {
         Type_Media typ_med = null;
         Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_type_media, lib_type_media"
                    + " FROM type_media"
                   + " WHERE lib_type_media ='" + lib_type_media + "';");
            
         if (rs.next()){
             
               long id_type_media = rs.getLong(1);                                    
               
               typ_med = new Type_Media(lib_type_media);
               typ_med.setId_type_media(id_type_media);
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
         
        return typ_med;
             
           }
    
}
