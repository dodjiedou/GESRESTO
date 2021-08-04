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

            String sql="INSERT INTO commande (IDCommande,IDPersonnel,dateCommande,mntCommande,etatCommande) VALUES (?,?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1,a.getIdCmd());
            prepare.setInt(2,a.getIdpersonne());
            prepare.setString(3,a.getDateCommande());
            prepare.setDouble(4,a.getMntCommande());
            prepare.setString(5,a.getEtatCommande());
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
            
                String req="SELECT IDCommande,IDPersonnel,dateCommande,mntCommande,etatCommande FROM commande";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new Commande(
                    res.getInt("IDCommande"),
                    res.getInt("IDPersonnel"),
                    res.getString("dateCommande"),
                    res.getDouble("mntCommande"),
                    res.getString("etatCommande"));
                    commande.add(a);
                }
                return commande;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
   
   public static void modifierCommande(Commande a) {
      try {
            String sql="UPDATE commande SET IDCommande=?, IDPersonnel=?,dateCommande=?,mntCommande=?,etatCommande=? WHERE IDCommande=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, a.getIdCmd());
            prepare.setInt(2, a.getIdpersonne());
            prepare.setString(3, a.getDateCommande());
            prepare.setDouble(4, a.getMntCommande());
            prepare.setString(5, a.getEtatCommande());
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
