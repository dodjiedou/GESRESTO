
package Entites;
/***********************************************************************
 * Module:  MatierPremiere.java
 * Author:  francois
 * Purpose: Defines the Class MatierPremiere
 ***********************************************************************/

import java.sql.Blob;
import java.util.*;

public class MatierPremiere {
   private String designationMp;
   private double prixAchat;
   private byte[] imageFac;
   private int IDFournisseur;

    public MatierPremiere(String designationMp, 
            double prixAchat, byte[] imageFac,int IDFournisseur) {
        this.designationMp = designationMp;
        this.prixAchat = prixAchat;
        this.imageFac = imageFac;
        this.IDFournisseur=IDFournisseur;
    }

    public String getDesignationMp() {
        return designationMp;
    }

    public void setDesignationMp(String designationMp) {
        this.designationMp = designationMp;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public byte[] getImageFac() {
        return imageFac;
    }

    public void setImageFac(byte[] imageFac) {
        this.imageFac = imageFac;
    }

    public int getIDFournisseur() {
        return IDFournisseur;
    }

    public void setIDFournisseur(int IDFournisseur) {
        this.IDFournisseur = IDFournisseur;
    }
   
   
}