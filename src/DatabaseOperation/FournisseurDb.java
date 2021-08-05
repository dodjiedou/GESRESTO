/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseOperation;

import static DatabaseOperation.Connexion.getConnection;
import static DatabaseOperation.Connexion.getStatement;
import Entites.Article;
import Entites.Fourniseur;
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
public class FournisseurDb {
    
    private static Statement state;
    private static PreparedStatement prepare;

    
    public static void ajouterFourniseur(Fourniseur a) {
        
        try{

            String sql="INSERT INTO fournisseur (IDFournisseur,nomFour,prenomFour,societe,telFour,mail,imgFour,adresseFour) VALUES (?,?,?,?,?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1,a.getIdFour());
            prepare.setString(2,a.getNomFour());
            prepare.setString(3,a.getPrenomFour());
            prepare.setString(4,a.getSociete());
            prepare.setInt(5,a.getTelFour());
            prepare.setString(6,a.getMail());
            prepare.setBytes(7,a.getImgFour());
            prepare.setString(8,a.getAdresseFour());
            prepare.executeUpdate();
            prepare.close();  
        }catch(SQLException ex){
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE,null,ex);
        }

      
   }
   
   public static List<Fourniseur>  consulterFourniseur() {
       
       ArrayList<Fourniseur> fourniseur =new ArrayList<>();
        Fourniseur a;
       
        try {
            
                String req="SELECT IDFournisseur,nomFour,prenomFour,societe,telFour,mail,imgFour,adresseFour FROM fournisseur";
                ResultSet res=getStatement().executeQuery(req);
                while(res.next()){
                    a=new Fourniseur(
                    res.getInt("IDFournisseur"),
                    res.getString("nomFour"),
                    res.getString("prenomFour"),
                    res.getString("societe"),
                    res.getInt("telFour"),
                    res.getString("mail"),
                    res.getBytes("imgFour"),
                    res.getString("adresseFour"));
                    fourniseur.add(a);
                }
                return fourniseur;        
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

      
   }
   
   public static void modifierFourniseur(Fourniseur a) {
       
       try {
            String sql="UPDATE fournisseur SET IDFournisseur=?,nomFour=?,prenomFour=?,societe=?,telFour=?,mail=?,imgFour=?,adresseFour=?  WHERE IDFournisseur=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setInt(1, a.getIdFour());
            prepare.setString(2, a.getNomFour());
            prepare.setString(3, a.getPrenomFour());
            prepare.setString(4, a.getSociete());
            prepare.setInt(5, a.getTelFour());
            prepare.setString(6, a.getMail());
            prepare.setBytes(7, a.getImgFour());
            prepare.setString(8, a.getAdresseFour());
            prepare.executeUpdate();           
            
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
   }
   
   public static boolean supprimerFourniseur(int id) {
       
       try {
            
            String sql="DELETE FROM fournisseur WHERE IDFournisseur=?";
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

    

