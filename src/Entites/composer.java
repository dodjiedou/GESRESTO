package Entites;

/***********************************************************************
 * Module:  composer.java
 * Author:  francois
 * Purpose: Defines the Class composer
 ***********************************************************************/

import java.util.*;

public class composer {
   private int quantite;
   public int idArt;
   public int idMp;

    public composer(int quantite, int idArt, int idMp) {
        this.quantite = quantite;
        this.idArt = idArt;
        this.idMp = idMp;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getIdArt() {
        return idArt;
    }

    public void setIdArt(int idArt) {
        this.idArt = idArt;
    }

    public int getIdMp() {
        return idMp;
    }

    public void setIdMp(int idMp) {
        this.idMp = idMp;
    }

       

}