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
public class Demande implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private boolean validite;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String contenu;

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
     * @return the validite
     */
    public boolean isValidite() {
        return validite;
    }

    /**
     * @param validite the validite to set
     */
    public void setValidite(boolean validite) {
        this.validite = validite;
    }

    /**
     * @return the contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * @param contenu the contenu to set
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
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
