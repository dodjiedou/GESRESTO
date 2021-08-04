/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Personnel;
import Entites.User;
import java.io.FileInputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDOU Dodji
 */
public class UserDb {
    
   private static Statement state;
    private static PreparedStatement prepare;
    //Connexion con=new Connexion();
    
    public static void ajouterUser(User a){
     try{
         int i=0;
          String req ;
          req="SELECT IDPersonnel FROM personnel ";
          req+= "ORDER BY IDPersonnel DESC ";
          req+= " LIMIT 0,1";
          ResultSet result =getStatement().executeQuery(req);
            while (result.next()) {
                i=result.getInt(1);
            }

            String sql="INSERT INTO user ("
                    + "UserName,PassWord,IDPersonnel) VALUES (?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1,a.getUserName());
            prepare.setString(2,a.getPassword());
            prepare.setInt(3, i);
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
    public static List<User> consulterUser() {
      ArrayList<User> user =new ArrayList<>();
        User a;
       
        try {
            
                String req="SELECT u.IDUser,u.UserName,"
                        + "u.PassWord,u.IDPersonnel"
                        + "p.nom,p.prenom,p.tel,p.Email,"
                        + "p.dateEmbauche,p.salaireMensuel"
                        + "p.imagePesonnel,p.adresse,p.type FROM user u "
                        + "INNER JOIN personnel p"
                        + "ON u.IDPersonnel=p.IDPersonnel";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new User(     
                    res.getString("UserName"),
                    res.getString("PassWord"),
                    res.getString("nom"),
                    res.getString("prenom"),
                    res.getInt("tel"),
                    res.getString("Email"),
                    res.getString("dateEmbauche"),
                    res.getDouble("salaireMensuel"), 
                    res.getBytes("imagePesonnel"),
                    res.getString("adresse"),
                    res.getString("adresse"));
                    user.add(a);
                }
                return user;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }

      
   public static void modifierUser(User a) {
      try {
            String sql="UPDATE user SET"
                    + " UserName=?,PassWord=? WHERE IDUser=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1, a.getUserName());
            prepare.setString(2, a.getPassword());
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
   public static boolean supprimerUser(int id) {
      try {
            
            String sql="DELETE FROM user WHERE IDPersonnel=?";
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
            
           String req1="SELECT IDPersonnel FROM user WHERE UserName=? and PassWord=?"; 
           prepare =getConnection().prepareStatement(req1);
           prepare.setString(1,username);
           prepare.setString(2,password);
           ResultSet res1=prepare.executeQuery();
                while(res1.next()){
                   i=res1.getInt("IDPersonnel");
                }
             

           String req2="SELECT type FROM "
                   + "personnel WHERE IDPersonnel=?  ";
                        
           prepare =getConnection().prepareStatement(req2);
           prepare.setInt(1,i);
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
     
    
}
