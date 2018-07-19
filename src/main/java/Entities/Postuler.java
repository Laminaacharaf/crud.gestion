/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import com.rintio.commons.annotations.NativeQueryResultColumn;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author ATANDA
 */
@Entity
public class Postuler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idPost;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String libPost;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datePost;

    public List<Offre> getListOffre() {
        return listOffre;
    }

    public void setListOffre(List<Offre> listOffre) {
        this.listOffre = listOffre;
    }

    public List<Candidat> getListCandidat() {
        return listCandidat;
    }

    //Object Read Many ORM. Gestion de liste des Offres
    public void setListCandidat(List<Candidat> listCandidat) {
        this.listCandidat = listCandidat;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postuler")
    private List<Offre> listOffre;
    //Object Read Many ORM. Gestion de liste des candidats
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postuler")
    private List<Candidat> listCandidat;

    //GETTERS AND SETTERS
    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

    public String getLibPost() {
        return libPost;
    }

    public void setLibPost(String libPost) {
        this.libPost = libPost;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

}
