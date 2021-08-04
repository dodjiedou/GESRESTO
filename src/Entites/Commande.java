package Entites;
/***********************************************************************
 * Module:  Commande.java
 * Author:  francois
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import java.util.*;

public class Commande {
   private int idCmd;
   private String dateCommande;
   private double mntCommande;
   private String etatCommande;
   private int idpersonne;
   private ArrayList<LigneComm> ligneCom ;

    public Commande(int idCmd,int idpersonne, String dateCommande,
            double mntCommande, String etatCommande,
            ArrayList<LigneComm> ligneCom) {
        this.idCmd = idCmd;
        this.idpersonne=idpersonne;
        this.dateCommande = dateCommande;
        this.mntCommande = mntCommande;
        this.etatCommande = etatCommande;
        this.ligneCom = ligneCom;
    }

    public Commande(int aInt, int aInt0, String string, double aDouble, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public int getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    public String getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(String dateCommande) {
        this.dateCommande = dateCommande;
    }

    public double getMntCommande() {
        return mntCommande;
    }

    public void setMntCommande(double mntCommande) {
        this.mntCommande = mntCommande;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    public ArrayList<LigneComm> getLigneCom() {
        return ligneCom;
    }

    public void setLigneCom(ArrayList<LigneComm> ligneCom) {
        this.ligneCom = ligneCom;
    }

    public int getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }
    
    
    private double getMontant(){
        double sum=0;
	    	for (int i=0;i<ligneCom.size();i++){
	             sum = ligneCom.get(i).getQteCmd()*
	            ligneCom.get(i).getArticle().
                            getPrixUnitaire();
	            }
	    	return sum;
    }
  
   

}