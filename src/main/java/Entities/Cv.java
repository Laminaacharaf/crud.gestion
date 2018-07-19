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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author ATANDA
 */
@Entity
public class Cv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String idCv;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nomCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String prenomCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String ageCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private SituationMatrimoniale situation;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String emailCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int telephoneCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String adresseCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String villeCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String paysCandidat;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nomSociété;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String villeSociété;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String paysSociété;
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
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebutFormation;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFinFormation;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String diplomeFinFormation;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.COMPLEX)
    private Formation niveau;
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String domaineCompetence;

    //GETTERS AND SETTERS
    public String getIdCv() {
        return idCv;
    }

    public void setIdCv(String idCv) {
        this.idCv = idCv;
    }

    public String getNomCandidat() {
        return nomCandidat;
    }

    public void setNomCandidat(String nomCandidat) {
        this.nomCandidat = nomCandidat;
    }

    public String getPrenomCandidat() {
        return prenomCandidat;
    }

    public void setPrenomCandidat(String prenomCandidat) {
        this.prenomCandidat = prenomCandidat;
    }

    public String getAgeCandidat() {
        return ageCandidat;
    }

    public void setAgeCandidat(String ageCandidat) {
        this.ageCandidat = ageCandidat;
    }

    public SituationMatrimoniale getSituation() {
        return situation;
    }

    public void setSituation(SituationMatrimoniale situation) {
        this.situation = situation;
    }

    public String getEmailCandidat() {
        return emailCandidat;
    }

    public void setEmailCandidat(String emailCandidat) {
        this.emailCandidat = emailCandidat;
    }

    public int getTelephoneCandidat() {
        return telephoneCandidat;
    }

    public void setTelephoneCandidat(int telephoneCandidat) {
        this.telephoneCandidat = telephoneCandidat;
    }

    public String getAdresseCandidat() {
        return adresseCandidat;
    }

    public void setAdresseCandidat(String adresseCandidat) {
        this.adresseCandidat = adresseCandidat;
    }

    public String getVilleCandidat() {
        return villeCandidat;
    }

    public void setVilleCandidat(String villeCandidat) {
        this.villeCandidat = villeCandidat;
    }

    public String getPaysCandidat() {
        return paysCandidat;
    }

    public void setPaysCandidat(String paysCandidat) {
        this.paysCandidat = paysCandidat;
    }

    public String getNomSociété() {
        return nomSociété;
    }

    public void setNomSociété(String nomSociété) {
        this.nomSociété = nomSociété;
    }

    public String getVilleSociété() {
        return villeSociété;
    }

    public void setVilleSociété(String villeSociété) {
        this.villeSociété = villeSociété;
    }

    public String getPaysSociété() {
        return paysSociété;
    }

    public void setPaysSociété(String paysSociété) {
        this.paysSociété = paysSociété;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    public String getVilleEcole() {
        return villeEcole;
    }

    public void setVilleEcole(String villeEcole) {
        this.villeEcole = villeEcole;
    }

    public String getPaysEcole() {
        return paysEcole;
    }

    public void setPaysEcole(String paysEcole) {
        this.paysEcole = paysEcole;
    }

    public Date getDateDebutFormation() {
        return dateDebutFormation;
    }

    public void setDateDebutFormation(Date dateDebutFormation) {
        this.dateDebutFormation = dateDebutFormation;
    }

    public Date getDateFinFormation() {
        return dateFinFormation;
    }

    public void setDateFinFormation(Date dateFinFormation) {
        this.dateFinFormation = dateFinFormation;
    }

    public String getDiplomeFinFormation() {
        return diplomeFinFormation;
    }

    public void setDiplomeFinFormation(String diplomeFinFormation) {
        this.diplomeFinFormation = diplomeFinFormation;
    }

    public Formation getNiveau() {
        return niveau;
    }

    public void setNiveau(Formation niveau) {
        this.niveau = niveau;
    }

    public String getDomaineCompetence() {
        return domaineCompetence;
    }

    public void setDomaineCompetence(String domaineCompetence) {
        this.domaineCompetence = domaineCompetence;
    }

}
