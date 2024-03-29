/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.summercoding.bank.ui;


import com.summercoding.bank.controlleur.Controlleur;
import com.summercoding.bank.entities.Admin;
import com.summercoding.bank.entities.Compte;
import com.summercoding.bank.entities.Utilisateur;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author messia messia j l
 */
public class JFrameHome extends javax.swing.JFrame {

     Controlleur controlleur = new Controlleur();
    
   JFrameSaveAdmin saveAdmin = new JFrameSaveAdmin();
   
   JFrameSavUtilisateur2 saveutilisateur = new JFrameSavUtilisateur2();
   
   JFrameSaveCompte2 savecompte = new JFrameSaveCompte2();
    /**
     * Creates new form JFrameHome
     */
    public JFrameHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableListeAdmin = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCreerAdmin = new javax.swing.JMenuItem();
        MenuListerAdmin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuCreerUtilisateur = new javax.swing.JMenuItem();
        MenuListerUtilisateur = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuCreerCompte = new javax.swing.JMenuItem();
        MenuListerCompte = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");

        TableListeAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableListeAdmin);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 372, Short.MAX_VALUE))
        );

        jMenu1.setText("Admin");

        MenuCreerAdmin.setText("Créer");
        MenuCreerAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreerAdminActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCreerAdmin);

        MenuListerAdmin.setText("Lister");
        MenuListerAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListerAdminActionPerformed(evt);
            }
        });
        jMenu1.add(MenuListerAdmin);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Utilisateur");

        MenuCreerUtilisateur.setText("Créer");
        MenuCreerUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreerUtilisateurActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCreerUtilisateur);

        MenuListerUtilisateur.setText("Lister");
        MenuListerUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListerUtilisateurActionPerformed(evt);
            }
        });
        jMenu2.add(MenuListerUtilisateur);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Compte");

        MenuCreerCompte.setText("Créer");
        MenuCreerCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCreerCompteActionPerformed(evt);
            }
        });
        jMenu3.add(MenuCreerCompte);

        MenuListerCompte.setText("Lister");
        MenuListerCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListerCompteActionPerformed(evt);
            }
        });
        jMenu3.add(MenuListerCompte);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("A Propos");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Aide");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCreerAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCreerAdminActionPerformed
        // TODO add your handling code here:
        saveAdmin.setVisible(true);
    }//GEN-LAST:event_MenuCreerAdminActionPerformed

    private void MenuListerAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListerAdminActionPerformed
         try {
             // TODO add your handling code here:
             
             // Pour manipuler un datatable de façon manuelle
//             String [] columns = new String [] {
//                 "Id", "Nom", "Login"
//             };
//             
//             String[][] datas = new String[][]{
//                 // ou alors Object [][] datas = new Object[][]
//                 {"1", "toto","toto"},
//                 {"1", "toto","toto"},
//                 {"1", "toto","toto"},
//                 {"1", "toto","toto"}
//             };
               // TableListeAdmin.setModel(new DefaultTableModel(datas, columns));
               
               
             List<Admin> listAdmin = controlleur.routeVerslistAllAdmin();
             DefaultTableModel model = new DefaultTableModel() ; 
             model.addColumn("Id");
             model.addColumn("Nom");
             model.addColumn("Login");
             
             for(Admin ad : listAdmin){
                 model.addRow(new String[]{ad.getIdAdmin()+"", ad.getNom()+"", ad.getLogin()});
             }
             TableListeAdmin.setModel(model);
             
         } catch (SQLException ex) {
             Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_MenuListerAdminActionPerformed

    private void MenuCreerUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCreerUtilisateurActionPerformed
        // TODO add your handling code here:
        saveutilisateur.setVisible(true);
    }//GEN-LAST:event_MenuCreerUtilisateurActionPerformed

    private void MenuListerUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListerUtilisateurActionPerformed
         try {
             // TODO add your handling code here:
             List<Utilisateur> listUtilisateur = controlleur.routeVersListAllUtilisateur();
             DefaultTableModel model1 = new DefaultTableModel() ;
             model1.addColumn("Id");
             model1.addColumn("Login");
             model1.addColumn("Nom");
             model1.addColumn("Prénom");
             model1.addColumn("Date de naissance");
             model1.addColumn("Genre");
             
             for(Utilisateur user: listUtilisateur){
                 model1.addRow(new String[]{user.getIduser()+"", user.getLogin()+"", user.getNom()+"", user.getPrenom()+"", user.getDatenaiss()+"", user.getGenre()});
             }
             TableListeAdmin.setModel(model1);
         } catch (SQLException ex) {
             Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_MenuListerUtilisateurActionPerformed

    private void MenuCreerCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCreerCompteActionPerformed
        // TODO add your handling code here:
        savecompte.setVisible(true);
    }//GEN-LAST:event_MenuCreerCompteActionPerformed

    private void MenuListerCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListerCompteActionPerformed
         try {
             // TODO add your handling code here:
             List<Compte> listCompte = controlleur.routeVersListAllCompte();
             DefaultTableModel model2 = new DefaultTableModel() ;
             model2.addColumn("Idcompte");
             model2.addColumn("Iduser");
             model2.addColumn("Solde");
             
             for(Compte compte: listCompte){
                 model2.addRow(new String[]{compte.getIdcompte()+"", compte.getIduser()+"", compte.getSolde()+""});
             }
             TableListeAdmin.setModel(model2);
         }catch (SQLException ex) {
             Logger.getLogger(JFrameHome.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_MenuListerCompteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCreerAdmin;
    private javax.swing.JMenuItem MenuCreerCompte;
    private javax.swing.JMenuItem MenuCreerUtilisateur;
    private javax.swing.JMenuItem MenuListerAdmin;
    private javax.swing.JMenuItem MenuListerCompte;
    private javax.swing.JMenuItem MenuListerUtilisateur;
    private javax.swing.JTable TableListeAdmin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
