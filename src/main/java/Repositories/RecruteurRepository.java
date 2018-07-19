/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Recruteur;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class RecruteurRepository extends BaseRepository<Recruteur>{
     public RecruteurRepository() {
    }

    public RecruteurRepository(String unitPersistence) {
        super(unitPersistence, Recruteur.class);
    }
     //AFFICHAGE D'UN  Recruteur A PARTIR DE SON IDRecruteur
    public Recruteur getRecruteurById(String idRecruteur) {
        String str = "SELECT ca FROM Recruteur ca WHERE ca.idRecruteur =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idRecruteur);
        return (Recruteur) query.getSingleResult();
    }
    
    //LISTE DES CANDIDATS DE LA BASE
    public List<Recruteur> listRecruteur() {
        String str = "SELECT obj FROM Recruteur obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRIMESSION D'UN  CANDIDAT A PARTIR DE SON IDCandidat
    public Recruteur delete(String idRecruteur) {
        String str = "DELECTE ca FROM Recruteur ca WHERE ca.idRecruteur =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idRecruteur);
        return (Recruteur) query.getSingleResult();
    }
    
}
