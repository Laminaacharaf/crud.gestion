/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Demande;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class DemandeRepository extends BaseRepository<Demande>{
     public DemandeRepository() {
    }

    public DemandeRepository(String unitPersistence) {
        super(unitPersistence, Demande.class);
    } 
     //AFFICHAGE D'UNE DEMANDE A PARTIR DE SON IDDEMANDE
    public Demande getDemandeById(int id) {
        String str = "SELECT de FROM Demande de WHERE de.id =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", id);
        return (Demande) query.getSingleResult();
    }
    
    //LISTE DES Demande DE LA BASE
    public List<Demande> listDemande() {
        String str = "SELECT obj FROM Demande obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRIMESSION D'UN  Demande A PARTIR DE SON IDDemande
    public Demande delete(int id) {
        String str = "DELECTE ca FROM Demande ca WHERE ca.id =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", id);
        return (Demande) query.getSingleResult();
    }
}
