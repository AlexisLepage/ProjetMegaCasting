/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.CardLayout;

/**
 *
 * @author
 * Alexis
 */
public class AcceuilForm extends javax.swing.JPanel {

    private MaFenetrePrincipale mafenetreprincipal;
    
    public AcceuilForm(MaFenetrePrincipale maFenetrePrincipale){
        this.mafenetreprincipal = maFenetrePrincipale;
        initComponents();
    }
    
    /**
     * Creates
     * new
     * form
     * Acceuil
     */
    public AcceuilForm() {
        initComponents();
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButton_information = new javax.swing.JButton();
        jButton_metier = new javax.swing.JButton();
        jButton_diffuseur = new javax.swing.JButton();
        jButton_media = new javax.swing.JButton();
        jButton_offre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_domaine = new javax.swing.JButton();
        jButton_annonceur = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jButton_information.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_information.setText("Information");
        jButton_information.setToolTipText("");
        jButton_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_informationActionPerformed(evt);
            }
        });

        jButton_metier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_metier.setText("Metier");
        jButton_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metierActionPerformed(evt);
            }
        });

        jButton_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_diffuseur.setText("Diffuseur");
        jButton_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_diffuseurActionPerformed(evt);
            }
        });

        jButton_media.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_media.setText("Media");
        jButton_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mediaActionPerformed(evt);
            }
        });

        jButton_offre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_offre.setText("Offre");
        jButton_offre.setToolTipText("");
        jButton_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_offreActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(620, 250));
        jLabel1.setMinimumSize(new java.awt.Dimension(620, 250));

        jButton_domaine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_domaine.setText("Domaine");
        jButton_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_domaineActionPerformed(evt);
            }
        });

        jButton_annonceur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_annonceur.setText("Annonceur");
        jButton_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_information, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jButton_annonceur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_media, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_diffuseur, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jButton_domaine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_media, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_information, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_offre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_informationActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "informationCard");
    }//GEN-LAST:event_jButton_informationActionPerformed

    private void jButton_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metierActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "metierCard");
    }//GEN-LAST:event_jButton_metierActionPerformed

    private void jButton_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_diffuseurActionPerformed
       CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "diffuseurCard");
    }//GEN-LAST:event_jButton_diffuseurActionPerformed

    private void jButton_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mediaActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "mediaCard");
    }//GEN-LAST:event_jButton_mediaActionPerformed

    private void jButton_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_offreActionPerformed
       CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "offreCard");
    }//GEN-LAST:event_jButton_offreActionPerformed

    private void jButton_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_domaineActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "domaineCard");
    }//GEN-LAST:event_jButton_domaineActionPerformed

    private void jButton_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annonceurActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "annonceurCard");
    }//GEN-LAST:event_jButton_annonceurActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_annonceur;
    private javax.swing.JButton jButton_diffuseur;
    private javax.swing.JButton jButton_domaine;
    private javax.swing.JButton jButton_information;
    private javax.swing.JButton jButton_media;
    private javax.swing.JButton jButton_metier;
    private javax.swing.JButton jButton_offre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
