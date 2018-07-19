/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.Formation;
import Repositories.BaseRepository;
import Repositories.CandidatRepository;
import java.sql.SQLException;

/**
 *
 * @author ATANDA
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws SQLException{
        // TODO code application logic here
                //SUPPRESSION EN CASCADE
         System.out.println("Suppresion en cours");
        try
        {
          //SUPPRESSION DE REGION CandidatRepository
            CandidatRepository candidatRepository = new CandidatRepository("GesJob_Pu");
            BaseRepository baseRepository = new BaseRepository();
           //System.out.println("*****Affichage d'un candidat******"+candidatRepository.getCandidatById("C06"));
           System.out.println("*****Suppression d'un Candidat*****"+candidatRepository.deleteById("c10"));
           System.out.println("*****Liste des Candidats de la base******"+candidatRepository.findAll());
         
        }
        
        catch (Exception e)
        {
             //MESSAGE D'ERREUR
            System.out.println("Le Candidat n'a pas été supprimée");
        } 
        
//        // MODIFICATION DES DONNEES DE BASE
//        //Pour le candidat
//        CandidatRepository candidatRepository = new CandidatRepository("GesJob_Pu");
//        System.out.println("Modification en cours");
//        System.out.println("*****Candidat******" + candidatRepository.getCandidatById("C06"));
//        Candidat candidat = candidatRepository.getCandidatById("C06");
//        candidat.setIdMetier("M02");
//        candidat.setCv("Mon pdf de CV c06");
//        candidat.setNiveau(Formation.BAC3);
//        candidatRepository.update(candidat);
//        System.out.println("+++++ pour voir le candidat " + candidat.toString());
//        System.out.println("+++++ La liste de tous les candidats" + candidatRepository.findAll());
//        
//        
    }
    
}
