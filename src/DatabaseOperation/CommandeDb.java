/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Article;
import Entites.Commande;
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
public class CommandeDb {
    private static Statement state;
    private static PreparedStatement prepare;

    
    public static void ajouterCommande(Commande a) {
      try{

            String sql="INSERT INTO commande (IDPersonnel,dateCommande,mntCommande) VALUES (?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1,a.getIdpersonne());
            prepare.setString(2,a.getDateCommande());
            prepare.setDouble(3,a.getMntCommande());
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
   public static List<Commande>  consulterCommande() {
     ArrayList<Commande> commande =new ArrayList<>();
        Commande a;
       
        try {
            
                String req="SELECT IDPersonnel,dateCommande,mntCommande FROM commande";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new Commande(
                    res.getInt("IDPersonnel"),
                    res.getString("dateCommande"),
                    res.getDouble("mntCommande"));
                    commande.add(a);
                }
                return commande;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
   
   public static void modifierCommande(Commande a,int id) {
      try {
            String sql="UPDATE commande SET dateCommande=?,mntCommande=? WHERE IDCommande=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1, a.getDateCommande());
            prepare.setDouble(2, a.getMntCommande());
            prepare.setInt(3, id);
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
   
   public static boolean supprimerCommande(int id) {
      try {
            
            String sql="DELETE FROM commande WHERE IDCommande=?";
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
