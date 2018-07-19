/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Metier;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class MetierRepository extends BaseRepository<Metier>{
     public MetierRepository() {
    }

    public MetierRepository(String unitPersistence) {
        super(unitPersistence, Metier.class);
    }     
     //AFFICHAGE D'UN  Metier A PARTIR DE SON IDMetier
    public Metier getMetierById(String idMetier) {
        String str = "SELECT ca FROM Metier ca WHERE ca.idMetier =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idMetier);
        return (Metier) query.getSingleResult();
    }
    
    //LISTE DES Metier DE LA BASE
    public List<Metier> listMetier() {
        String str = "SELECT obj FROM Recruteur obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRIMESSION D'UN  Metier A PARTIR DE SON IDMetier
    public Metier delete(String idMetier) {
        String str = "DELECTE ca FROM Metier ca WHERE ca.idMetier =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idMetier);
        return (Metier) query.getSingleResult();
    }
    
}
