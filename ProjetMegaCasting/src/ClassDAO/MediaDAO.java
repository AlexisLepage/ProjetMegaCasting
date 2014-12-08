/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
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
public class MediaDAO {
    
    public static void CreerMedia(Connection cnx, Media med) throws Exception{
            Media m = TrouverMediaUrl(cnx, med.getUrl_media());
        if(m != null){
            throw new Exception(med.getUrl_media() + " existe déjà !");
        }
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            stmt.executeUpdate("INSERT INTO media (url_media, poi_media) "
                    + "VALUES ('" + med.getUrl_media() + "'"                 
                    + ", " + med.getPoi_media()      
                    + ")");
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_media) FROM media");
            if (rs.next()){
                long id = rs.getLong(1);
                med.setId_media((int) id);
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
    
     public static void ModifierMedia(Connection cnx, Media med) throws SQLException{
         
        Statement stmt = null;
        
         try {
             stmt =  cnx.createStatement();
             stmt.executeUpdate("UPDATE media"
                    + " SET url_media ='" + med.getUrl_media()
                    + " AND poi_media ='" + med.getPoi_media()
                    + " WHERE id_offre = " + med.getId_media());
         } catch (SQLException ex) {
             ex.printStackTrace();
         }finally{
             if (stmt != null){
                 stmt.close();
             }
         }
    }
     
      public static void SupprimerMedia(Connection cnx, Media med) throws Exception{
             
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("DELETE FROM media "
                    +" WHERE id_media = " + med.getId_media());
         
            
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
      
      public static ArrayList<Media> ListerMedia(Connection cnx){
        ArrayList<Media> liste = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_media, url_media, poi_media"
            + " FROM media;");
            while(rs.next()){
                long id = rs.getLong("id_media");
                String url_media = rs.getString(2);    
                int poi_media = rs.getInt(3);      
                
                Media med = new Media(url_media, poi_media);
               
                liste.add(med);
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

    public static Media TrouverMediaId (Connection cnx, long id_media)  {
        Media med = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_media, url_media, poi_media"
                    + " FROM media"
                   + " WHERE id_media ='" + id_media + "';");
            
         if (rs.next()){
             
               String url_media = rs.getString(2);                           
               int poi_media = rs.getInt(3);
               
               med = new Media(url_media, poi_media);
               med.setId_media(id_media);
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
         
        return med;
             
           }
       
    public static Media TrouverMediaUrl(Connection cnx, String url_media) {
         Media med = null;
        Statement stmt = null;
        
        try {
            
            stmt =  cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_media, url_media, poi_media"
                    + " FROM media"
                   + " WHERE url_media ='" + url_media + "';");
            
         if (rs.next()){
             
               long id_media = rs.getLong(1);                          
               int poi_media = rs.getInt(3);
                 
               med = new Media(url_media, poi_media);
               med.setId_media(id_media);
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
         
        return med;
             
           }
    }

