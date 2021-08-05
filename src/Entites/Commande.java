package Entites;
/***********************************************************************
 * Module:  Commande.java
 * Author:  francois
 * Purpose: Defines the Class Commande
 ***********************************************************************/

import java.util.*;

public class Commande {
   private String dateCommande;
   private double mntCommande;
   private int idpersonne;
   

    public Commande(int idpersonne, String dateCommande,
            double mntCommande)
             {
        this.idpersonne=idpersonne;
        this.dateCommande = dateCommande;
        this.mntCommande = mntCommande;
        
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

    
    public int getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }
    
    
    /*private double getMontant(){
        double sum=0;
	    	for (int i=0;i<ligneCom.size();i++){
	             sum = ligneCom.get(i).getQteCmd()*
	            ligneCom.get(i).getArticle().
                            getPrixUnitaire();
	            }
	    	return sum;
    }*/
  
   

}