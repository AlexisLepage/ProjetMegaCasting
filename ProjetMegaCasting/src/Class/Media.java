/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author
 * Alexis
 */
public class Media {
    
    private long id_media;
    private String url_media;
    private int poi_media;
    private Type_Media type_media;

    public long getId_media() {
        return id_media;
    }

    public void setId_media(long id_media) {
        this.id_media = id_media;
    }

    public String getUrl_media() {
        return url_media;
    }

    public void setUrl_media(String url_media) {
        this.url_media = url_media;
    }

    public int getPoi_media() {
        return poi_media;
    }

    public void setPoi_media(int poi_media) {
        this.poi_media = poi_media;
    }

    public Type_Media getType_media() {
        return type_media;
    }

    public void setType_media(Type_Media type_media) {
        this.type_media = type_media;
    }

    public Media(String url_media, int poi_media, Type_Media type_media) {
        this.url_media = url_media;
        this.poi_media = poi_media;
        this.type_media = type_media;
    }
    
    
}
