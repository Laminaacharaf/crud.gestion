/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Entities.Cv;
import Entities.Demande;
//import Entities.Metier;
import Entities.Offre;
import Entities.Postuler;
import Entities.Users;
import Enums.Formation;
import Enums.SituationMatrimoniale;
import Enums.TypeUser;
import Repositories.BaseRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ATANDA
 */
public class test {

    public static void main(String[] args) {
        // TODO code application logic here
        //--- Création d'un EntityManageter
        System.out.println("Création d'un EntityManager");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GesJob_Pu");
        EntityManager em = emf.createEntityManager();

        //création d'un nouvel CV      
        System.out.println("Création d'un CV");
        Cv v = new Cv();
        v.setNomCandidat("LAMINA");
        v.setPrenomCandidat("Acharaf");
        v.setAgeCandidat("23 ans");
        v.setSituation(SituationMatrimoniale.Célibataire);
        v.setAdresseCandidat("Cotonou/qtier maromilitaire");
        v.setTelephoneCandidat(96628294);
        v.setVilleCandidat("Porto-Novo");
        v.setPaysCandidat("BENIN");
        v.setNomSociete("RINTIO");
        v.setVilleSociete("Cotonou");
        v.setPaysSociete("BENIN");
        v.setPoste("Stagiaire");
        v.setDuree("1 an");
        v.setNomEcole("HECM");
        v.setVilleEcole("Cotonou");
        v.setPaysEcole("BENIN");
        v.setDateDebutFormation("");
        v.setDateFinFormation("20-05-2018");
        v.setDiplomeFinFormation("Néant");
        v.setNiveau(Formation.BAC3);
        v.setDomaineCompetence("Programmation Java");

        //création d'un nouvel Demande      
        System.out.println("Création d'une Demande");
        Demande d = new Demande();
        d.setValidite(Boolean.TRUE);

        //création d'un nouvel Offre      
        System.out.println("Création d'une Offre");
        Offre o = new Offre();
        o.setTitre("Recherche des infirmiers");
        o.setDateDebut("");
        o.setDateFin("2018,11,22");

        //création d'un nouvel Postuler      
        System.out.println("Création d'un Postuler");
        Postuler p = new Postuler();
        p.setLibPost("Offre d'emplois");
        p.setDatePost("");

//        //création d'un nouvel Users      
        System.out.println("Création d'un Users");
        Users u = new Users();
        u.setNom("DAOUDA");
        u.setPrenom("Achraf");
        u.setDateNaissance("995,05,06");
        u.setAdresse("Porto-Novo");
        u.setPassword("pw005");
        u.setEmail("email@aaa.com");
        u.setTypeUser(TypeUser.CANDIDAT);

        //--- persistons cette personne dans la base
        EntityTransaction tx = em.getTransaction();
        System.out.println("Début de la transaction");
        tx.begin();
        try {
            System.out.println("Ajout dans la base en cours...");
            em.persist(v);

            em.persist(d);
            em.persist(o);
            em.persist(p);

            em.persist(u);

            BaseRepository b = new BaseRepository("GesJob_Pu", Users.class);
//            c.setIdCandidat("C01");

            //Suppresion d'un objet
            b.delete(o);
            tx.commit();
            System.out.println("Transaction validée");
        } catch (Exception e) {
            System.out.println("Erreur :" + e.getMessage());
            tx.rollback();
            System.out.println("Transaction annulée");
        } finally {
            em.close();
            emf.close();
        }

    }
}
