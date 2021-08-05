package Entites;
/***********************************************************************
 * Module:  Fourniseur.java
 * Author:  francois
 * Purpose: Defines the Class Fourniseur
 ***********************************************************************/

import java.sql.Blob;
import java.util.*;

public class Fourniseur {
   private String societe;
   private String nomFour;
   private String prenomFour;
   private int telFour;
   private String mail;
   private byte[] imgFour;
   private String adresseFour;

    public Fourniseur(String societe, String nomFour, String prenomFour, int telFour, String mail, byte[] imgFour, String adresseFour) {
        this.societe = societe;
        this.nomFour = nomFour;
        this.prenomFour = prenomFour;
        this.telFour = telFour;
        this.mail = mail;
        this.imgFour = imgFour;
        this.adresseFour = adresseFour;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getNomFour() {
        return nomFour;
    }

    public void setNomFour(String nomFour) {
        this.nomFour = nomFour;
    }

    public String getPrenomFour() {
        return prenomFour;
    }

    public void setPrenomFour(String prenomFour) {
        this.prenomFour = prenomFour;
    }

    public int  getTelFour() {
        return telFour;
    }

    public void setTelFour(int telFour) {
        this.telFour = telFour;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public byte[] getImgFour() {
        return imgFour;
    }

    public void setImgFour(byte[] imgFour) {
        this.imgFour = imgFour;
    }

    public String getAdresseFour() {
        return adresseFour;
    }

    public void setAdresseFour(String adresseFour) {
        this.adresseFour = adresseFour;
    }
   
    
   
   
}