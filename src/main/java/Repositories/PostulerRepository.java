/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Postuler;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class PostulerRepository extends BaseRepository<Postuler>{
     public PostulerRepository() {
    }

    public PostulerRepository(String unitPersistence) {
        super(unitPersistence, Postuler.class);
    }
    
     //AFFICHAGE D'UNE PERSONNE A PARTIR DE SON IDPERSONNE
    public Postuler getPostulerById(int id) {
        String str = "SELECT po FROM Postuler po WHERE po.id =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", id);
        return (Postuler) query.getSingleResult();
    }
     
    //LISTE DES Postuler DE LA BASE
    public List<Postuler> listPostuler() {
        String str = "SELECT obj FROM Postuler obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRIMESSION D'UN  Postuler A PARTIR DE SON IDPostuler
    public Postuler delete(int id) {
        String str = "DELECTE ca FROM Postuler ca WHERE ca.id =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", id);
        return (Postuler) query.getSingleResult();
    }
}
