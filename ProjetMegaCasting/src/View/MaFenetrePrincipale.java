/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.panel.Annonceur;
import View.panel.Contrat;
import View.panel.Diffuseur;
import View.panel.Domaine;
import View.panel.Information;
import View.panel.Media;
import View.panel.Metier;
import View.panel.Offre;
import View.panel.Type_Media;
import javax.swing.JFrame;

/**
 *
 * @author
 * HP
 */
public class MaFenetrePrincipale extends javax.swing.JFrame {
    
    
   
    
    public MaFenetrePrincipale() {
        initComponents();
               
    }
    
     Annonceur annonceur = new Annonceur();

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
        jPanel1 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        Panel_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_offre = new javax.swing.JButton();
        jButton_information = new javax.swing.JButton();
        jButton_contrat = new javax.swing.JButton();
        jButton_media = new javax.swing.JButton();
        jButton_diffuseur = new javax.swing.JButton();
        jButton_metier = new javax.swing.JButton();
        jButton_domaine = new javax.swing.JButton();
        jButton_typemedia = new javax.swing.JButton();
        jButton_annonceur = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application MegaCasting");
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setResizable(false);

        Panel_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_principal.setName(""); // NOI18N
        Panel_principal.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(620, 250));
        jLabel1.setMinimumSize(new java.awt.Dimension(620, 250));
        Panel_principal.add(jLabel1);
        jLabel1.setBounds(20, 0, 600, 270);

        jButton_offre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_offre.setText("Offre");
        jButton_offre.setToolTipText("");
        jButton_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_offreActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_offre);
        jButton_offre.setBounds(530, 270, 100, 75);

        jButton_information.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_information.setText("Information");
        jButton_information.setToolTipText("");
        jButton_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_informationActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_information);
        jButton_information.setBounds(10, 310, 120, 35);

        jButton_contrat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_contrat.setText("Contrat");
        jButton_contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_contratActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_contrat);
        jButton_contrat.setBounds(140, 270, 120, 35);

        jButton_media.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_media.setText("Media");
        jButton_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mediaActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_media);
        jButton_media.setBounds(140, 310, 120, 35);

        jButton_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_diffuseur.setText("Diffuseur");
        jButton_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_diffuseurActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_diffuseur);
        jButton_diffuseur.setBounds(270, 270, 120, 35);

        jButton_metier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_metier.setText("Metier");
        jButton_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metierActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_metier);
        jButton_metier.setBounds(270, 310, 120, 35);

        jButton_domaine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_domaine.setText("Domaine");
        jButton_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_domaineActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_domaine);
        jButton_domaine.setBounds(400, 270, 120, 35);

        jButton_typemedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_typemedia.setText("TypeMedia");
        jButton_typemedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_typemediaActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_typemedia);
        jButton_typemedia.setBounds(400, 310, 120, 35);

        jButton_annonceur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_annonceur.setText("Annonceur");
        jButton_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_annonceurActionPerformed(evt);
            }
        });
        Panel_principal.add(jButton_annonceur);
        jButton_annonceur.setBounds(10, 270, 120, 35);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annonceurActionPerformed
       this.getContentPane().remove(Panel_principal);   
       this.getContentPane().add(annonceur);
    }//GEN-LAST:event_jButton_annonceurActionPerformed

    private void jButton_contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_contratActionPerformed
       Panel_principal.setVisible(false);
       Contrat.Panel_contrat.setVisible(true);
    }//GEN-LAST:event_jButton_contratActionPerformed

    private void jButton_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_diffuseurActionPerformed
       Panel_principal.setVisible(false);
       Diffuseur.Panel_diffuseur.setVisible(true);
    }//GEN-LAST:event_jButton_diffuseurActionPerformed

    private void jButton_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_domaineActionPerformed
       Panel_principal.setVisible(false);
       Domaine.Panel_domaine.setVisible(true);
    }//GEN-LAST:event_jButton_domaineActionPerformed

    private void jButton_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_offreActionPerformed
        Panel_principal.setVisible(false);
        Offre.Panel_offre.setVisible(true);
    }//GEN-LAST:event_jButton_offreActionPerformed

    private void jButton_informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_informationActionPerformed
       Panel_principal.setVisible(false);
       Information.Panel_information.setVisible(true);
    }//GEN-LAST:event_jButton_informationActionPerformed

    private void jButton_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mediaActionPerformed
       Panel_principal.setVisible(false);
       Media.Panel_media.setVisible(true);
    }//GEN-LAST:event_jButton_mediaActionPerformed

    private void jButton_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metierActionPerformed
       Panel_principal.setVisible(false);
       Metier.Panel_metier.setVisible(true);
    }//GEN-LAST:event_jButton_metierActionPerformed

    private void jButton_typemediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_typemediaActionPerformed
       Panel_principal.setVisible(false);
       Type_Media.Panel_type_media.setVisible(true);
    }//GEN-LAST:event_jButton_typemediaActionPerformed

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
    private javax.swing.JPanel Panel_principal;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
