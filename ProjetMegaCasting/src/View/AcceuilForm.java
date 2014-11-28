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

        jPanel1 = new javax.swing.JPanel();
        jButton_information = new javax.swing.JButton();
        jButton_metier = new javax.swing.JButton();
        jButton_diffuseur = new javax.swing.JButton();
        jButton_media = new javax.swing.JButton();
        jButton_offre = new javax.swing.JButton();
        jButton_contrat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_domaine = new javax.swing.JButton();
        jButton_typemedia = new javax.swing.JButton();
        jButton_annonceur = new javax.swing.JButton();

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

        jButton_contrat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_contrat.setText("Contrat");
        jButton_contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_contratActionPerformed(evt);
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

        jButton_typemedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_typemedia.setText("TypeMedia");
        jButton_typemedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_typemediaActionPerformed(evt);
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
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_information, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_media, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_typemedia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(jButton_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton_information, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton_media, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jButton_typemedia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jButton_contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_contratActionPerformed
       CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "contratCard");
    }//GEN-LAST:event_jButton_contratActionPerformed

    private void jButton_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_domaineActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "domaineCard");
    }//GEN-LAST:event_jButton_domaineActionPerformed

    private void jButton_typemediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_typemediaActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "type_mediaCard");
    }//GEN-LAST:event_jButton_typemediaActionPerformed

    private void jButton_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annonceurActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "annonceurCard");
    }//GEN-LAST:event_jButton_annonceurActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_annonceur;
    private javax.swing.JButton jButton_contrat;
    private javax.swing.JButton jButton_diffuseur;
    private javax.swing.JButton jButton_domaine;
    private javax.swing.JButton jButton_information;
    private javax.swing.JButton jButton_media;
    private javax.swing.JButton jButton_metier;
    private javax.swing.JButton jButton_offre;
    private javax.swing.JButton jButton_typemedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
