package Entites;

/***********************************************************************
 * Module:  LigneComm.java
 * Author:  francois
 * Purpose: Defines the Class LigneComm
 ***********************************************************************/

import java.util.*;

public class LigneComm {
   private int qteCmd;
   public int  id_art;
   public int id_com;

    public LigneComm(int qteCmd, int id_art, int id_com) {
        this.qteCmd = qteCmd;
        this.id_art = id_art;
        this.id_com = id_com;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    public int getId_art() {
        return id_art;
    }

    public void setId_art(int id_art) {
        this.id_art = id_art;
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
    }

    
  

}