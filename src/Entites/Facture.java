package Entites;
/***********************************************************************
 * Module:  Facture.java
 * Author:  francois
 * Purpose: Defines the Class Facture
 ***********************************************************************/

import java.util.*;

public class Facture {
   private int idFac;
   public int idCmd;

    public Facture(int idFac,int idCmd) {
        this.idFac = idFac;
        this.idCmd = idCmd;
    }

    public int getIdFac() {
        return idFac;
    }

    public void setIdFac(int idFac) {
        this.idFac = idFac;
    }

    public int getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }
   
   
   
}