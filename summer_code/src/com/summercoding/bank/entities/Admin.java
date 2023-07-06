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
public class Admin {
    int idAdmin;
    String login;
    String password;
    String nom;

    public void save(String login, String password, String nom) throws SQLException{ //cette méthode enregistre un admin
        PreparedStatement addstmt = null;
            String command = "INSERT INTO `admin` (`login`, `password`, `nom`) VALUES (?, ?, ?)"; // on écrit la requête
        
            addstmt = JDBC.getConnexion().prepareStatement(command); // on prépare la requête
            // on paramètre les données de l'admin
            addstmt.setObject(1,login);
            addstmt.setObject(2,password);
            addstmt.setObject(3,nom);
            addstmt.execute(); // on exécute la requête
        
    }
    
    public void update(int idadmin, String login, String password, String nom) throws SQLException{ // cette méthode met à jour les données d'un admin 
            String command = "UPDATE `admin` SET `login` = ?, `password` = ?, `nom` = ? WHERE `admin`.`idadmin` = ?"; //mettre la commande qui est la requete sql(prise dans phpmyadmin), on remplace les valeurs par les points d'interrogation
        
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            // on paramètre les différents éléments dans l'ordre de la requête
            addstmt.setObject(1,login);
            addstmt.setObject(2,password);
            addstmt.setObject(3,nom);
            addstmt.setObject(4,idadmin);
            addstmt.execute();
        
    }
    
     public void delete(int idadmin) throws SQLException{
            String command = "DELETE FROM admin WHERE `admin`.`idadmin` = ?"; 
            PreparedStatement addstmt = JDBC.getConnexion().prepareStatement(command);
            addstmt.setObject(1,idadmin);
            addstmt.execute();
    }
     
    
    public Admin getOne(int idadmin) throws SQLException{ // cette méthode retourne un admin à partir de son id
        String cmd = "select * from admin where idadmin = ?"; // on sélectionne l'admin en fonction de son id
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd); // on prépare la requête
        stmt.setObject(1, idadmin); // on paramètre l'id ou alors on entre l'id de l'admin dont on souhaite avoir les informations
        ResultSet rs = stmt.executeQuery(); // on exécute la requête
        while(rs.next()){
            return new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)); // on retourne l'admin en question avec toutes ses informations
        }
        return null; // on retourne null si on n'a pas trouvé un admin qui correspond à l'id entré
    }
    
    
    public Admin getByLoginAndPassword(String login, String password) throws SQLException{
        String cmd = "select * from admin where login = ? and password = ?";
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd);
        stmt.setObject(1, login);
        stmt.setObject(2, password);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            return new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }
        return null;
    }
    
    public List<Admin> getAllAdmin() throws SQLException{ // méthode pour retourner une liste d'admins
        String cmd = "select * from admin"; // on selectionne tous les admins de la bd
        PreparedStatement stmt = JDBC.getConnexion().prepareStatement(cmd); // on prépare la requete
        
        ResultSet rs = stmt.executeQuery(); // on execute la requete
        
        List <Admin> listAdmin = new ArrayList<>(); // on déclare une variable qui va contenir la liste de tous les admins
        while(rs.next()){
            listAdmin.add(new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4))); // on ajoute un admin dans la liste
        }
        return listAdmin; // on retourne la liste des admins
    }
    
    
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Admin() {
    }

    public Admin(int idAdmin, String login, String password, String nom) {
        this.idAdmin = idAdmin;
        this.login = login;
        this.password = password;
        this.nom = nom;
    }
// on veut tester avec le main ce qu'on a obtenu dans la bd avec cette methode
    @Override
    public String toString() {
        return "Admin{" + "idAdmin=" + idAdmin + ", login=" + login + ", password=" + password + ", nom=" + nom + '}';
    }
    
    
    // le main nous aide à tester tout ce qu'on a écrit dans le code
    public static void main(String arg[]){
        try {
            Admin admin = new Admin();
            //admin.save("tamo", "gilbert","dagobert");
            
            String result = admin.getOne(2).toString(); // aide à convertir cet objet en un string, ça récupère les données de l'admin qui a l'id 2
            System.out.println(result);
            
            result = admin.getAllAdmin().toString();
            System.out.println(result); // on écrit le résultat
            
            result = admin.getByLoginAndPassword("root", "root").toString();
            System.out.println(result);
            
            // admin.delete(3);  //System.out.println(result);
            
            admin.update(2, "root", "lina", "lina"); // pour tester la méthode update
            
            // System.out.println(admin.getOne(1).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}