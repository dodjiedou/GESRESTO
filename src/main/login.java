/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DatabaseOperation.UserDb;
import javax.swing.JOptionPane;

/**
 *
 * @author francois
 */
public class login extends javax.swing.JFrame {
     
    
    
    /**
     * public String getAccueil() {
        return accueil;
    }
     * Creates new form login
     */
    public login() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        passWord = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 110, 116, 28));

        UserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jPanel5.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 142, 215, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" PassWord");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 182, 116, 28));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_male_user_64.png"))); // NOI18N
        jLabel3.setText(" ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 70, 80));

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel5.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 80, -1));

        annuler.setText("annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });
        jPanel5.add(annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("login");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, -1));
        jPanel5.add(passWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/B E/4.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 340));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 280, 340));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_close_window_32.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EXIT(evt);
            }
        });
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/B E/admin1.jpg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXIT(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXIT
        System.exit(0);
    }//GEN-LAST:event_EXIT

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       String type;
       String ac;
       
       try{
            type=UserDb.login(UserName.getText(),passWord.getText());
                switch (type) {
                case "Admin":
                   AdminUI ad = new AdminUI();
                   ad.setVisible(true);
                   UserDb.setAccueil("Admin");
                   this.dispose();
                    break;
                case "Gerant":
                    GerantUI st = new GerantUI ();
                    st.setVisible(true);
                    UserDb.setAccueil("Gerant");
                    this.dispose();
                 
                    break;
                case "Serveur":
                    CommandeUi cm = new CommandeUi();
                    cm.setVisible(true);
                    UserDb.setAccueil("Serveur");
                    this.dispose();
                   
                    break;
                default:
                    JOptionPane.showMessageDialog(this,"identifiant ou mot de passe incorrect","Information",JOptionPane.INFORMATION_MESSAGE);    
                   
                    break;
            }
            
          //  JOptionPane.showMessageDialog(this,"Ajout éffectué avec succes","Information",JOptionPane.INFORMATION_MESSAGE);           
            } catch (Exception e) {
            System.out.println("ExecutantGui.ajouterActionPerformed() "+e.getMessage());
            JOptionPane.showMessageDialog(this,"identifiant ou mot de passe incorrect","Ereur",JOptionPane.ERROR_MESSAGE);
            }

        
                 
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserName;
    private javax.swing.JButton annuler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passWord;
    // End of variables declaration//GEN-END:variables
}
