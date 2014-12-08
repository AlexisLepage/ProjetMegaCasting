/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Annonceur;
import Class.Domaine;
import Class.Information;
import ClassDAO.AnnonceurDAO;
import ClassDAO.InformationDAO;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 * Alexis
 */
public class AnnonceurForm extends javax.swing.JPanel {

    private MaFenetrePrincipale mafenetreprincipal;

    public AnnonceurForm(MaFenetrePrincipale mafenetreprincipal) {
        this.mafenetreprincipal = mafenetreprincipal;
        initComponents();
        
    }
    
   
    /**
     * Creates
     * new
     * form
     * Annonceur
     */
    public AnnonceurForm() {
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

        jPanel_annonceur = new javax.swing.JPanel();
        jTabbedPane_annonceur = new javax.swing.JTabbedPane();
        jPanel_annonceur_modifier = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField_modfier_identifiant = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField_modifier_nom = new javax.swing.JTextField();
        jButton_modifier_annonceur = new javax.swing.JButton();
        jPanel_annonceur_rechercher = new javax.swing.JPanel();
        jButton_rechercher_annonceur = new javax.swing.JButton();
        jPanel87 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField_rechercher_annonceur_nom = new javax.swing.JTextField();
        jPanel84 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_id = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_nom = new javax.swing.JTextField();
        jTextField_rechercher_resultat_id_info = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_email = new javax.swing.JTextField();
        jTextField_rechercher_resultat_telfixe = new javax.swing.JTextField();
        jTextField_rechercher_resultat_telport = new javax.swing.JTextField();
        jTextField_rechercher_resultat_rue = new javax.swing.JTextField();
        jTextField_rechercher_resultat_ville = new javax.swing.JTextField();
        jTextField_rechercher_resultat_cp = new javax.swing.JTextField();
        jTextField_rechercher_resultat_pays = new javax.swing.JTextField();
        jPanel_annonceur_supprimer = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField_supprimer_annonceur = new javax.swing.JTextField();
        jButton_spprimer_annonceur = new javax.swing.JButton();
        jPanel_annonceur_ajouter = new javax.swing.JPanel();
        jPanel_ajouter_information = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_ajouter_telfixe = new javax.swing.JTextField();
        jTextField_ajouter_rue = new javax.swing.JTextField();
        jTextField_ajouter_mail = new javax.swing.JTextField();
        jTextField_ajouter_telport = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_ajouter_ville = new javax.swing.JTextField();
        jTextField_ajouter_cp = new javax.swing.JTextField();
        jTextField_ajouter_pays = new javax.swing.JTextField();
        jPanel_ajouter_annonceur = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFiel_ajouter_nom = new javax.swing.JTextField();
        jButton_ajouter_anonceur = new javax.swing.JButton();
        jPanel_annonceur_lister = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_annonceur = new javax.swing.JTable();
        jButton_lister_annonceur = new javax.swing.JButton();
        jButton_retour_annonceur = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(720, 480));

        jPanel_annonceur.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur.setPreferredSize(new java.awt.Dimension(720, 500));

        jTabbedPane_annonceur.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane_annonceur.setForeground(new java.awt.Color(51, 51, 51));

        jPanel_annonceur_modifier.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_annonceur_modifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_modifier.setForeground(new java.awt.Color(153, 153, 153));

        jPanel80.setBackground(new java.awt.Color(153, 153, 153));
        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel80.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Annonceur");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("nom :");

        jTextField_modfier_identifiant.setForeground(new java.awt.Color(51, 51, 51));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setText("Identifiant :");

        jTextField_modifier_nom.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_modfier_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modfier_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE))))
        );

        jButton_modifier_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_annonceur.setText("Modifier");
        jButton_modifier_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceur_modifierLayout = new javax.swing.GroupLayout(jPanel_annonceur_modifier);
        jPanel_annonceur_modifier.setLayout(jPanel_annonceur_modifierLayout);
        jPanel_annonceur_modifierLayout.setHorizontalGroup(
            jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_annonceur_modifierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_modifier_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        jPanel_annonceur_modifierLayout.setVerticalGroup(
            jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton_modifier_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Modifier", jPanel_annonceur_modifier);

        jPanel_annonceur_rechercher.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_annonceur_rechercher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_rechercher.setForeground(new java.awt.Color(153, 153, 153));

        jButton_rechercher_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_rechercher_annonceur.setText("Rechercher");
        jButton_rechercher_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_annonceurActionPerformed(evt);
            }
        });

        jPanel87.setBackground(new java.awt.Color(153, 153, 153));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel87.setForeground(new java.awt.Color(255, 255, 255));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(51, 51, 51));
        jLabel107.setText("Annonceur");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(51, 51, 51));
        jLabel108.setText("Recherche par nom :");

        jTextField_rechercher_annonceur_nom.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField_rechercher_annonceur_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_annonceur_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel84.setBackground(new java.awt.Color(153, 153, 153));
        jPanel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel84.setForeground(new java.awt.Color(255, 255, 255));

        jLabel95.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Résultat");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("Identifiant :");

        jTextField_rechercher_resultat_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("Nom :");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(51, 51, 51));
        jLabel105.setText("Id information:");

        jTextField_rechercher_resultat_nom.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_id_info.setForeground(new java.awt.Color(51, 51, 51));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(51, 51, 51));
        jLabel106.setText("Email :");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(51, 51, 51));
        jLabel109.setText("Téléphone fixe :");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(51, 51, 51));
        jLabel110.setText("Téléphone portable :");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(51, 51, 51));
        jLabel111.setText("Rue :");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
        jLabel114.setText("Ville :");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(51, 51, 51));
        jLabel115.setText("Code postal :");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(51, 51, 51));
        jLabel116.setText("Pays :");

        jTextField_rechercher_resultat_email.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_telfixe.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_telport.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_rue.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_ville.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_cp.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_pays.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addContainerGap())
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(jLabel111)
                            .addComponent(jLabel114)
                            .addComponent(jLabel115)
                            .addComponent(jLabel116)
                            .addComponent(jLabel109)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel103))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel84Layout.createSequentialGroup()
                                .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                            .addGroup(jPanel84Layout.createSequentialGroup()
                                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_id_info, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_telport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_rechercher_resultat_id_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_telport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_annonceur_rechercherLayout = new javax.swing.GroupLayout(jPanel_annonceur_rechercher);
        jPanel_annonceur_rechercher.setLayout(jPanel_annonceur_rechercherLayout);
        jPanel_annonceur_rechercherLayout.setHorizontalGroup(
            jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_annonceur_rechercherLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton_rechercher_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_annonceur_rechercherLayout.setVerticalGroup(
            jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jButton_rechercher_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Rechercher", jPanel_annonceur_rechercher);

        jPanel_annonceur_supprimer.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_annonceur_supprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_supprimer.setForeground(new java.awt.Color(153, 153, 153));

        jPanel86.setBackground(new java.awt.Color(153, 153, 153));
        jPanel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel86.setForeground(new java.awt.Color(255, 255, 255));

        jLabel112.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
        jLabel112.setText("Annonceur");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
        jLabel113.setText("Id de l'annonceur :");

        jTextField_supprimer_annonceur.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112)
                    .addGroup(jPanel86Layout.createSequentialGroup()
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField_supprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addComponent(jLabel112)
                .addGap(27, 27, 27)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_supprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jButton_spprimer_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_spprimer_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_spprimer_annonceur.setText("Supprimer");
        jButton_spprimer_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_spprimer_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceur_supprimerLayout = new javax.swing.GroupLayout(jPanel_annonceur_supprimer);
        jPanel_annonceur_supprimer.setLayout(jPanel_annonceur_supprimerLayout);
        jPanel_annonceur_supprimerLayout.setHorizontalGroup(
            jPanel_annonceur_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton_spprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel_annonceur_supprimerLayout.setVerticalGroup(
            jPanel_annonceur_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_spprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jTabbedPane_annonceur.addTab("Supprimer", jPanel_annonceur_supprimer);

        jPanel_annonceur_ajouter.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_annonceur_ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_ajouter.setForeground(new java.awt.Color(153, 153, 153));
        jPanel_annonceur_ajouter.setPreferredSize(new java.awt.Dimension(695, 375));
        jPanel_annonceur_ajouter.setRequestFocusEnabled(false);

        jPanel_ajouter_information.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_ajouter_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_ajouter_information.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Information");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("adresse mail");

        jTextField_ajouter_telfixe.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_ajouter_telfixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ajouter_telfixeActionPerformed(evt);
            }
        });

        jTextField_ajouter_rue.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_mail.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_telport.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_ajouter_telport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ajouter_telportActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("portable");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("téléphone fixe");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("nom de rue");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("ville");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("code postal");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("pays");

        jTextField_ajouter_ville.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_cp.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_pays.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_ajouter_informationLayout = new javax.swing.GroupLayout(jPanel_ajouter_information);
        jPanel_ajouter_information.setLayout(jPanel_ajouter_informationLayout);
        jPanel_ajouter_informationLayout.setHorizontalGroup(
            jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ajouter_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ajouter_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ajouter_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ajouter_telport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_ajouter_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel_ajouter_informationLayout.setVerticalGroup(
            jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ajouter_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ajouter_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ajouter_telport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ajouter_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ajouter_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ajouter_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel_ajouter_annonceur.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_ajouter_annonceur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_ajouter_annonceur.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Annonceur");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("nom annonceur");

        jTextFiel_ajouter_nom.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_ajouter_annonceurLayout = new javax.swing.GroupLayout(jPanel_ajouter_annonceur);
        jPanel_ajouter_annonceur.setLayout(jPanel_ajouter_annonceurLayout);
        jPanel_ajouter_annonceurLayout.setHorizontalGroup(
            jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFiel_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ajouter_annonceurLayout.setVerticalGroup(
            jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(27, 27, 27)
                .addGroup(jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiel_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jButton_ajouter_anonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_anonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_anonceur.setText("Ajouter");
        jButton_ajouter_anonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_anonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceur_ajouterLayout = new javax.swing.GroupLayout(jPanel_annonceur_ajouter);
        jPanel_annonceur_ajouter.setLayout(jPanel_annonceur_ajouterLayout);
        jPanel_annonceur_ajouterLayout.setHorizontalGroup(
            jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_annonceur_ajouterLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel_ajouter_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton_ajouter_anonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPanel_ajouter_information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel_annonceur_ajouterLayout.setVerticalGroup(
            jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addComponent(jPanel_ajouter_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton_ajouter_anonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_ajouter_information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Ajouter", jPanel_annonceur_ajouter);

        jPanel_annonceur_lister.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_annonceur_lister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_lister.setForeground(new java.awt.Color(153, 153, 153));

        jPanel82.setBackground(new java.awt.Color(153, 153, 153));
        jPanel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel82.setForeground(new java.awt.Color(255, 255, 255));

        jLabel85.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(51, 51, 51));
        jLabel85.setText("Annonceur");

        jTable_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jTable_annonceur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identifiant annonceur", "Nom annonceur", "Identifiant information", "Email", "Téléphone fixe", "Téléphone portable", "Rue", "Ville", "Code Postal", "Pays"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_annonceur);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel82Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_lister_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_lister_annonceur.setText("Lister");
        jButton_lister_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceur_listerLayout = new javax.swing.GroupLayout(jPanel_annonceur_lister);
        jPanel_annonceur_lister.setLayout(jPanel_annonceur_listerLayout);
        jPanel_annonceur_listerLayout.setHorizontalGroup(
            jPanel_annonceur_listerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jButton_lister_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_annonceur_listerLayout.setVerticalGroup(
            jPanel_annonceur_listerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton_lister_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane_annonceur.addTab("Lister", jPanel_annonceur_lister);

        jButton_retour_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_retour_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_retour_annonceur.setText("Retour");
        jButton_retour_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceurLayout = new javax.swing.GroupLayout(jPanel_annonceur);
        jPanel_annonceur.setLayout(jPanel_annonceurLayout);
        jPanel_annonceurLayout.setHorizontalGroup(
            jPanel_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_annonceur)
                .addContainerGap())
            .addGroup(jPanel_annonceurLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton_retour_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_annonceurLayout.setVerticalGroup(
            jPanel_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_annonceur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_retour_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_annonceur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ajouter_anonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_anonceurActionPerformed
             
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            Information information = new Information(jTextField_ajouter_mail.getText(),Integer.parseInt(jTextField_ajouter_telfixe.getText()), Integer.parseInt(jTextField_ajouter_telport.getText()), jTextField_ajouter_rue.getText(), jTextField_ajouter_ville.getText(), Integer.parseInt(jTextField_ajouter_cp.getText()), jTextField_ajouter_pays.getText());          
            Annonceur annonceur = new Annonceur(jTextFiel_ajouter_nom.getText(), information);
                   
            AnnonceurDAO.CreerAnnonceur(cnx, annonceur);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !"); 
        
       RetourMenu();
        
    }//GEN-LAST:event_jButton_ajouter_anonceurActionPerformed

    private void jButton_retour_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_annonceurActionPerformed
       RetourMenu();
    }//GEN-LAST:event_jButton_retour_annonceurActionPerformed

    private void jButton_modifier_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_annonceurActionPerformed
       
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Information information = null;          
            Annonceur annonceur =  new Annonceur(jTextField_modifier_nom.getText(), information);         
            annonceur.setId_anonceur(Integer.parseInt(jTextField_modfier_identifiant.getText()));
            
            AnnonceurDAO.ModifierAnnonceur(cnx, annonceur);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !");  
        RetourMenu();
    }//GEN-LAST:event_jButton_modifier_annonceurActionPerformed

    private void jButton_lister_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_annonceurActionPerformed
        
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
             
            DefaultTableModel model = (DefaultTableModel) jTable_annonceur.getModel();

            AnnonceurDAO annonceurDAO = new AnnonceurDAO();
            Collection<Annonceur> annonceurs = AnnonceurDAO.ListerAnonceur(cnx);


            for (Annonceur a : annonceurs){
                model.addRow(new Object[] {
                    a.getId_anonceur(),
                    a.getNom_annonceur(),
                    a.getInformation().getId_information(),
                    a.getInformation().getMail_information(),
                    a.getInformation().getTel_fixe_information(),
                    a.getInformation().getTel_port_information(),
                    a.getInformation().getRue_information(),
                    a.getInformation().getVille_information(),
                    a.getInformation().getCp_information(),
                    a.getInformation().getPays_information()
                
                });

            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !");                                                                   
       
    }//GEN-LAST:event_jButton_lister_annonceurActionPerformed

    private void jButton_rechercher_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_annonceurActionPerformed
       
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Annonceur annonceur = AnnonceurDAO.TrouverAnnonceurNom(cnx, jTextField_rechercher_annonceur_nom.getText());
            jTextField_rechercher_resultat_id.setText(Long.toString(annonceur.getId_anonceur()));
            jTextField_rechercher_resultat_nom.setText(jTextField_rechercher_annonceur_nom.getText());
            jTextField_rechercher_resultat_id_info.setText(Long.toString(annonceur.getInformation().getId_information()));
            jTextField_rechercher_resultat_email.setText(annonceur.getInformation().getMail_information());
            jTextField_rechercher_resultat_telfixe.setText(Long.toString(annonceur.getInformation().getTel_fixe_information()));
            jTextField_rechercher_resultat_telport.setText(Long.toString(annonceur.getInformation().getTel_port_information()));
            jTextField_rechercher_resultat_rue.setText(annonceur.getInformation().getRue_information());
            jTextField_rechercher_resultat_ville.setText(annonceur.getInformation().getVille_information());
            jTextField_rechercher_resultat_cp.setText(Long.toString(annonceur.getInformation().getCp_information()));
            jTextField_rechercher_resultat_pays.setText(annonceur.getInformation().getPays_information());
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !");     
    }//GEN-LAST:event_jButton_rechercher_annonceurActionPerformed

    private void jButton_spprimer_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_spprimer_annonceurActionPerformed
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Annonceur annonceur  = AnnonceurDAO.TrouverAnnonceurId(cnx, Integer.parseInt(jTextField_supprimer_annonceur.getText()));
            AnnonceurDAO.SupprimerAnnonceur(cnx, annonceur);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !"); 
        RetourMenu();
    }//GEN-LAST:event_jButton_spprimer_annonceurActionPerformed

    private void TextFieldBlanc(){
        jTextFiel_ajouter_nom.setText("");
        jTextField_ajouter_mail.setText("");
        jTextField_ajouter_telfixe.setText("");
        jTextField_ajouter_telport.setText("");
        jTextField_ajouter_rue.setText("");
        jTextField_ajouter_ville.setText("");
        jTextField_ajouter_cp.setText("");
        jTextField_ajouter_pays.setText("");
        jTextField_modfier_identifiant.setText("");
        jTextField_modifier_nom.setText("");
        jTextField_rechercher_annonceur_nom.setText("");
        jTextField_rechercher_resultat_cp.setText("");
        jTextField_rechercher_resultat_email.setText("");
        jTextField_rechercher_resultat_id.setText("");
        jTextField_rechercher_resultat_id_info.setText("");
        jTextField_rechercher_resultat_nom.setText("");
        jTextField_rechercher_resultat_pays.setText(""); 
        jTextField_rechercher_resultat_rue.setText("");
        jTextField_rechercher_resultat_telfixe.setText("");
        jTextField_rechercher_resultat_telport.setText("");
        jTextField_rechercher_resultat_ville.setText("");
        jTextField_supprimer_annonceur.setText("");
   }
    
    private void RetourMenu(){
        TextFieldBlanc();
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }
    
    private void jTextField_ajouter_telfixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ajouter_telfixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ajouter_telfixeActionPerformed

    private void jTextField_ajouter_telportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ajouter_telportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ajouter_telportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_anonceur;
    private javax.swing.JButton jButton_lister_annonceur;
    private javax.swing.JButton jButton_modifier_annonceur;
    private javax.swing.JButton jButton_rechercher_annonceur;
    private javax.swing.JButton jButton_retour_annonceur;
    private javax.swing.JButton jButton_spprimer_annonceur;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel_ajouter_annonceur;
    private javax.swing.JPanel jPanel_ajouter_information;
    protected javax.swing.JPanel jPanel_annonceur;
    private javax.swing.JPanel jPanel_annonceur_ajouter;
    private javax.swing.JPanel jPanel_annonceur_lister;
    private javax.swing.JPanel jPanel_annonceur_modifier;
    private javax.swing.JPanel jPanel_annonceur_rechercher;
    private javax.swing.JPanel jPanel_annonceur_supprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane_annonceur;
    private javax.swing.JTable jTable_annonceur;
    private javax.swing.JTextField jTextFiel_ajouter_nom;
    private javax.swing.JTextField jTextField_ajouter_cp;
    private javax.swing.JTextField jTextField_ajouter_mail;
    private javax.swing.JTextField jTextField_ajouter_pays;
    private javax.swing.JTextField jTextField_ajouter_rue;
    private javax.swing.JTextField jTextField_ajouter_telfixe;
    private javax.swing.JTextField jTextField_ajouter_telport;
    private javax.swing.JTextField jTextField_ajouter_ville;
    private javax.swing.JTextField jTextField_modfier_identifiant;
    private javax.swing.JTextField jTextField_modifier_nom;
    private javax.swing.JTextField jTextField_rechercher_annonceur_nom;
    private javax.swing.JTextField jTextField_rechercher_resultat_cp;
    private javax.swing.JTextField jTextField_rechercher_resultat_email;
    private javax.swing.JTextField jTextField_rechercher_resultat_id;
    private javax.swing.JTextField jTextField_rechercher_resultat_id_info;
    private javax.swing.JTextField jTextField_rechercher_resultat_nom;
    private javax.swing.JTextField jTextField_rechercher_resultat_pays;
    private javax.swing.JTextField jTextField_rechercher_resultat_rue;
    private javax.swing.JTextField jTextField_rechercher_resultat_telfixe;
    private javax.swing.JTextField jTextField_rechercher_resultat_telport;
    private javax.swing.JTextField jTextField_rechercher_resultat_ville;
    private javax.swing.JTextField jTextField_supprimer_annonceur;
    // End of variables declaration//GEN-END:variables
}
