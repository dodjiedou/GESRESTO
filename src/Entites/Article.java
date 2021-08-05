package Entites;
/***********************************************************************
 * Module:  Article.java
 * Author:  francois
 * Purpose: Defines the Class Article
 ***********************************************************************/

import java.math.BigInteger;
import java.sql.Blob;
import java.util.*;

public class Article {
   
   private String libArt;
   private String descripArticle;
   private double prixUnitaire;
   private byte[] imgArt;
   private int IdCategorie;
//,byte imgArt
          
    public Article(int idCategorie,String libArt,String descripArt,
           double prixUnitaire,byte[] imgArt){
       
       this.libArt=libArt;
       this.descripArticle=descripArt;
       this.prixUnitaire=prixUnitaire;
       this.imgArt=imgArt;
       this.IdCategorie=idCategorie;
   }
   
   

    public String getLibArt() {
        return libArt;
    }

    public String getDescripArticle() {
        return descripArticle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public byte[] getImgArt() {
        return imgArt;
    }
    public int getIdCategorie() {
        return IdCategorie;
        
    }
    
    
    public void setLibArt(String libArt) {
        this.libArt = libArt;
    }

    public void setDescripArticle(String descripArticle) {
        this.descripArticle = descripArticle;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setImgArt(byte[] imgArt) {
        this.imgArt = imgArt;
    }
   public void setIdCategorie(int idCategorie) {
        this.IdCategorie = idCategorie;
    }

    
    
   
     
}