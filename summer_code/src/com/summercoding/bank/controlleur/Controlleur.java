/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.controlleur;

import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Utilisateur;
import com.summercoding.bank.gestionnaires.GestionnaireAdmn;
import com.summercoding.bank.gestionnaires.GestionnaireCompte;
import com.summercoding.bank.gestionnaires.GestionnaireUtilisateur;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author messia messia j l
 */
public class Controlleur {
    //Pour le gestionnaire Admin
    GestionnaireAdmn gestionnaireAdmin = new GestionnaireAdmn();
    
    public Admin routeVersLogin(String login, String pwd) throws SQLException{
        return gestionnaireAdmin.login(login, pwd);
    }
    
    public void routeVersSaveAdmin(String login, String password, String nom) throws SQLException{
        gestionnaireAdmin.saveAdmin(login, password, nom);
    }
    
    public List<Admin> routeVerslistAllAdmin() throws SQLException{
        return gestionnaireAdmin.listAllAdmin();
    }
    
    
    //Pour le gestionnaire Utilisateur
    GestionnaireUtilisateur gestionnaireUtilisateur = new GestionnaireUtilisateur();
    
    public Utilisateur routeVersLoginUtilisateur(String login, String password) throws SQLException{
        return gestionnaireUtilisateur.login(login, password);
    }
    
    public void routeVersSaveUtilisateur(String login, String password, String nom, String prenom, LocalDate datenaiss, String genre, int idadmin) throws SQLException{
        gestionnaireUtilisateur.saveUtilisateur(login, password, nom, prenom, datenaiss, genre, idadmin);
    }
    
    public List<Utilisateur> routeVersListAllUtilisateur() throws SQLException{
        return gestionnaireUtilisateur.listAllUtilisateur();
    }
    
    
    //Pour le gestionnaire Compte
    GestionnaireCompte gestionnaireCompte = new GestionnaireCompte();
    
    public void routeVersSaveCompte(double solde, int iduser, int idadmin) throws SQLException{
        gestionnaireCompte.saveCompte(solde, iduser, idadmin);
    }
}
