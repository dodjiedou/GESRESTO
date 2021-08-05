/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Article;
import Entites.MatierPremiere;
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
public class MatierPremiereDb {
    
   private static PreparedStatement prepare;
   
    
    public static void ajouter(MatierPremiere a){
     try{

            String sql="INSERT INTO matierepremiere (IDFournisseur,designationMp,PrixAchat,imageFac) VALUES (?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1,a.getIDFournisseur());
            prepare.setString(2,a.getDesignationMp());
            prepare.setDouble(3,a.getPrixAchat());
            prepare.setBytes(4,a.getImageFac());
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
    public static List<MatierPremiere> consulter() {
      ArrayList<MatierPremiere> mp =new ArrayList<>();
        MatierPremiere a;
       
        try {
            
                String req="SELECT * FROM matierepremiere";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new MatierPremiere(
                    res.getString("designationMp"),
                    res.getDouble("PrixAchat"),
                    res.getBytes("imageFac"),
                    res.getInt("IDFournisseur"));
                    mp.add(a);
                }
                return mp;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }

      
   public static void modifier(MatierPremiere a,int id) {
      try {
            String sql="UPDATE matierepremiere SET IDFournisseur=?,designationMp=?,PrixAchat=?,imageFac=? WHERE IDMatierePremiere=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, a.getIDFournisseur());
            prepare.setString(2, a.getDesignationMp());
            prepare.setDouble(3, a.getPrixAchat());
            prepare.setBytes(4, a.getImageFac());
            prepare.setInt(5,id);
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
   public static boolean supprimer(int id) {
      try {
            
            String sql="DELETE FROM matierepremiere WHERE IDArticle=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, id);
            prepare.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
   }

    
}
