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

            String sql="INSERT INTO fournisseur (nomFour,prenomFour,societe,telFour,mail,imgFour,adresseFour) VALUES (?,?,?,?,?,?,?,?)";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1,a.getNomFour());
            prepare.setString(2,a.getPrenomFour());
            prepare.setString(3,a.getSociete());
            prepare.setInt(4,a.getTelFour());
            prepare.setString(5,a.getMail());
            prepare.setBytes(6,a.getImgFour());
            prepare.setString(7,a.getAdresseFour());
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
   
   public static void modifierFourniseur(Fourniseur a,int id) {
       
       try {
            String sql="UPDATE fournisseur SET nomFour=?,prenomFour=?,societe=?,telFour=?,mail=?,imgFour=?,adresseFour=?  WHERE IDFournisseur=?";
            prepare =getConnection().prepareStatement(sql);
            prepare.setString(1, a.getNomFour());
            prepare.setString(2, a.getPrenomFour());
            prepare.setString(3, a.getSociete());
            prepare.setInt(4, a.getTelFour());
            prepare.setString(5, a.getMail());
            prepare.setBytes(6, a.getImgFour());
            prepare.setString(7, a.getAdresseFour());
            prepare.setInt(8,id);
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

    

