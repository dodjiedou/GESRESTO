package Entites;
/***********************************************************************
 * Module:  Categorie.java
 * Author:  francois
 * Purpose: Defines the Class Categorie
 ***********************************************************************/

import java.sql.Blob;
import java.util.*;

public class Categorie {
   
   private String libCat;
   private String descCat;
   private byte[] imgCat;
   
   
   
   public Categorie(String libCat,
           String descCat,byte[] imgCat){
       
       this.descCat=descCat;
       this.libCat=libCat;
       this.imgCat=imgCat;
       
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

    public byte[] getImgCat() {
        return imgCat;
    }

    public void setImgCat(byte[] imgCat) {
        this.imgCat = imgCat;
    }
     
}