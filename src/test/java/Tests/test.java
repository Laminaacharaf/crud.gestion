/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Entities.Candidat;
import Entities.Cv;
import Entities.Demande;
//import Entities.Metier;
import Entities.Offre;
import Entities.Postuler;
import Entities.Recruteur;
import Entities.Users;
import Enums.Formation;
import Enums.SituationMatrimoniale;
import Repositories.BaseRepository;
import java.util.Date;
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
        System.out.println( "Création d'un CV");
        Cv v = new Cv();
        v.setIdCv("cv2");
        v.setNomCandidat("DAOUDA");
        v.setPrenomCandidat("Admol");
        v.setAgeCandidat("24 ans");
        v.setSituation(SituationMatrimoniale.Célibataire);
        v.setEmailCandidat("admolaatanda@gmail.com");
        v.setTelephoneCandidat(96628294);
        v.setVilleCandidat("Porto-Novo");
        v.setPaysCandidat("BENIN");
        v.setNomSociété("RINTIO");
        v.setVilleSociété("Cotonou");
        v.setPaysSociété("BENIN");
        v.setPoste("Stagiaire");
        v.setDuree("1 an");
        v.setNomEcole("HECM");
        v.setVilleEcole("Cotonou");
        v.setPaysEcole("BENIN");
        v.setDateDebutFormation(new Date());
        v.setDateFinFormation(new Date());
        v.setDiplomeFinFormation("Néant");
        v.setNiveau(Formation.BAC3);
        v.setDomaineCompetence("Programmation Java");
        
      //création d'un nouvel Candidat      
        System.out.println( "Création d'un Candidat");
        Candidat c = new Candidat();
        c.setIdCandidat("C02");
//        c.setNiveau(Formation.BAC2);
//        c.setCv( " BAC 2002");
//        c.setIdMetier("M04");
        
        //création d'un nouvel Demande      
        System.out.println( "Création d'une Demande");
        Demande d = new Demande();
        d.setIdDemande("D01");
        d.setValidite(Boolean.TRUE);
        
        //création d'un nouvel Metier      
//        System.out.println( "Création d'un Metier");
//        Metier m = new Metier();
//        m.setIdMetier("M10");
//        m.setLibMetier("Comptable");
//        m.setExperiencePro("2ans");
        
        //création d'un nouvel Offre      
        System.out.println( "Création d'une Offre");
        Offre o = new Offre();
        o.setIdOffre("O01");
        o.setDescription("Recherche des infirmiers");
        o.setDateDebut(new Date());
        o.setDateFin(new Date(2018,11,22));
        
        //création d'un nouvel Postuler      
        System.out.println( "Création d'un Postuler");
        Postuler p = new Postuler();
        p.setIdPost("P01");
        p.setLibPost("Offre d'emplois");
        p.setDatePost(new Date());
        
        //création d'un nouvel Recruteur      
        System.out.println( "Création d'un Recruteur");
        Recruteur r = new Recruteur();
        r.setIdRecruteur("R01");
        r.setLibSociete("ECOBANK");
        
//        //création d'un nouvel Users      
        System.out.println( "Création d'un Users");
         Users u = new Users();
        u.setIdUser("U01");
        u.setNom("DAOUDA");
        u.setPrenom("Achraf");
        u.setDateNaissance(new Date(1995,05,06));
        u.setAdresse("Porto-Novo");
        u.setPassword("pw005");
        
        //--- persistons cette personne dans la base
        EntityTransaction tx = em.getTransaction();
        System.out.println("Début de la transaction");
        tx.begin();
        try {
            System.out.println("Ajout dans la base en cours...");
            em.persist(v);
            em.persist(c);
            em.persist(d);
//            em.persist(m);
            em.persist(o);
            em.persist(p);
            em.persist(r);
            em.persist(u);
            

            BaseRepository b = new BaseRepository("GesJob_Pu",Candidat.class);
//            c.setIdCandidat("C01");
   
            //Suppresion d'un objet
            b.delete(c);
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