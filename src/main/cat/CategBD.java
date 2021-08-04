/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opérations;

import Entites.Categorie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author francois
 */
public class CategBD {
     Connection conn = ConectionBD.getConnection();
    PreparedStatement statement = null;
    ResultSet result = null;
 
    
     public void ajouterCategorie(Categorie cat) {
      try {
            String ajouterCategorie = "insert into categorie (libCat,descCat,imgFac) values (?,?,?)"; 

            // System.out.println(">>>>>>>>>> "+ insertRoomTypeQuery);
             statement = conn.prepareStatement(ajouterCategorie);
            // statement.setInt(0,cat.getIdCat());
             statement.setString(1,cat.getLibCat());
             statement.setString(2,cat.getDescCat());
             statement.setBytes(3,cat.getImgCat());
            statement.execute();
            JOptionPane.showMessageDialog(null, "successfully inserted a new insertItem");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery of insertItem Failed");
        }
       finally
      {
      flushStatmentOnly();
      }
   }
      public void consulterCategorie() {
      // TODO: implement
   }
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
   public void modifierCategorie(Categorie cat) {
      try {
            String updateFood = "update categorie set libCat= '" + cat.getLibCat() + "', descCat= " + cat.getDescCat() + "imgFac = '" + cat.getImgCat() + "' where idCat = " + cat.getIdCat();

            // System.out.println(">>>>>>>>>> "+ insertRoomTypeQuery);
          PreparedStatement statement = conn.prepareStatement(updateFood);

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "successfully updateitem ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update Item failed");
        }
       finally
      {
      flushStatmentOnly();
      }
   }
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////
      public ResultSet getItems() {
        try {
            String query = "SELECT * FROM categorie";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all item DB Operation");
        }

        return result;
    }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public void supprimerCategorie(int catId) {
      try {
            String deleteQuery = "DELETE FROM categorie WHERE idCat=" + catId;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Deleted categorie");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query Item Failed");
        }
        finally
        {
            flushStatmentOnly();
        }
   }
   ////////////////////////////////////////////////////////////////////////////////////////////////////////
    
     public void flushAll()
    {
        {
                        try
                        {
                            statement.close();
                            result.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void flushStatmentOnly()
    {
        {
                        try
                        {
                            statement.close();
                             
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
