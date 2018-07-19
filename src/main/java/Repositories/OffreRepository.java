/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Offre;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class OffreRepository extends BaseRepository<Offre>{
     public OffreRepository() {
    }

    public OffreRepository(String unitPersistence) {
        super(unitPersistence, Offre.class);
    }   
      //AFFICHAGE D'UN  Offre A PARTIR DE SON IDOffre
    public Offre getOffreById(String idOffre) {
        String str = "SELECT ca FROM Offre ca WHERE ca.idOffre =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idOffre);
        return (Offre) query.getSingleResult();
    }
    
    //LISTE DES Offre DE LA BASE
    public List<Offre> listOffre() {
        String str = "SELECT obj FROM Recruteur obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRIMESSION D'UN  Offre A PARTIR DE SON IDCandidat
    public Offre delete(String idOffre) {
        String str = "DELECTE ca FROM Offre ca WHERE ca.idOffre =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idOffre);
        return (Offre) query.getSingleResult();
    }
}
