/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Entities.Candidat;
import Enums.Formation;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ATANDA
 */
public class CandidatRepository extends BaseRepository<Candidat> {

    public CandidatRepository() {
    }

    public CandidatRepository(String unitPersistence) {
        super(unitPersistence, Candidat.class);
    }
    //AFFICHAGE D'UN  CANDIDAT A PARTIR DE SON IDCandidat

    public Candidat getCandidatById(String idCandidat) {
        String str = "SELECT ca FROM Candidat ca WHERE ca.idCandidat =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idCandidat);
        return (Candidat) query.getSingleResult();
    }
public List<Candidat> getCandidat(String idMetier, Formation niveau) {
        String str = "SELECT ca FROM Candidat ca WHERE ca.idMetier =:identifiant AND ca.niveau=:Params";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idMetier );
         query.setParameter("Params",niveau);
        return query.getResultList();
    }
    //LISTE DES CANDIDATS DE LA BASE
    public List<Candidat> listCandidat() {
        String str = "SELECT obj FROM Candidat obj";
        Query query = getEntityManager().createQuery(str);
        return query.getResultList();
    }

    //SUPPRESSION D'UN  CANDIDAT A PARTIR DE SON IDCandidat
    public Boolean delete(String idCandidat) {
        String str = "DELETE ca FROM Candidat ca WHERE ca.idCandidat =:identifiant";
        Query query = getEntityManager().createQuery(str);
        query.setParameter("identifiant", idCandidat);
        this.getEntityManager().remove(query);
        if (getCandidatById(idCandidat) == null) {
            return true;
        } else {
            return false;
        }
    }
}
