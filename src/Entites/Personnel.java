
package Entites;

/***********************************************************************
 * Module:  Personnel.java
 * Author:  francois
 * Purpose: Defines the Class Personnel
 ***********************************************************************/

import java.io.FileInputStream;
import java.sql.Date;


public class Personnel {
   private String nom;
   private String prenom;
   private Number tel;
   private String Email;
   private String datEmbauch;
   private double salaireMensuel;
   private byte[] imgPesonnel;
   private String adresse;
   private String type;

    public Personnel( String nom, 
            String prenom, int tel, String Email, String datEmbauch,
            double salaireMensuel,byte[]  imgPesonnel,
            String adresse,String type) {
    
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.Email = Email;
        this.datEmbauch = datEmbauch;
        this.salaireMensuel = salaireMensuel;
        this.imgPesonnel = imgPesonnel;
        this.adresse = adresse;
        this.type= type; 
      }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Number getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


    public String getDatEmbauch() {
        return datEmbauch;
    }

    public void setDatEmbauch(String datEmbauch) {
        this.datEmbauch = datEmbauch;
    }

    public double getSalaireMensuel() {
        return salaireMensuel;
    }

    public void setSalaireMensuel(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }

    public byte[] getImgPesonnel() {
        return imgPesonnel;
    }

    public void setImgPesonnel(byte[] imgPesonnel) {
        this.imgPesonnel = imgPesonnel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
   
   
   
}