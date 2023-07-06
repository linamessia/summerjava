/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.summercoding.bank.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author messia messia j l
 */
public class JDBC {
    private final static String URL = "jdbc:mysql://localhost:3306/summerbankdb";
    private final static String USER ="root"; 
    private final static String PASSWORD = "";
    
    public static Connection getConnexion(){
        
       
        try {
            Connection connexion = null;
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("fin chargement jdbc.Jdbc.main()");
            
            return(Connection) DriverManager.getConnection(URL, USER, PASSWORD); //on se connecte à la bd avec le username et le mot de passe
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
