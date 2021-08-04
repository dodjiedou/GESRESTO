package Entites;

/***********************************************************************
 * Module:  composer.java
 * Author:  francois
 * Purpose: Defines the Class composer
 ***********************************************************************/

import java.util.*;

public class composer {
   private int quantite;
   public Article articleB;

    public composer(int quantite, Article articleB) {
        this.quantite = quantite;
        this.articleB = articleB;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Article getArticleB() {
        return articleB;
    }

    public void setArticleB(Article articleB) {
        this.articleB = articleB;
    }
   
   

}