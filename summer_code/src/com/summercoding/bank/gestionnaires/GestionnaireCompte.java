/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.gestionnaires;

import com.summercoding.bank.entities.Compte;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author messia messia j l
 */
public class GestionnaireCompte {
    
    private Compte compte = new Compte();
    
    public void saveCompte(double solde, int iduser, int idadmin) throws SQLException{
        compte.save(solde, iduser, idadmin);
    }
    
    public List<Compte> listAllCompte() throws SQLException{
        return compte.getAllCompte();
    }
}
