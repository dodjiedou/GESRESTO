/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Facture;
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
public class FactureDb {
     private static Statement state;
    private static PreparedStatement prepare;
    
    public static void ajouterFacture(Facture a) {
      try{

            String sql="INSERT INTO facture (IDFacture,IDCommande) VALUES (?,?)";
            prepare = getConnection().prepareStatement(sql);
            prepare.setInt(1,a.getIdFac());
            prepare.setInt(2,a.getIdCmd());
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }
      
   }
   
   public static List<Facture> consulterFacture() {
      ArrayList<Facture> facture =new ArrayList<>();
        Facture a;
       
        try {
            
                String req="SELECT IDFacture,IDCommande FROM article";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new Facture(
                    res.getInt("IDFacture"),
                    res.getInt("IDCommande"));
                    facture.add(a);
                }
                return facture;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

   }

    
}
