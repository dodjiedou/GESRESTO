package Entites;

/***********************************************************************
 * Module:  LigneComm.java
 * Author:  francois
 * Purpose: Defines the Class LigneComm
 ***********************************************************************/

import java.util.*;

public class LigneComm {
   private int qteCmd;
   public Article article;

    public LigneComm(int qteCmd, Article article) {
        this.qteCmd = qteCmd;
        this.article = article;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
   
  

}