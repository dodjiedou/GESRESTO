/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Article;
import Entites.Personnel;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDOU Dodji
 */
public class PersonnelDb {
    
    private static Statement state;
    private static PreparedStatement prepare;
    //Connexion con=new Connexion();
    
    public static void ajouterPersonnel(Personnel a){
     try{

            String sql="INSERT INTO personnel ("
                    + "nom,prenom,userName,password,tel,Email,"
                    + "dateEmbauche,salaireMensuel,imagePesonnel,"
                    + "adresse,type) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1,a.getNom());
            prepare.setString(2,a.getPrenom());
            prepare.setString(3,a.getUserName());
            prepare.setString(4,a.getPassword());
            prepare.setInt(5, (int) a.getTel());
            prepare.setString(6,a.getEmail());
            prepare.setString(7, a.getDatEmbauch());
            prepare.setDouble(8,a.getSalaireMensuel());
            prepare.setBytes(9,a.getImgPesonnel());
            prepare.setString(10,a.getAdresse());
            prepare.setString(11,a.getType());
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
    public static List<Personnel> consulterPersonnel() {
      ArrayList<Personnel> personnel =new ArrayList<>();
        Personnel a;
       
        try {
            
                String req="SELECT * FROM personnel";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new Personnel(
                    res.getString("nom"),
                    res.getString("prenom"),
                    res.getString("userName"),
                    res.getString("password"),
                    res.getInt("tel"),
                    res.getString("Email"),
                    res.getString("dateEmbauche"),
                    res.getDouble("salaireMensuel"), 
                    res.getBytes("imagePesonnel"),
                    res.getString("adresse"),
                    res.getString("type"));
                    personnel.add(a);
                }
                return personnel;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
   
    
     public static DefaultTableModel tablePersonn(){
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("IDENTIFIANT");
        model1.addColumn("NOM");
        model1.addColumn("PRENOM");
        model1.addColumn("USERNAME");
        model1.addColumn("PASSWORD");
        model1.addColumn("TELEPHONE");
        model1.addColumn("E_MAIL");
        model1.addColumn("DATE D'EMBAUCHE");
        model1.addColumn("SALAIRE");
        model1.addColumn("PHOTO");
        model1.addColumn("ADRESSE");
        model1.addColumn("TYPE");

          try{
            String req="SELECT * FROM personnel";
            ResultSet res=getStatement().executeQuery(req);
            while(res.next()){
                model1.addRow(new Object[]{
                    res.getInt("IDpersonnel"),
                    res.getString("nom"),
                    res.getString("prenom"),
                    res.getString("userName"),
                    res.getString("password"),
                    res.getInt("tel"),
                    res.getString("Email"),
                    res.getString("dateEmbauche"),
                    res.getDouble("salaireMensuel"), 
                    res.getBytes("imagePesonnel"),
                    res.getString("adresse"),
                    res.getString("type")});
            }
            return model1;
        } catch (SQLException ex) {
            Logger.getLogger(PersonnelDb.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null; 
   }
   
//      
   public static void modifierPersonnel(Personnel a,int id) {
      try {
            String sql="UPDATE personnel SET "
                    + " nom=?,prenom=?,userName=?,password=?,tel=?,Email=?,"
                    + "dateEmbauche=?,salaireMensuel=?,imagePesonnel=?,"
                    + " adresse=?,type=?"
                    + "WHERE IDPersonnel=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1, a.getNom());
            prepare.setString(2, a.getPrenom());
            prepare.setString(3, a.getUserName());
            prepare.setString(4, a.getPassword());
            prepare.setInt(5, (int) a.getTel());
            prepare.setString(6, a.getEmail());
            prepare.setString(7,a.getDatEmbauch());
            prepare.setDouble(8, a.getSalaireMensuel());
            prepare.setBytes(9, a.getImgPesonnel());
            prepare.setString(10, a.getAdresse());
            prepare.setString(11, a.getType());
            prepare.setInt(12,id);
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
   public static boolean supprimerPersonnel(int id) {
      try {
          
            
            String sql="DELETE FROM personnel WHERE IDPersonnel=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, id);
            prepare.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
   }
   
   
   public static String login(String username,String password){
      String type="";
      int i=0;
       try {
            
           String req="SELECT type FROM "
           + "personnel WHERE UserName=? and PassWord=?  ";
                        
           prepare =getConnection().prepareStatement(req);
           prepare.setString(1,username);
           prepare.setString(2,password);
            ResultSet res2=prepare.executeQuery();
                while(res2.next()){
                   type=res2.getString("type");
                }
                return type;
                
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
  private static String accueil="";
     public static String getAccueil() {
        return accueil;
    }

    public static void setAccueil(String ac) {
        accueil = ac;
    }
     
   
    public static boolean valider(String mail,String phone) {
       String email="^[a-z]{5,}[0-9]{2,4}@[a-z]{5,10}\\.[a-z]{2,5}$";
       String nb="^(9|7){1}[0-9]{7}$";
       Pattern patt1=Pattern.compile(nb);
       Pattern patt=Pattern.compile(email);
       Matcher match1=patt1.matcher(phone);
       Matcher match=patt.matcher(mail);
       if(match.matches()|(match1.matches())){   
           return true;
       }else{
          return false; 
       }
    }

    
}
