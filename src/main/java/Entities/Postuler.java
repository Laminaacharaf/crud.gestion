/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import com.rintio.commons.annotations.NativeQueryResultColumn;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ATANDA
 */
@Entity
public class Postuler implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String libPost;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String datePost;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int idOffre;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int idCandidat;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the libPost
     */
    public String getLibPost() {
        return libPost;
    }

    /**
     * @param libPost the libPost to set
     */
    public void setLibPost(String libPost) {
        this.libPost = libPost;
    }

    /**
     * @return the datePost
     */
    public String getDatePost() {
        return datePost;
    }

    /**
     * @param datePost the datePost to set
     */
    public void setDatePost(String datePost) {
        this.datePost = datePost;
    }

    /**
     * @return the idOffre
     */
    public int getIdOffre() {
        return idOffre;
    }

    /**
     * @param idOffre the idOffre to set
     */
    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    /**
     * @return the idCandidat
     */
    public int getIdCandidat() {
        return idCandidat;
    }

    /**
     * @param idCandidat the idCandidat to set
     */
    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

}
