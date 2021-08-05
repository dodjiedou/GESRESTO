/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import Entites.Categorie;
import Entites.LigneComm;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDOU Dodji
 */
public class LigneCommDb {
    
    private static PreparedStatement prepare;
    
    public static void modifierLigneComm(LigneComm l) {
      try {
            String sql="UPDATE article_commande SET qteCmd=? WHERE IDCommandee=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(2, l.getQteCmd());
            prepare.setInt(1, l.getId_com());
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    
}
