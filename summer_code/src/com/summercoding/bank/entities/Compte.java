/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.entities;

import com.summercoding.bank.utils.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author messia messia j l
 */
public class Compte {
    int idcompte;
    double solde;
    int iduser;
    int idadmin;

public void save(double solde, int iduser, int idadmin)throws SQLException{
        String command = "INSERT INTO `compte` (`solde`, `iduser`, `idadmin`) VALUES (?, ?, ?)";
        
        PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
        addstmt.setObject(1, solde);
        addstmt.setObject(2, iduser);
        addstmt.setObject(3, idadmin);
        addstmt.execute();   
}    

public void update(int idcompte, double solde, int iduser, int idadmin)throws SQLException{
        String command = "UPDATE `compte` SET `solde` = ?, `iduser` = ?, `idadmin` = ? WHERE `compte`.`idcompte` = ?";
        
        PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
        addstmt.setObject(1, solde);
        addstmt.setObject(2, iduser);
        addstmt.setObject(3, idadmin);
        addstmt.setObject(4, idcompte);
        addstmt.execute();   
} 

public void delete(int idcompte)throws SQLException{
        String command = "DELETE FROM compte WHERE `compte`.`idcompte` = ?";
        
        PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
        addstmt.setObject(1, idcompte);
        addstmt.execute();   
}    

 public Compte getOne(int idcompte) throws SQLException{ // cette méthode retourne un compte à partir de son id
        String cmd = "select * from compte where idcompte = ?"; // on sélectionne le compte en fonction de son id
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd); // on prépare la requête
        stmt.setObject(1, idcompte); // on paramètre l'id ou alors on entre l'id du compte dont on souhaite avoir les informations
        ResultSet rs = stmt.executeQuery(); // on exécute la requête
        while(rs.next()){
            return new Compte(rs.getInt(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4)); // on retourne le compte en question avec toutes ses informations
        }
        return null; // on retourne null si on n'a pas trouvé un compte qui correspond à l'id entré
    }

 
 public List<Compte> getAllCompte() throws SQLException{ // méthode pour retourner une liste de comptes
        String cmd = "select * from compte"; // on selectionne tous les comptes de la bd
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd); // on prépare la requete
        
        ResultSet rs = stmt.executeQuery(); // on execute la requete
        
        List <Compte> listCompte = new ArrayList<>(); // on déclare une variable qui va contenir la liste de tous les comptes
        while(rs.next()){
            listCompte.add(new Compte(rs.getInt(1), rs.getDouble(2), rs.getInt(3), rs.getInt(4))); // on ajoute un compte dans la liste
        }
        return listCompte; // on retourne la liste des comptes
    }
    
    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    public Compte() {
    }

    public Compte(int idcompte, double solde, int iduser, int idadmin) {
        this.idcompte = idcompte;
        this.solde = solde;
        this.iduser = iduser;
        this.idadmin = idadmin;
    }

    @Override
    public String toString() {
        return "Compte{" + "idcompte=" + idcompte + ", solde=" + solde + ", iduser=" + iduser + ", idadmin=" + idadmin + '}';
    }
    
    
    public static void main(String arg[]){
        try{
            Compte compte = new Compte();
            // compte.save(150000, 4, 1);
            
            String result = compte.getOne(1).toString(); 
            System.out.println(result);
            
            result = compte.getAllCompte().toString();
            System.out.println(result);
            
            // compte.delete(4);
            
            compte.update(2, 400000, 1, 2);
            
        } catch (SQLException ex) {
            Logger.getLogger(Compte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
