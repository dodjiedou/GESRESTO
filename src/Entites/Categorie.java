package Entites;
/***********************************************************************
 * Module:  Categorie.java
 * Author:  francois
 * Purpose: Defines the Class Categorie
 ***********************************************************************/

import java.sql.Blob;
import java.util.*;

public class Categorie {
   private int idCat;
   private String libCat;
   private String descCat;
   private Blob imgCat;
   
   
   
   public Categorie(int idCat,String libCat,
           String descCat,Blob imgCat){
       this.idCat=idCat;
       this.descCat=descCat;
       this.libCat=libCat;
       this.imgCat=imgCat;
       
   }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getLibCat() {
        return libCat;
    }

    public void setLibCat(String libCat) {
        this.libCat = libCat;
    }

    public String getDescCat() {
        return descCat;
    }

    public void setDescCat(String descCat) {
        this.descCat = descCat;
    }

    public Blob getImgCat() {
        return imgCat;
    }

    public void setImgCat(Blob imgCat) {
        this.imgCat = imgCat;
    }
     
}