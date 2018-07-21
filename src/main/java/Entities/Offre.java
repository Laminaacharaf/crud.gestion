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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ATANDA
 */
@Entity
public class Offre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String titre;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String dateDebut;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String dateFin;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String metier;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.COMPLEX)
    private Users users;

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
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the dateDebut
     */
    public String getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the metier
     */
    public String getMetier() {
        return metier;
    }

    /**
     * @param metier the metier to set
     */
    public void setMetier(String metier) {
        this.metier = metier;
    }

    /**
     * @return the users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(Users users) {
        this.users = users;
    }
}
