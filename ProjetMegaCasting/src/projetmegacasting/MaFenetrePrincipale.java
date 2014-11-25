/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmegacasting;

import javax.swing.JFrame;

/**
 *
 * @author
 * HP
 */
public class MaFenetrePrincipale extends javax.swing.JFrame {

    
   
    
    public MaFenetrePrincipale() {
        initComponents();
         Panel_ajouter.setVisible(false);
         Panel_lister.setVisible(false);
         Panel_modifier.setVisible(false);
         Panel_rechercher.setVisible(false);
         Panel_supprimer.setVisible(false);
    }

    /**
     * This
     * method
     * is
     * called
     * from
     * within
     * the
     * constructor
     * to
     * initialize
     * the
     * form.
     * WARNING:
     * Do
     * NOT
     * modify
     * this
     * code.
     * The
     * content
     * of
     * this
     * method
     * is
     * always
     * regenerated
     * by
     * the
     * Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Panel_principal = new javax.swing.JPanel();
        Bouton_menu_ajouter = new javax.swing.JButton();
        Bouton_menu_modifier = new javax.swing.JButton();
        Bouton_menu_supprimer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Bouton_menu_lister = new javax.swing.JButton();
        Bouton_menu_rechercher = new javax.swing.JButton();
        Panel_ajouter = new javax.swing.JPanel();
        jButton_retour_ajouter = new javax.swing.JButton();
        jTabbedPane21 = new javax.swing.JTabbedPane();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jTabbedPane23 = new javax.swing.JTabbedPane();
        jTabbedPane24 = new javax.swing.JTabbedPane();
        jTabbedPane25 = new javax.swing.JTabbedPane();
        jTabbedPane26 = new javax.swing.JTabbedPane();
        jTabbedPane27 = new javax.swing.JTabbedPane();
        jTabbedPane28 = new javax.swing.JTabbedPane();
        jTabbedPane29 = new javax.swing.JTabbedPane();
        jTabbedPane30 = new javax.swing.JTabbedPane();
        Panel_modifier = new javax.swing.JPanel();
        jButton_retour_modifier = new javax.swing.JButton();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        jTabbedPane15 = new javax.swing.JTabbedPane();
        jTabbedPane16 = new javax.swing.JTabbedPane();
        jTabbedPane17 = new javax.swing.JTabbedPane();
        jTabbedPane18 = new javax.swing.JTabbedPane();
        jTabbedPane19 = new javax.swing.JTabbedPane();
        jTabbedPane20 = new javax.swing.JTabbedPane();
        Panel_rechercher = new javax.swing.JPanel();
        jButton_retour_rechercher = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        Panel_lister = new javax.swing.JPanel();
        jButton_retour_lister = new javax.swing.JButton();
        jTabbedPane31 = new javax.swing.JTabbedPane();
        jTabbedPane32 = new javax.swing.JTabbedPane();
        jTabbedPane33 = new javax.swing.JTabbedPane();
        jTabbedPane34 = new javax.swing.JTabbedPane();
        jTabbedPane35 = new javax.swing.JTabbedPane();
        jTabbedPane36 = new javax.swing.JTabbedPane();
        jTabbedPane37 = new javax.swing.JTabbedPane();
        jTabbedPane38 = new javax.swing.JTabbedPane();
        jTabbedPane39 = new javax.swing.JTabbedPane();
        jTabbedPane40 = new javax.swing.JTabbedPane();
        Panel_supprimer = new javax.swing.JPanel();
        jButton_retour_supprimer = new javax.swing.JButton();
        jTabbedPane41 = new javax.swing.JTabbedPane();
        jTabbedPane42 = new javax.swing.JTabbedPane();
        jTabbedPane43 = new javax.swing.JTabbedPane();
        jTabbedPane44 = new javax.swing.JTabbedPane();
        jTabbedPane45 = new javax.swing.JTabbedPane();
        jTabbedPane46 = new javax.swing.JTabbedPane();
        jTabbedPane47 = new javax.swing.JTabbedPane();
        jTabbedPane48 = new javax.swing.JTabbedPane();
        jTabbedPane49 = new javax.swing.JTabbedPane();
        jTabbedPane50 = new javax.swing.JTabbedPane();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application MegaCasting");
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setResizable(false);

        Panel_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_principal.setName(""); // NOI18N
        Panel_principal.setLayout(null);

        Bouton_menu_ajouter.setText("Ajouter");
        Bouton_menu_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_menu_ajouterActionPerformed(evt);
            }
        });
        Panel_principal.add(Bouton_menu_ajouter);
        Bouton_menu_ajouter.setBounds(0, 260, 105, 60);

        Bouton_menu_modifier.setText("Modifier");
        Bouton_menu_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_menu_modifierActionPerformed(evt);
            }
        });
        Panel_principal.add(Bouton_menu_modifier);
        Bouton_menu_modifier.setBounds(120, 260, 105, 60);

        Bouton_menu_supprimer.setText("Supprimer");
        Bouton_menu_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_menu_supprimerActionPerformed(evt);
            }
        });
        Panel_principal.add(Bouton_menu_supprimer);
        Bouton_menu_supprimer.setBounds(480, 260, 105, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Panel_principal.add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 250);

        Bouton_menu_lister.setText("Lister");
        Bouton_menu_lister.setMaximumSize(new java.awt.Dimension(87, 23));
        Bouton_menu_lister.setMinimumSize(new java.awt.Dimension(87, 23));
        Bouton_menu_lister.setPreferredSize(new java.awt.Dimension(87, 23));
        Bouton_menu_lister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_menu_listerActionPerformed(evt);
            }
        });
        Panel_principal.add(Bouton_menu_lister);
        Bouton_menu_lister.setBounds(360, 260, 105, 60);

        Bouton_menu_rechercher.setText("Rechercher");
        Bouton_menu_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_menu_rechercherActionPerformed(evt);
            }
        });
        Panel_principal.add(Bouton_menu_rechercher);
        Bouton_menu_rechercher.setBounds(240, 260, 105, 60);

        Panel_ajouter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_ajouter.setLayout(null);

        jButton_retour_ajouter.setText("Retour au menu principal");
        jButton_retour_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_ajouterActionPerformed(evt);
            }
        });
        Panel_ajouter.add(jButton_retour_ajouter);
        jButton_retour_ajouter.setBounds(420, 290, 160, 30);

        jTabbedPane21.addTab("anonceur", jTabbedPane22);
        jTabbedPane21.addTab("contrat", jTabbedPane23);
        jTabbedPane21.addTab("diffuseur", jTabbedPane24);
        jTabbedPane21.addTab("domaine", jTabbedPane25);
        jTabbedPane21.addTab("information", jTabbedPane26);
        jTabbedPane21.addTab("media", jTabbedPane27);
        jTabbedPane21.addTab("metier", jTabbedPane28);
        jTabbedPane21.addTab("offre", jTabbedPane29);
        jTabbedPane21.addTab("type_media", jTabbedPane30);

        Panel_ajouter.add(jTabbedPane21);
        jTabbedPane21.setBounds(0, 0, 620, 350);

        Panel_modifier.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_modifier.setLayout(null);

        jButton_retour_modifier.setText("Retour au menu principal");
        jButton_retour_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_modifierActionPerformed(evt);
            }
        });
        Panel_modifier.add(jButton_retour_modifier);
        jButton_retour_modifier.setBounds(420, 290, 160, 30);

        jTabbedPane11.addTab("anonceur", jTabbedPane12);
        jTabbedPane11.addTab("contrat", jTabbedPane13);
        jTabbedPane11.addTab("diffuseur", jTabbedPane14);
        jTabbedPane11.addTab("domaine", jTabbedPane15);
        jTabbedPane11.addTab("information", jTabbedPane16);
        jTabbedPane11.addTab("media", jTabbedPane17);
        jTabbedPane11.addTab("metier", jTabbedPane18);
        jTabbedPane11.addTab("offre", jTabbedPane19);
        jTabbedPane11.addTab("type_media", jTabbedPane20);

        Panel_modifier.add(jTabbedPane11);
        jTabbedPane11.setBounds(0, 0, 620, 350);

        Panel_rechercher.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_rechercher.setLayout(null);

        jButton_retour_rechercher.setText("Retour au menu principal");
        jButton_retour_rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_rechercherActionPerformed(evt);
            }
        });
        Panel_rechercher.add(jButton_retour_rechercher);
        jButton_retour_rechercher.setBounds(430, 300, 160, 30);

        jTabbedPane1.addTab("anonceur", jTabbedPane2);
        jTabbedPane1.addTab("contrat", jTabbedPane3);
        jTabbedPane1.addTab("diffuseur", jTabbedPane4);
        jTabbedPane1.addTab("domaine", jTabbedPane5);
        jTabbedPane1.addTab("information", jTabbedPane6);
        jTabbedPane1.addTab("media", jTabbedPane7);
        jTabbedPane1.addTab("metier", jTabbedPane8);
        jTabbedPane1.addTab("offre", jTabbedPane9);
        jTabbedPane1.addTab("type_media", jTabbedPane10);

        Panel_rechercher.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 620, 350);

        Panel_lister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_lister.setLayout(null);

        jButton_retour_lister.setText("Retour au menu principal");
        jButton_retour_lister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_listerActionPerformed(evt);
            }
        });
        Panel_lister.add(jButton_retour_lister);
        jButton_retour_lister.setBounds(430, 270, 160, 30);

        jTabbedPane31.addTab("anonceur", jTabbedPane32);
        jTabbedPane31.addTab("contrat", jTabbedPane33);
        jTabbedPane31.addTab("diffuseur", jTabbedPane34);
        jTabbedPane31.addTab("domaine", jTabbedPane35);
        jTabbedPane31.addTab("information", jTabbedPane36);
        jTabbedPane31.addTab("media", jTabbedPane37);
        jTabbedPane31.addTab("metier", jTabbedPane38);
        jTabbedPane31.addTab("offre", jTabbedPane39);
        jTabbedPane31.addTab("type_media", jTabbedPane40);

        Panel_lister.add(jTabbedPane31);
        jTabbedPane31.setBounds(0, 0, 620, 350);

        Panel_supprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_supprimer.setLayout(null);

        jButton_retour_supprimer.setText("Retour au menu principal");
        jButton_retour_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_supprimerActionPerformed(evt);
            }
        });
        Panel_supprimer.add(jButton_retour_supprimer);
        jButton_retour_supprimer.setBounds(430, 260, 160, 30);

        jTabbedPane41.addTab("anonceur", jTabbedPane42);
        jTabbedPane41.addTab("contrat", jTabbedPane43);
        jTabbedPane41.addTab("diffuseur", jTabbedPane44);
        jTabbedPane41.addTab("domaine", jTabbedPane45);
        jTabbedPane41.addTab("information", jTabbedPane46);
        jTabbedPane41.addTab("media", jTabbedPane47);
        jTabbedPane41.addTab("metier", jTabbedPane48);
        jTabbedPane41.addTab("offre", jTabbedPane49);
        jTabbedPane41.addTab("type_media", jTabbedPane50);

        Panel_supprimer.add(jTabbedPane41);
        jTabbedPane41.setBounds(0, 0, 620, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(Panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Panel_ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addContainerGap(23, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(Panel_modifier, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Panel_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_lister, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Panel_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Panel_ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(Panel_modifier, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Panel_rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(Panel_lister, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(Panel_supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_menu_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_menu_ajouterActionPerformed
       Panel_ajouter.setVisible(true);
       Panel_principal.setVisible(false);
    }//GEN-LAST:event_Bouton_menu_ajouterActionPerformed

    private void Bouton_menu_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_menu_modifierActionPerformed
       Panel_modifier.setVisible(true);
       Panel_principal.setVisible(false);
    }//GEN-LAST:event_Bouton_menu_modifierActionPerformed

    private void Bouton_menu_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_menu_rechercherActionPerformed
       Panel_rechercher.setVisible(true);
       Panel_principal.setVisible(false);
    }//GEN-LAST:event_Bouton_menu_rechercherActionPerformed

    private void Bouton_menu_listerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_menu_listerActionPerformed
       Panel_lister.setVisible(true);
       Panel_principal.setVisible(false);
    }//GEN-LAST:event_Bouton_menu_listerActionPerformed

    private void Bouton_menu_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_menu_supprimerActionPerformed
       Panel_supprimer.setVisible(true);
       Panel_principal.setVisible(false);
    }//GEN-LAST:event_Bouton_menu_supprimerActionPerformed

    private void jButton_retour_listerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_listerActionPerformed
       Panel_lister.setVisible(false);
       Panel_principal.setVisible(true);
    }//GEN-LAST:event_jButton_retour_listerActionPerformed

    private void jButton_retour_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_ajouterActionPerformed
       Panel_ajouter.setVisible(false);
       Panel_principal.setVisible(true);
    }//GEN-LAST:event_jButton_retour_ajouterActionPerformed

    private void jButton_retour_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_modifierActionPerformed
       Panel_modifier.setVisible(false);
       Panel_principal.setVisible(true);
    }//GEN-LAST:event_jButton_retour_modifierActionPerformed

    private void jButton_retour_rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_rechercherActionPerformed
       Panel_rechercher.setVisible(false);
       Panel_principal.setVisible(true);
    }//GEN-LAST:event_jButton_retour_rechercherActionPerformed

    private void jButton_retour_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_supprimerActionPerformed
       Panel_supprimer.setVisible(false);
       Panel_principal.setVisible(true);
    }//GEN-LAST:event_jButton_retour_supprimerActionPerformed

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
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
            java.util.logging.Logger.getLogger(MaFenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaFenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaFenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaFenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaFenetrePrincipale().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_menu_ajouter;
    private javax.swing.JButton Bouton_menu_lister;
    private javax.swing.JButton Bouton_menu_modifier;
    private javax.swing.JButton Bouton_menu_rechercher;
    private javax.swing.JButton Bouton_menu_supprimer;
    private javax.swing.JPanel Panel_ajouter;
    private javax.swing.JPanel Panel_lister;
    private javax.swing.JPanel Panel_modifier;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JPanel Panel_rechercher;
    private javax.swing.JPanel Panel_supprimer;
    private javax.swing.JButton jButton_retour_ajouter;
    private javax.swing.JButton jButton_retour_lister;
    private javax.swing.JButton jButton_retour_modifier;
    private javax.swing.JButton jButton_retour_rechercher;
    private javax.swing.JButton jButton_retour_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane15;
    private javax.swing.JTabbedPane jTabbedPane16;
    private javax.swing.JTabbedPane jTabbedPane17;
    private javax.swing.JTabbedPane jTabbedPane18;
    private javax.swing.JTabbedPane jTabbedPane19;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane20;
    private javax.swing.JTabbedPane jTabbedPane21;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTabbedPane jTabbedPane23;
    private javax.swing.JTabbedPane jTabbedPane24;
    private javax.swing.JTabbedPane jTabbedPane25;
    private javax.swing.JTabbedPane jTabbedPane26;
    private javax.swing.JTabbedPane jTabbedPane27;
    private javax.swing.JTabbedPane jTabbedPane28;
    private javax.swing.JTabbedPane jTabbedPane29;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane30;
    private javax.swing.JTabbedPane jTabbedPane31;
    private javax.swing.JTabbedPane jTabbedPane32;
    private javax.swing.JTabbedPane jTabbedPane33;
    private javax.swing.JTabbedPane jTabbedPane34;
    private javax.swing.JTabbedPane jTabbedPane35;
    private javax.swing.JTabbedPane jTabbedPane36;
    private javax.swing.JTabbedPane jTabbedPane37;
    private javax.swing.JTabbedPane jTabbedPane38;
    private javax.swing.JTabbedPane jTabbedPane39;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane40;
    private javax.swing.JTabbedPane jTabbedPane41;
    private javax.swing.JTabbedPane jTabbedPane42;
    private javax.swing.JTabbedPane jTabbedPane43;
    private javax.swing.JTabbedPane jTabbedPane44;
    private javax.swing.JTabbedPane jTabbedPane45;
    private javax.swing.JTabbedPane jTabbedPane46;
    private javax.swing.JTabbedPane jTabbedPane47;
    private javax.swing.JTabbedPane jTabbedPane48;
    private javax.swing.JTabbedPane jTabbedPane49;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane50;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    // End of variables declaration//GEN-END:variables
}
