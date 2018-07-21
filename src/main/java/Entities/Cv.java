/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.Formation;
import Enums.SituationMatrimoniale;
import com.rintio.commons.annotations.NativeQueryResultColumn;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Cv implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nomCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String prenomCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String ageCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private SituationMatrimoniale situation;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int telephoneCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String adresseCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String villeCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String paysCandidat;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nomSociete;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String villeSociete;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String paysSociete;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String poste;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String duree;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nomEcole;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String villeEcole;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String paysEcole;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String dateDebutFormation;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String dateFinFormation;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String diplomeFinFormation;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.COMPLEX)
    private Formation niveau;

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String domaineCompetence;

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
     * @return the nomCandidat
     */
    public String getNomCandidat() {
        return nomCandidat;
    }

    /**
     * @param nomCandidat the nomCandidat to set
     */
    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }

    /**
     * @return the prenomCandidat
     */
    public String getPrenomCandidat() {
        return prenomCandidat;
    }

    /**
     * @param prenomCandidat the prenomCandidat to set
     */
    public void setPrenomCandidat(String prenomCandidat) {
        this.prenomCandidat = prenomCandidat;
    }

    /**
     * @return the ageCandidat
     */
    public String getAgeCandidat() {
        return ageCandidat;
    }

    /**
     * @param ageCandidat the ageCandidat to set
     */
    public void setAgeCandidat(String ageCandidat) {
        this.ageCandidat = ageCandidat;
    }

    /**
     * @return the situation
     */
    public SituationMatrimoniale getSituation() {
        return situation;
    }

    /**
     * @param situation the situation to set
     */
    public void setSituation(SituationMatrimoniale situation) {
        this.situation = situation;
    }

    /**
     * @return the telephoneCandidat
     */
    public int getTelephoneCandidat() {
        return telephoneCandidat;
    }

    /**
     * @param telephoneCandidat the telephoneCandidat to set
     */
    public void setTelephoneCandidat(int telephoneCandidat) {
        this.telephoneCandidat = telephoneCandidat;
    }

    /**
     * @return the adresseCandidat
     */
    public String getAdresseCandidat() {
        return adresseCandidat;
    }

    /**
     * @param adresseCandidat the adresseCandidat to set
     */
    public void setAdresseCandidat(String adresseCandidat) {
        this.adresseCandidat = adresseCandidat;
    }

    /**
     * @return the villeCandidat
     */
    public String getVilleCandidat() {
        return villeCandidat;
    }

    /**
     * @param villeCandidat the villeCandidat to set
     */
    public void setVilleCandidat(String villeCandidat) {
        this.villeCandidat = villeCandidat;
    }

    /**
     * @return the paysCandidat
     */
    public String getPaysCandidat() {
        return paysCandidat;
    }

    /**
     * @param paysCandidat the paysCandidat to set
     */
    public void setPaysCandidat(String paysCandidat) {
        this.paysCandidat = paysCandidat;
    }

    /**
     * @return the nomSociete
     */
    public String getNomSociete() {
        return nomSociete;
    }

    /**
     * @param nomSociete the nomSociete to set
     */
    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    /**
     * @return the villeSociete
     */
    public String getVilleSociete() {
        return villeSociete;
    }

    /**
     * @param villeSociete the villeSociete to set
     */
    public void setVilleSociete(String villeSociete) {
        this.villeSociete = villeSociete;
    }

    /**
     * @return the paysSociete
     */
    public String getPaysSociete() {
        return paysSociete;
    }

    /**
     * @param paysSociete the paysSociete to set
     */
    public void setPaysSociete(String paysSociete) {
        this.paysSociete = paysSociete;
    }

    /**
     * @return the poste
     */
    public String getPoste() {
        return poste;
    }

    /**
     * @param poste the poste to set
     */
    public void setPoste(String poste) {
        this.poste = poste;
    }

    /**
     * @return the duree
     */
    public String getDuree() {
        return duree;
    }

    /**
     * @param duree the duree to set
     */
    public void setDuree(String duree) {
        this.duree = duree;
    }

    /**
     * @return the nomEcole
     */
    public String getNomEcole() {
        return nomEcole;
    }

    /**
     * @param nomEcole the nomEcole to set
     */
    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    /**
     * @return the villeEcole
     */
    public String getVilleEcole() {
        return villeEcole;
    }

    /**
     * @param villeEcole the villeEcole to set
     */
    public void setVilleEcole(String villeEcole) {
        this.villeEcole = villeEcole;
    }

    /**
     * @return the paysEcole
     */
    public String getPaysEcole() {
        return paysEcole;
    }

    /**
     * @param paysEcole the paysEcole to set
     */
    public void setPaysEcole(String paysEcole) {
        this.paysEcole = paysEcole;
    }

    /**
     * @return the dateDebutFormation
     */
    public String getDateDebutFormation() {
        return dateDebutFormation;
    }

    /**
     * @param dateDebutFormation the dateDebutFormation to set
     */
    public void setDateDebutFormation(String dateDebutFormation) {
        this.dateDebutFormation = dateDebutFormation;
    }

    /**
     * @return the dateFinFormation
     */
    public String getDateFinFormation() {
        return dateFinFormation;
    }

    /**
     * @param dateFinFormation the dateFinFormation to set
     */
    public void setDateFinFormation(String dateFinFormation) {
        this.dateFinFormation = dateFinFormation;
    }

    /**
     * @return the diplomeFinFormation
     */
    public String getDiplomeFinFormation() {
        return diplomeFinFormation;
    }

    /**
     * @param diplomeFinFormation the diplomeFinFormation to set
     */
    public void setDiplomeFinFormation(String diplomeFinFormation) {
        this.diplomeFinFormation = diplomeFinFormation;
    }

    /**
     * @return the niveau
     */
    public Formation getNiveau() {
        return niveau;
    }

    /**
     * @param niveau the niveau to set
     */
    public void setNiveau(Formation niveau) {
        this.niveau = niveau;
    }

    /**
     * @return the domaineCompetence
     */
    public String getDomaineCompetence() {
        return domaineCompetence;
    }

    /**
     * @param domaineCompetence the domaineCompetence to set
     */
    public void setDomaineCompetence(String domaineCompetence) {
        this.domaineCompetence = domaineCompetence;
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
