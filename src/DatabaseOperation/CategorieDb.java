
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Article;
import Entites.Categorie;
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
public class CategorieDb {
     private static Statement state;
    private static PreparedStatement prepare;

    
    public static void ajouterCategorie(Categorie categorie ){
      try{

            String sql="INSERT INTO categorie (libCat,descCat,imgCat) VALUES (?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1,categorie.getLibCat());
            prepare.setString(2,categorie.getDescCat());
            prepare.setBytes(3,categorie.getImgCat());  
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
   public static List<Categorie> consulterCategorie() {
      ArrayList<Categorie> categorie  =new ArrayList<>();
        Categorie c;
       
        try {
            
                String req="SELECT libCat,desCat,imgCat FROM categorie";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    c=new Categorie(
                    
                    res.getString("libCat"),
                    res.getString("desCat"),
                    res.getBytes("imgCat"));
                    categorie.add(c);
                }
                return categorie;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
   
   public static void modifierCategorie(Categorie a,int id) {
      try {
            String sql="UPDATE Categorie SET IDCategorie=?, libCat=?,desCat=?,imgCat=? WHERE IDCategorie=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, id);
            prepare.setString(2, a.getLibCat());
            prepare.setString(3, a.getDescCat());
            prepare.setBytes(4, a.getImgCat());
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public static boolean supprimerCategorie(int id) {
     try {
            
            String sql="DELETE FROM Categorie WHERE IDCategorie=?";
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
