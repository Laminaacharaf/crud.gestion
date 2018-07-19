/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import com.rintio.commons.annotations.NativeQueryResultColumn;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author ATANDA
 */
@Entity
public class Metier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String idMetier;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String libMetier;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String experiencePro;

    //RELATIONS
    @ManyToMany
    private Collection<Candidat> candidat;

    //GETTERS AND SETTERS
    public String getIdMetier() {
        return idMetier;
    }

    public void setIdMetier(String idMetier) {
        this.idMetier = idMetier;
    }

    public String getLibMetier() {
        return libMetier;
    }

    public void setLibMetier(String libMetier) {
        this.libMetier = libMetier;
    }

    public String getExperiencePro() {
        return experiencePro;
    }

    public void setExperiencePro(String experiencePro) {
        this.experiencePro = experiencePro;
    }

}
