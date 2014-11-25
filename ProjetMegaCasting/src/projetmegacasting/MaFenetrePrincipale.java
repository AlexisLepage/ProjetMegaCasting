/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetmegacasting;

/**
 *
 * @author
 * HP
 */
public class MaFenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates
     * new
     * form
     * MaFenetrePrincipale
     */
    public MaFenetrePrincipale() {
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

        jMenu1 = new javax.swing.JMenu();
        Panneau_principal = new javax.swing.JPanel();
        Bouton_menu_ajouter = new javax.swing.JButton();
        Bouton_menu_modifier = new javax.swing.JButton();
        Bouton_menu_supprimer = new javax.swing.JButton();
        Bouton_menu_lister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Bouton_menu_rechercher = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Panneau_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panneau_principal.setLayout(null);
        getContentPane().add(Panneau_principal);
        Panneau_principal.setBounds(641, 0, 102, 250);

        Bouton_menu_ajouter.setText("Ajouter");
        Bouton_menu_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_menu_ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(Bouton_menu_ajouter);
        Bouton_menu_ajouter.setBounds(0, 250, 120, 80);

        Bouton_menu_modifier.setText("Modifier");
        getContentPane().add(Bouton_menu_modifier);
        Bouton_menu_modifier.setBounds(120, 250, 120, 80);

        Bouton_menu_supprimer.setText("Supprimer");
        getContentPane().add(Bouton_menu_supprimer);
        Bouton_menu_supprimer.setBounds(480, 250, 120, 80);

        Bouton_menu_lister.setText("Lister");
        getContentPane().add(Bouton_menu_lister);
        Bouton_menu_lister.setBounds(240, 250, 120, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\background.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 250);

        Bouton_menu_rechercher.setText("Rechercher");
        getContentPane().add(Bouton_menu_rechercher);
        Bouton_menu_rechercher.setBounds(360, 250, 120, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_menu_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_menu_ajouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bouton_menu_ajouterActionPerformed

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
    private javax.swing.JPanel Panneau_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
