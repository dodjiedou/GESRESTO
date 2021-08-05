/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Article;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArticleDb {
    private static Statement state;
    private static PreparedStatement prepare;
    //Connexion con=new Connexion();
    
    public static void ajouterArticle(Article a){
     try{

            String sql="INSERT INTO article (IDArticle,IDCategorie,lbArt,descripArticle,prixUnitaire,imgArt) VALUES (?,?,?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            
            prepare.setInt(1,a.getIdCategorie());
            prepare.setString(2,a.getLibArt());
            prepare.setString(3,a.getDescripArticle());
            prepare.setDouble(4,a.getPrixUnitaire());
            prepare.setBytes(5,a.getImgArt());
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
    public static List<Article> consulterArticle() {
      ArrayList<Article> article =new ArrayList<>();
        Article a;
       
        try {
            
                String req="SELECT IDArticle,IDCategorie,lbArt,descripArticle, prixUnitaire,imgArt FROM article";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new Article(
                    
                    res.getInt("IDCategorie"),
                    res.getString("lbArt"),
                    res.getString("descripArticle"),
                    res.getDouble("prixUnitaire"),
                    res.getBytes("imgArt"));
                    article.add(a);
                }
                return article;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }

      
   public static void modifierArticle(Article a) {
      try {
            String sql="UPDATE article SET IDCategorie=?, lbArt=?,descripArticle=?,prixUnitaire=? WHERE IDArticle=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, a.getIdCategorie());
            prepare.setString(2, a.getLibArt());
            prepare.setString(3, a.getDescripArticle());
            prepare.setDouble(4, a.getPrixUnitaire());
            prepare.setInt(5, a.getIdArt());
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
   public static boolean supprimerArticle(int id) {
      try {
            
            String sql="DELETE FROM article WHERE IDArticle=?";
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
