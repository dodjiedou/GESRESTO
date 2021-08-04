package Entites;
/***********************************************************************
 * Module:  Fourniseur.java
 * Author:  francois
 * Purpose: Defines the Class Fourniseur
 ***********************************************************************/

import java.sql.Blob;
import java.util.*;

public class Fourniseur {
   private int idFour;
   private String societe;
   private String nomFour;
   private String prenomFour;
   private int telFour;
   private String mail;
   private Blob imgFour;
   private String adresseFour;

    public Fourniseur(int idFour, String societe, String nomFour, String prenomFour, int telFour, String mail, Blob imgFour, String adresseFour) {
        this.idFour = idFour;
        this.societe = societe;
        this.nomFour = nomFour;
        this.prenomFour = prenomFour;
        this.telFour = telFour;
        this.mail = mail;
        this.imgFour = imgFour;
        this.adresseFour = adresseFour;
    }

    public int getIdFour() {
        return idFour;
    }

    public void setIdFour(int idFour) {
        this.idFour = idFour;
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

    public Blob getImgFour() {
        return imgFour;
    }

    public void setImgFour(Blob imgFour) {
        this.imgFour = imgFour;
    }

    public String getAdresseFour() {
        return adresseFour;
    }

    public void setAdresseFour(String adresseFour) {
        this.adresseFour = adresseFour;
    }
   
    
   
   
}