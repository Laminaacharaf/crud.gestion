/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Users;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class UsersRepository extends BaseRepository<Users>{
     public UsersRepository() {
    }

    public UsersRepository(String unitPersistence) {
        super(unitPersistence, Users.class);
    }
     //AFFICHAGE D'UN  Users A PARTIR DE SON IDv
    public Users getUsersById(String idUser) {
        String str = "SELECT ca FROM Users ca WHERE ca.idUser =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idUser);
        return (Users) query.getSingleResult();
    }
    
    //LISTE DES CANDIDATS DE LA BASE
    public List<Users> listUsers() {
        String str = "SELECT obj FROM Users obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }
    
      //SUPPRIMESSION D'UN  CANDIDAT A PARTIR DE SON IDCandidat
    public Users delete(String idUser) {
        String str = "DELECTE ca FROM Users ca WHERE ca.idUser =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idUser);
        return (Users) query.getSingleResult();
    }
    
}
