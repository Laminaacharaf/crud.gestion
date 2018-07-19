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
public class Recruteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idRecruteur;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String libSociete;

    //GETTERS AND SETTERS
    public String getIdRecruteur() {
        return idRecruteur;
    }

    public void setIdRecruteur(String idRecruteur) {
        this.idRecruteur = idRecruteur;
    }

    public String getLibSociete() {
        return libSociete;
    }

    public void setLibSociete(String libSociete) {
        this.libSociete = libSociete;
    }

}
