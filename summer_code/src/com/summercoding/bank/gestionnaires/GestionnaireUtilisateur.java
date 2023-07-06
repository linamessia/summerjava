/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Utilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author messia messia j l
 */
public class GestionnaireUtilisateur {
    
    private Utilisateur utilisateur = new Utilisateur();
    
    public Utilisateur login(String login, String password) throws SQLException{ 
        
        return utilisateur.getByLoginAndPassword(login, password); // appelle la fonction getByLoginAndPassword qu'on a créé dans Utilisateur
    }
    
    public void saveUtilisateur(String login, String password, String nom, String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
        utilisateur.save(login, password, nom, prenom, datenaiss, genre, idadmin);
    }
    
    public List<Utilisateur> listAllUtilisateur() throws SQLException{
        return utilisateur.getAllUtilisateur();
    }
}
