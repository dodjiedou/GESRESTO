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
   private int idArt;
   private String libArt;
   private String descripArticle;
   private double prixUnitaire;
   private Blob imgArt;
   private int IdCategorie;
//,byte imgArt
          
    public Article(int idArt,int idCategorie,String libArt,String descripArt,
           double prixUnitaire,Blob imgArt){
       this.idArt=idArt;
       this.libArt=libArt;
       this.descripArticle=descripArt;
       this.prixUnitaire=prixUnitaire;
       this.imgArt=imgArt;
       this.IdCategorie=idCategorie;
   }
   
   public int getIdArt() {
        return idArt;
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

    public Blob getImgArt() {
        return imgArt;
    }
    public int getIdCategorie() {
        return IdCategorie;
        
    }
    
    public void setIdArt(int idArt) {
        this.idArt = idArt;
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

    public void setImgArt(Blob imgArt) {
        this.imgArt = imgArt;
    }
   public void setIdCategorie(int idCategorie) {
        this.IdCategorie = idCategorie;
    }

    @Override
    public String toString() {
        return "Article{" + "idArt=" + idArt + ", libArt=" + libArt + ", descripArticle=" + descripArticle + ", prixUnitaire=" + prixUnitaire + ", imgArt=" + imgArt + ", IdCategorie=" + IdCategorie + '}';
    }

    
   
     
}