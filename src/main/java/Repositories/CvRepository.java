/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Cv;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class CvRepository extends BaseRepository<Cv>{
     public CvRepository() {
    }

    public CvRepository(String unitPersistence) {
        super(unitPersistence, Cv.class);
    }
     //AFFICHAGE D'UN  Cv A PARTIR DE SON IDv
    public Cv getCvById(String idCv) {
        String str = "SELECT ca FROM Cv ca WHERE ca.idCv =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idCv);
        return (Cv) query.getSingleResult();
    }
    
    //LISTE DES CV DE LA BASE
    public List<Cv> listCv() {
        String str = "SELECT obj FROM Cv obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRESSION D'UN  CV A PARTIR DE SON ID
    public Cv delete(String idCv) {
        String str = "DELECTE ca FROM Cv ca WHERE ca.idCv =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idCv);
        return (Cv) query.getSingleResult();
    }
    
    
}
