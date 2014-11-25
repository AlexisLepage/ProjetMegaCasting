/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;

/**
 *
 * @author
 * Alexis
 */
public class Type_Media {
    
    private long id_type_media;
    private String lib_type_media;

    public long getId_type_media() {
        return id_type_media;
    }

    public void setId_type_media(long id_type_media) {
        this.id_type_media = id_type_media;
    }

    public String getLib_type_media() {
        return lib_type_media;
    }

    public void setLib_type_media(String lib_type_media) {
        this.lib_type_media = lib_type_media;
    }

    public Type_Media(String lib_type_media) {
        this.lib_type_media = lib_type_media;
    }
    
    
}
