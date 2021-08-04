/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DatabaseOperation.Connexion;
import DatabaseOperation.PersonnelDb;
import DatabaseOperation.UserDb;
import Entites.Personnel;
import Entites.User;
//import Entites.PersonnelUI ;
import java.awt.Font;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author proxc
 */
public class PersonnelUI extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    byte[] person_image = null;
   // #^[a-z]{5,}[0-9]{2,4}@[a-z]{5,10}\.[a-z]{2,5}$#",$_POST['mail']))
    public PersonnelUI() {
        initComponents();
        new JTable().setBackground(new java.awt.Color(0,0,0,0));
        
        table_pers.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        table_pers.getTableHeader().setOpaque(false);
        table_pers.getTableHeader().setBackground(new java.awt.Color(153,153,153));
        table_pers.getTableHeader().setForeground(new java.awt.Color(255,255,255));
        table_pers.setRowHeight(25);
    }
    
     private void emptyForm(){
            nom.setText(""); 
            prenom.setText("");
            phone.setText("");
            mail.setText("");
            date.setText("");
            salaire.setText(""); 
            photo.setIcon(null);
            adresse.setText("");
            username.setText("");
            password.setText("");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        salaire = new javax.swing.JTextField();
        ajouter = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        restaurer = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        choisir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pers = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_staff1_48.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 60));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personnel");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 28));

        jPanel8.setBackground(new java.awt.Color(0, 51, 255));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_undo_48.png"))); // NOI18N
        jLabel1.setText("Retour");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 130, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Embauche");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 110, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UserName");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 100, 30));

        photo.setBackground(new java.awt.Color(255, 255, 255));
        photo.setOpaque(true);
        jPanel3.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 180, 150));

        nom.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel3.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 30));

        salaire.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        salaire.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        salaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaireActionPerformed(evt);
            }
        });
        jPanel3.add(salaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, 30));

        ajouter.setBackground(new java.awt.Color(153, 153, 153));
        ajouter.setForeground(new java.awt.Color(0, 51, 255));
        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_plus_math_32.png"))); // NOI18N
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ajouterMousePressed(evt);
            }
        });
        jPanel3.add(ajouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 40));

        modifier.setBackground(new java.awt.Color(153, 153, 153));
        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_sort_by_modified_date_32.png"))); // NOI18N
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifierMousePressed(evt);
            }
        });
        jPanel3.add(modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, 40));

        restaurer.setBackground(new java.awt.Color(153, 153, 153));
        restaurer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_update_left_rotation_32.png"))); // NOI18N
        restaurer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restaurerMousePressed(evt);
            }
        });
        restaurer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurerActionPerformed(evt);
            }
        });
        jPanel3.add(restaurer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 70, 40));

        supprimer.setBackground(new java.awt.Color(153, 153, 153));
        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_delete_trash_32.png"))); // NOI18N
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                supprimerMousePressed(evt);
            }
        });
        jPanel3.add(supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 70, 40));

        choisir.setBackground(new java.awt.Color(204, 204, 204));
        choisir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        choisir.setText("....");
        choisir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                choisirMousePressed(evt);
            }
        });
        choisir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choisirActionPerformed(evt);
            }
        });
        jPanel3.add(choisir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 90, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("type_User");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 90, 20));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salaire Mensuel");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 110, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Prénom");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 30));

        prenom.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        prenom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        jPanel3.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, 30));

        password.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 150, 30));

        username.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 130, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Adresse");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 50, 30));

        adresse.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        adresse.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PassWord");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 90, 30));

        jTextField7.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 130, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        phone.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Téléphone");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Téléphone");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 80, 30));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("E_Mail");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 20));

        mail.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        mail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mailKeyPressed(evt);
            }
        });
        jPanel3.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir", "Gerant", "Admin", "Serveur", "Cuisinier", " " }));
        type.setToolTipText("");
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 120, 30));
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\JAVA_WORK\\NETBEANSPROJECTS\\GESTRESTO\\src\\main\\images\\B E\\4.3.jpg")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 250));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_pers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idFour", "Société", "Nom", "Prénom", "Adresse", "Téléphone", "E_mail"
            }
        ));
        jScrollPane1.setViewportView(table_pers);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, 250));

        jLabel8.setBackground(new java.awt.Color(51, 102, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Filtre");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 40));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 240, 40));

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libellé", "catégorie", "type", "prix" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, 40));

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8_search_32.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 70, 40));

        jLabel9.setText("jLabel9");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/B E/magasinier01.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 340));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, 340));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       new AdminUI().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
          
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
     
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        String type;
      type=UserDb.getAccueil();
        switch (type) {
                case "Admin":
                   new AdminUI().setVisible(true);
                   this.dispose();
                    break;
                case "Gerant":
                    new GerantUI ().setVisible(true);
                    this.dispose();
                 
                    break;
                
                default:
                    new CommandeUi().setVisible(true);
                    this.dispose();
                    break;
            }
        
    }//GEN-LAST:event_jLabel1MousePressed
     
    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); 
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        setColor(jPanel8);
       
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
       resetColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void salaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaireActionPerformed

    private void choisirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choisirActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename =f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_DEFAULT));
        photo.setIcon(imageIcon);
       try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();

    }//GEN-LAST:event_choisirActionPerformed
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

    }
  }
    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void ajouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMousePressed
      //recuperation de la date saisie et son formatage
      //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
      //String dateDuJour;
      //dateDuJour = sdf.format(date.getText());
     //Creation d'un personnel
      Personnel personnel;
      personnel=new Personnel(
            nom.getText(), 
            prenom.getText(),
            Integer.parseInt(phone.getText()),
            mail.getText(),
            date.getText(),
            Double.parseDouble(salaire.getText()), 
            person_image,
            adresse.getText(),
            type.getSelectedItem().toString()
             );
        try{
            
            PersonnelDb.ajouterPersonnel(personnel);
            
           if("Admin".equals(type.getSelectedItem().toString())
               ||"Gerant".equals(type.getSelectedItem().toString())
               ||"Serveur".equals(type.getSelectedItem().toString())){
                
                //Creation d'un user
               User user;
               user=new User(
                username.getText(),
                password.getText(),
                nom.getText(), 
                prenom.getText(),
                Integer.parseInt(phone.getText()),
                mail.getText(), 
                date.getText(),
                Double.parseDouble(salaire.getText()), 
                person_image,
                adresse.getText(),
                type.getSelectedItem().toString()
               );
               UserDb.ajouterUser(user);
           }
           JOptionPane.showMessageDialog(this,"Ajout éffectué avec succes","Information",JOptionPane.INFORMATION_MESSAGE);    
           emptyForm();
        } catch (Exception e) {
            System.out.println("ExecutantGui.ajouterActionPerformed() "+e.getMessage());
            JOptionPane.showMessageDialog(this,"Ajout échoué","Ereur",JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_ajouterMousePressed

    private void modifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierMousePressed

    private void restaurerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaurerMousePressed
            emptyForm();
    }//GEN-LAST:event_restaurerMousePressed

    private void supprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerMousePressed

    private void choisirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choisirMousePressed
       
    }//GEN-LAST:event_choisirMousePressed

    private void restaurerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurerActionPerformed

    private void mailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyPressed
       String email="#^[a-z]{5,}[0-9]{2,4}@[a-z]{5,10}\\.[a-z]{2,5}$#\"";
       Pattern patt=Pattern.compile(email);
       Matcher match=patt.matcher(mail.getText());
       if(!match.matches()){
           
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_mailKeyPressed

     
     public void setColor(JPanel panel)
     {
       panel.setBackground(new java.awt.Color(197, 197, 197));
     }
 
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(45,118,232));
 }
 //nous allons bouger la fenetre 
 int xx,xy;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JButton ajouter;
    private javax.swing.JButton choisir;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField mail;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField prenom;
    private javax.swing.JButton restaurer;
    private javax.swing.JTextField salaire;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable table_pers;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    
}
