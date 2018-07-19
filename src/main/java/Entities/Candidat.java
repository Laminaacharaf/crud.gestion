/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.Formation;
import com.rintio.commons.annotations.NativeQueryResultColumn;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author ATANDA
 */
@Entity
public class Candidat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String idCandidat;
//    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
//    private String idMetier;
//    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
//    private String cv;
//    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.COMPLEX)
//    private Formation niveau;

    //RELATIONS 
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "postuler", referencedColumnName = "idPost")
    private Postuler postuler;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private Collection<Demande> demande;
//    @ManyToMany(cascade = CascadeType.PERSIST)
//    private Collection<Metier> metier;

    //GETTERS AND SETTERS
    public String getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(String idCandidat) {
        this.idCandidat = idCandidat;
    }

//    public String getCv() {
//        return cv;
//    }
//
//    public void setCv(String cv) {
//        this.cv = cv;
//    }
//
//    public String getIdMetier() {
//        return idMetier;
//    }
//
//    public void setIdMetier(String idMetier) {
//        this.idMetier = idMetier;
//    }

//    public Formation getNiveau() {
//        return niveau;
//    }
//
//    public void setNiveau(Formation niveau) {
//        this.niveau = niveau;
//    }
//
//    public Postuler getPostuler() {
//        return postuler;
//    }

    public void setPostuler(Postuler postuler) {
        this.postuler = postuler;
    }

    public Collection<Demande> getDemande() {
        return demande;
    }

    public void setDemande(Collection<Demande> demande) {
        this.demande = demande;
    }

//    public Collection<Metier> getMetier() {
//        return metier;
//    }
//
//    public void setMetier(Collection<Metier> metier) {
//        this.metier = metier;
//    }

}
