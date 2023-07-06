/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Admin;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author messia messia j l
 */
public class GestionnaireAdmn { // (c'est Admin ici)
    
    private Admin admin = new Admin(); // on crée un attribut admin de type Admin
    
    public Admin login(String login, String pwd) throws SQLException{ 
        
        return admin.getByLoginAndPassword(login, pwd); // appelle la fonction getByLoginAndPassword qu'on a créé dans Admin
    }
    
    public void saveAdmin(String login, String password, String nom) throws SQLException{
        admin.save(login, password, nom);
    }
    
    public List<Admin> listAllAdmin() throws SQLException{
        return admin.getAllAdmin();
    }
    
    
}
