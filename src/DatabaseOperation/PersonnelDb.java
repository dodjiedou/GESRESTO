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
                    + "nom,prenom,tel,Email,"
                    + "dateEmbauche,salaireMensuel,imagePesonnel,"
                    + "adresse,type) VALUES (?,?,?,?,?,?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1,a.getNom());
            prepare.setString(2,a.getPrenom());
            prepare.setInt(3, (int) a.getTel());
            prepare.setString(4,a.getEmail());
            prepare.setString(5, a.getDatEmbauch());
            prepare.setDouble(6,a.getSalaireMensuel());
            prepare.setBytes(7,a.getImgPesonnel());
            prepare.setString(8,a.getAdresse());
            prepare.setString(9,a.getType());
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

      
   public static void modifierPersonnel(Personnel a) {
      try {
            String sql="UPDATE personnel SET "
                    + " nom=?,prenom=?,tel=?,Email=?,"
                    + "dateEmbauche=?,alaireMensuel=?,imagePesonnel=?,"
                    + " adresse=?,type=?"
                    + "WHERE IDPersonnele=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1, a.getNom());
            prepare.setString(2, a.getPrenom());
            prepare.setInt(3, (int) a.getTel());
            prepare.setString(4, a.getEmail());
            prepare.setString(5,a.getDatEmbauch());
            prepare.setDouble(6, a.getSalaireMensuel());
            prepare.setBytes(7, a.getImgPesonnel());
            prepare.setString(8, a.getAdresse());
            prepare.setString(9, a.getType());
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
   public static boolean supprimerPersonnel(int id) {
      try {
          
            
            String sql="DELETE FROM personnel WHERE IDArticle=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, id);
            prepare.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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
